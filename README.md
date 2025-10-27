<details>
<summary>🇧🇷 Versão em Português</summary>

# 🔐 Firebase Authentication App

Aplicativo Android de autenticação de usuários desenvolvido com **Jetpack Compose** e **Firebase Authentication**.

![Android](https://img.shields.io/badge/Platform-Android-green.svg)
![Kotlin](https://img.shields.io/badge/Language-Kotlin-purple.svg)
![Jetpack Compose](https://img.shields.io/badge/UI-Jetpack%20Compose-blue.svg)
![Firebase](https://img.shields.io/badge/Backend-Firebase-orange.svg)
![License](https://img.shields.io/badge/License-MIT-yellow.svg)

---

## 📱 Sobre o Projeto

Sistema completo de autenticação que permite aos usuários criar contas, fazer login e gerenciar sessões de forma segura utilizando Firebase Authentication. A interface foi construída com Jetpack Compose seguindo os princípios do Material Design 3.

---
## 📸 Screenshots

<p align="center">
  <img src="https://github.com/user-attachments/assets/11bdf190-5721-4f67-82d3-33b005ae333b" alt="Tela de Login" width="250" style="margin-right:10px;"/>
  <img src="https://github.com/user-attachments/assets/98644e7c-5386-44b8-87de-3f3ec975dd46" alt="Tela de Cadastro" width="250" style="margin-right:10px;"/>
  <img src="https://github.com/user-attachments/assets/5df2bcdb-f1ea-4f2b-b6d8-8fe3536fa42f" alt="Tela Inicial" width="250"/>
</p>

---

## ✨ Funcionalidades

- ✅ **Cadastro de usuários** com email e senha
- ✅ **Login** com validação de credenciais
- ✅ **Logout** com limpeza de sessão
- ✅ **Validação de formulários** em tempo real
- ✅ **Mensagens de erro** amigáveis e descritivas
- ✅ **Indicadores de carregamento** durante operações assíncronas
- ✅ **Navegação fluida** entre telas
- ✅ **Persistência de sessão** automática
- ✅ **Interface responsiva** e adaptável
- ✅ **Design moderno** com Material Design 3

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Descrição |
|------------|-----------|
| **Kotlin** | Linguagem de programação |
| **Jetpack Compose** | Framework UI declarativo |
| **Firebase Authentication** | Autenticação de usuários |
| **Navigation Compose** | Navegação entre telas |
| **ViewModel** | Gerenciamento de estado |
| **StateFlow** | Fluxo reativo de dados |
| **Coroutines** | Operações assíncronas |
| **Material Design 3** | Sistema de design |

---

## 🏗️ Arquitetura

O projeto segue a arquitetura **MVVM (Model-View-ViewModel)** com separação clara de responsabilidades:

```
📁 app/src/main/java/com/example/firebaseauthcompose/
│
├── 📄 MainActivity.kt                  # Atividade principal
│
├── 📁 navigation/
│   └── Navigation.kt                   # Configuração de rotas
│
├── 📁 repository/
│   └── AuthRepository.kt               # Lógica de autenticação Firebase
│
├── 📁 viewmodel/
│   └── AuthViewModel.kt                # Gerenciamento de estado
│
└── 📁 ui/screens/
    ├── LoginScreen.kt                  # Tela de login/cadastro
    └── HomeScreen.kt                   # Tela inicial autenticada
```

---

## 🚀 Como Executar o Projeto

### Pré-requisitos

- **Android Studio** Hedgehog ou superior
- **JDK 11** ou superior
- **Conta Firebase** (gratuita)
- **Dispositivo/Emulador** Android (API 24+)

### Passo 1: Clone o Repositório

```bash
git clone https://github.com/natsalete/FirebaseAuthCompose.git
cd FirebaseAuthCompose
```

### Passo 2: Configurar Firebase

1. Acesse o [Firebase Console](https://console.firebase.google.com/)
2. Crie um novo projeto ou use um existente
3. Adicione um app Android com o package name: `com.example.firebaseauthcompose`
4. Baixe o arquivo `google-services.json`
5. Cole o arquivo na pasta `app/` do projeto

### Passo 3: Habilitar Authentication

1. No Firebase Console, vá em **Authentication**
2. Clique em **Get Started**
3. Habilite o método **Email/Password**
4. Salve as configurações

### Passo 4: Sincronizar e Executar

1. Abra o projeto no Android Studio
2. Aguarde a sincronização do Gradle
3. Conecte um dispositivo ou inicie um emulador
4. Clique em **Run** (▶️) ou pressione `Shift + F10`

---

## 📸 Screenshots

### Tela de Login
- Interface limpa e intuitiva
- Validação em tempo real
- Alternância entre login e cadastro

### Tela Inicial
- Mensagem de boas-vindas personalizada
- Exibição do email do usuário
- Botão de logout

---

## 🔒 Segurança

- ✅ Senhas criptografadas pelo Firebase
- ✅ Comunicação HTTPS
- ✅ Validação client-side e server-side
- ✅ Token-based authentication
- ✅ Arquivo `google-services.json` não versionado

---

## 📋 Validações Implementadas

### Email
- Não pode estar vazio
- Deve ter formato válido
- Verificação com regex pattern

### Senha
- Não pode estar vazia
- Mínimo de 6 caracteres
- Opção de visualização (mostrar/ocultar)

---

## 🎨 Design

O aplicativo utiliza **Material Design 3** com:

- 🎨 Paleta de cores moderna
- 🔤 Tipografia hierárquica
- 📐 Espaçamentos consistentes
- ✨ Animações suaves
- 🌙 Componentes adaptativos

---

## 📦 Dependências Principais

```kotlin
// Firebase
implementation(platform("com.google.firebase:firebase-bom:33.5.1"))
implementation("com.google.firebase:firebase-auth-ktx")

// Jetpack Compose
implementation(platform(libs.androidx.compose.bom))
implementation(libs.androidx.ui)
implementation(libs.androidx.material3)

// Navigation
implementation("androidx.navigation:navigation-compose:2.8.3")

// ViewModel
implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.7")

// Coroutines
implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
```

---

## 🧪 Testando o App

### Criar Nova Conta

1. Abra o aplicativo
2. Clique em "Não tem uma conta? Cadastre-se"
3. Digite um email válido
4. Digite uma senha com no mínimo 6 caracteres
5. Clique em "Cadastrar"

### Fazer Login

1. Digite seu email
2. Digite sua senha
3. Clique em "Entrar"

### Verificar no Firebase

Acesse o Firebase Console → Authentication → Users para ver os usuários cadastrados.

---

## 🐛 Problemas Conhecidos

Nenhum problema conhecido no momento. Se encontrar algum bug, por favor [abra uma issue](https://github.com/seu-usuario/firebase-auth-jetpack-compose/issues).

---

## 🔮 Melhorias Futuras

- [ ] Recuperação de senha por email
- [ ] Login com Google
- [ ] Login com Facebook
- [ ] Autenticação de dois fatores (2FA)
- [ ] Verificação de email
- [ ] Perfil de usuário com Firestore
- [ ] Upload de foto de perfil
- [ ] Tema claro/escuro
- [ ] Testes unitários e de integração

---

## 🤝 Contribuindo

Contribuições são sempre bem-vindas! Sinta-se à vontade para:

1. Fazer um fork do projeto
2. Criar uma branch para sua feature (`git checkout -b feature/MinhaFeature`)
3. Commit suas mudanças (`git commit -m 'Adiciona MinhaFeature'`)
4. Push para a branch (`git push origin feature/MinhaFeature`)
5. Abrir um Pull Request

---

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

## 👨‍💻 Autor

Desenvolvido por Natalia Salete

- GitHub: [@natsalete](https://github.com/natsalete)
- LinkedIn: [Natália Santos](https://www.linkedin.com/in/natalia-salete-rodrigues/)
- Email: natsalete14@gmail.com

---

## 📚 Recursos e Referências

- [Documentação Firebase Authentication](https://firebase.google.com/docs/auth)
- [Jetpack Compose Documentation](https://developer.android.com/jetpack/compose)
- [Material Design 3](https://m3.material.io/)
- [Kotlin Coroutines Guide](https://kotlinlang.org/docs/coroutines-guide.html)

---

## ⚠️ Nota Importante

O arquivo `google-services.json` **NÃO** está incluído neste repositório por motivos de segurança. Você precisará criar seu próprio projeto Firebase e adicionar o arquivo conforme as instruções acima.

---

## 💡 Suporte

Se você gostou deste projeto, considere dar uma ⭐️!

Para dúvidas ou sugestões, abra uma [issue](https://github.com/seu-usuario/firebase-auth-jetpack-compose/issues) ou entre em contato.

---

<p align="center">
  Feito com ❤️ e ☕ usando Kotlin & Jetpack Compose
</p>

</details>

# 🔐 Firebase Authentication App

Android user authentication app built with Jetpack Compose and Firebase Authentication.

![Android](https://img.shields.io/badge/Platform-Android-green.svg)
![Kotlin](https://img.shields.io/badge/Language-Kotlin-purple.svg)
![Jetpack Compose](https://img.shields.io/badge/UI-Jetpack%20Compose-blue.svg)
![Firebase](https://img.shields.io/badge/Backend-Firebase-orange.svg)
![License](https://img.shields.io/badge/License-MIT-yellow.svg)

---

## 📱 About the Project

A complete authentication system that allows users to securely create accounts, log in, and manage sessions using Firebase Authentication. The interface was built with Jetpack Compose following the principles of Material Design 3.

---
## 📸 Screenshots

<p align="center"> 
<img src="https://github.com/user-attachments/assets/11bdf190-5721-4f67-82d3-33b005ae333b" alt="Login Screen" width="250" style="margin-right:10px;"/> 
<img src="https://github.com/user-attachments/assets/98644e7c-5386-44b8-87de-3f3ec975dd46" alt="Registration Screen" width="250" style="margin-right:10px;"/> 
<img src="https://github.com/user-attachments/assets/5df2bcdb-f1ea-4f2b-b6d8-8fe3536fa42f" alt="Home Screen" width="250"/>
</p>

---

## ✨ Features

- ✅ **User registration** with email and password
- ✅ **Login** with credential validation
- ✅ **Logout** with session clearing
- ✅ **Real-time form validation**
- ✅ **Friendly and descriptive error messages**
- ✅ **Loading indicators** during asynchronous operations
- ✅ **Fluid navigation** between screens
- ✅ **Automatic session persistence**
- ✅ **Responsive and adaptive interface**
- ✅ **Design Modern** with Material Design 3

---

## 🛠️ Technologies Used

| Technology | Description |
|------------|-----------|
| **Kotlin** | Programming Language |
| **Jetpack Compose** | Declarative UI Framework |
| **Firebase Authentication** | User Authentication |
| **Navigation Compose** | Navigation Between Screens |
| **ViewModel** | State Management |
| **StateFlow** | Reactive Data Flow |
| **Coroutines** | Asynchronous Operations |
| **Material Design 3** | Design System |

---

## 🏗️ Architecture

The project follows the **MVVM (Model-View-ViewModel)** architecture with a clear separation of responsibilities:

```
📁 app/src/main/java/com/example/firebaseauthcompose/
│
├── 📄 MainActivity.kt # Main Activity
│
├── 📁 navigation/
│ └── Navigation.kt # Route Configuration
│
├── 📁 repository/
│ └── AuthRepository.kt # Firebase Authentication Logic
│
├── 📁 viewmodel/
│ └── AuthViewModel.kt # Management status
│
└── 📁 ui/screens/
├── LoginScreen.kt # Login/Registration Screen
└── HomeScreen.kt # Authenticated Home Screen
```

---

## 🚀 How to Run the Project

### Prerequisites

- **Android Studio** Hedgehog or higher
- **JDK 11** or higher
- **Firebase Account** (free)
- **Device/Emulator** Android (API 24+)

### Step 1: Clone the Repository

```bash
git clone https://github.com/natsalete/FirebaseAuthCompose.git
cd FirebaseAuthCompose
```

### Step 2: Configure Firebase

1. Access [Firebase] Console](https://console.firebase.google.com/)
2. Create a new project or use an existing one
3. Add an Android app with the package name: `com.example.firebaseauthcompose`
4. Download the `google-services.json` file
5. Paste the file into the project's `app/` folder

### Step 3: Enable Authentication

1. In the Firebase Console, go to **Authentication**
2. Click **Get Started**
3. Enable the **Email/Password** method
4. Save the settings

### Step 4: Sync and Run

1. Open the project in Android Studio
2. Wait for Gradle to sync
3. Connect a device or launch an emulator
4. Click **Run** (▶️) or press `Shift + F10`

---

## 📸 Screenshots

### Screen Login
- Clean and intuitive interface
- Real-time validation
- Toggle between login and registration

### Home Screen
- Custom welcome message
- Display user email
- Logout button

---

## 🔒 Security

- ✅ Firebase-encrypted passwords
- ✅ HTTPS communication
- ✅ Client-side and server-side validation
- ✅ Token-based authentication
- ✅ Unversioned `google-services.json` file

---

## 📋 Implemented Validations

### Email
- Cannot be empty
- Must be in a valid format
- Verification with regex pattern

### Password
- Cannot be empty
- Minimum of 6 characters
- Display option (show/hide)

---

## 🎨 Design

The app uses **Material Design 3** with:

- 🎨 Modern color palette
- 🔤 Hierarchical typography
- 📐 Consistent spacing
- ✨ Smooth animations
- 🌙 Adaptive components

---

## 📦 Main Dependencies

```kotlin
// Firebase
implementation(platform("com.google.firebase:firebase-bom:33.5.1"))
implementation("com.google.firebase:firebase-auth-ktx")

// Jetpack Compose
implementation(platform(libs.androidx.compose.bom))
implementation(libs.androidx.ui)
implementation(libs.androidx.material3)

// Navigation
implementation("androidx.navigation:navigation-compose:2.8.3")

// ViewModel
implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.7")

// Coroutines
implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
```

---

## 🧪 Testing the App

### Create New Account

1. Open the app
2. Click "Don't have an account? Sign up"
3. Enter a valid email address
4. Enter a password with at least 6 characters
5. Click "Sign up"

### Log in

1. Enter your email address
2. Enter your password
3. Click "Sign in"

### Check in Firebase

Go to the Firebase Console → Authentication → Users to see registered users.

---

## 🐛 Known Issues

No known issues at this time. If you find a bug, please [open an issue](https://github.com/your-username/firebase-auth-jetpack-compose/issues).

---

## 🔮 Future Improvements

- [ ] Password recovery via email
- [ ] Google login
- [ ] Facebook login
- [ ] Two-factor authentication (2FA)
- [ ] Email verification
- [ ] User profile with Firestore
- [ ] Profile picture upload
- [ ] Light/dark theme
- [ ] Unit and integration tests

---

## 🤝 Contributing

Contributions are always welcome! Feel free to:

1. Fork the project
2. Create a branch for your feature (`git checkout -b feature/MyFeature`)
3. Commit your changes (`git commit -m 'Add MyFeature'`)
4. Push to the branch (`git push origin feature/MyFeature`)
5. Open a Pull Request

---

## 📄 License

This project is licensed under the MIT License. See the [LICENSE] file for more details.

---

## 👨‍💻 Author

Developed by Natalia Salete

- GitHub: [@natsalete](https://github.com/natsalete)
- LinkedIn: [Natália Santos](https://www.linkedin.com/in/natalia-salete-rodrigues/)
- Email: natsalete14@gmail.com

---

## 📚 Resources and References

- [Firebase Authentication Documentation](https://firebase.google.com/docs/auth)
- [Jetpack Compose Documentation](https://developer.android.com/jetpack/compose)
- [Material Design 3](https://m3.material.io/)
- [Kotlin Coroutines Guide](https://kotlinlang.org/docs/coroutines-guide.html)

---

## ⚠️ Important Note

The `google-services.json` file is **NOT** included in this repository for security reasons. You will need to create your own Firebase project and add the file as instructed above.

---

## 💡 Support

If you liked this project, please consider giving it a ⭐️!

For questions or suggestions, open an [issue](https://github.com/your-user/firebase-auth-jetpack-compose/issues) or contact us.

---

<p align="center">
Made with ❤️ and ☕ using Kotlin & Jetpack Compose
</p>
