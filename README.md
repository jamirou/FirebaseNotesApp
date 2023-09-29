# Firebase Notes App

## Descripción
Firebase Notes App es una aplicación Android desarrollada con Jetpack Compose y Kotlin que demuestra cómo crear una aplicación que combina la autenticación de Firebase con operaciones CRUD (Create, Read, Update, Delete) en Firestore para gestionar notas.

## Estructura del Proyecto
La aplicación está organizada en las siguientes carpetas y paquetes:

- `components`: Contiene componentes reutilizables, como alertas.
- `navigation`: Contiene la lógica de navegación de la aplicación.
- `model`: Define los modelos de datos utilizados en la aplicación, como UserModel y NotesState.
- `viewModels`: Contiene los ViewModel que gestionan la lógica de la aplicación, como LoginViewModel y NotesViewModel.
- `views`: Contiene las vistas de la aplicación, incluyendo las relacionadas con la autenticación y la gestión de notas.

<img src="https://github.com/jamirou/Personal_Schedule/assets/48457084/fa4f81c1-4f11-4dda-90ae-3f4c37f5448a" height="650">


## Características Principales
La aplicación se divide en dos partes principales:

1. **Autenticación**
   - Permite a los usuarios registrarse e iniciar sesión utilizando Firebase Authentication.
   - Gestiona la creación de usuarios y el inicio de sesión.
   - Incluye una interfaz de usuario con pestañas para registro e inicio de sesión.

2. **CRUD (Create, Read, Update, Delete) de Notas**
   - Permite a los usuarios crear, leer, actualizar y eliminar notas.
   - Almacena las notas en Firebase Firestore.
   - Proporciona una vista principal (HomeView) para ver todas las notas.
   - Permite editar y eliminar notas individualmente.


## Dependencias Principales
La aplicación utiliza las siguientes dependencias importantes:

- Jetpack Compose: Biblioteca moderna de UI para la creación de interfaces de usuario nativas en Android.
- Firebase Authentication: Para la autenticación de usuarios.
- Firebase Firestore: Para el almacenamiento de datos en tiempo real de las notas.

