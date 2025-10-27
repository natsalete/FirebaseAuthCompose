package com.example.firebaseauthcompose.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.firebaseauthcompose.repository.AuthRepository
import com.example.firebaseauthcompose.repository.AuthResult
import com.google.firebase.auth.FirebaseUser
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

data class AuthState(
    val isLoading: Boolean = false,
    val user: FirebaseUser? = null,
    val error: String? = null,
    val isAuthenticated: Boolean = false
)

class AuthViewModel : ViewModel() {
    private val repository = AuthRepository()

    private val _authState = MutableStateFlow(AuthState())
    val authState: StateFlow<AuthState> = _authState.asStateFlow()

    init {
        checkAuthStatus()
    }

    private fun checkAuthStatus() {
        val currentUser = repository.getCurrentUser()
        _authState.value = AuthState(
            user = currentUser,
            isAuthenticated = currentUser != null
        )
    }

    fun signUp(email: String, password: String) {
        if (!validateInput(email, password)) return

        viewModelScope.launch {
            _authState.value = _authState.value.copy(isLoading = true, error = null)

            when (val result = repository.signUp(email, password)) {
                is AuthResult.Success -> {
                    _authState.value = AuthState(
                        user = result.user,
                        isAuthenticated = true,
                        isLoading = false
                    )
                }
                is AuthResult.Error -> {
                    _authState.value = _authState.value.copy(
                        isLoading = false,
                        error = result.message
                    )
                }
            }
        }
    }

    fun signIn(email: String, password: String) {
        if (!validateInput(email, password)) return

        viewModelScope.launch {
            _authState.value = _authState.value.copy(isLoading = true, error = null)

            when (val result = repository.signIn(email, password)) {
                is AuthResult.Success -> {
                    _authState.value = AuthState(
                        user = result.user,
                        isAuthenticated = true,
                        isLoading = false
                    )
                }
                is AuthResult.Error -> {
                    _authState.value = _authState.value.copy(
                        isLoading = false,
                        error = result.message
                    )
                }
            }
        }
    }

    fun signOut() {
        repository.signOut()
        _authState.value = AuthState()
    }

    fun clearError() {
        _authState.value = _authState.value.copy(error = null)
    }

    private fun validateInput(email: String, password: String): Boolean {
        if (email.isBlank() || password.isBlank()) {
            _authState.value = _authState.value.copy(
                error = "Email e senha não podem estar vazios"
            )
            return false
        }

        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            _authState.value = _authState.value.copy(
                error = "Email inválido"
            )
            return false
        }

        if (password.length < 6) {
            _authState.value = _authState.value.copy(
                error = "A senha deve ter pelo menos 6 caracteres"
            )
            return false
        }

        return true
    }
}