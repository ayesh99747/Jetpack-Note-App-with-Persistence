# Jetpack-Note-App-with-Persistence

This Android application allows users to create and manage notes.  It utilizes Jetpack Compose, Room Persistence Library, and Hilt for dependency injection. This project builds upon a previous note app (https://github.com/ayesh99747/Jetpack-Note-App) and now includes persistent data storage.  The original project was based on a course from O'Reilly Learning (https://learning.oreilly.com/videos/android-jetpack-compose/9781803237718/).

## Key Features

* **Note Creation:**  Add new notes with titles and descriptions.
* **Note Deletion:** Remove existing notes.
* **Data Persistence:** Notes are stored persistently using Room.
* **Dependency Injection:** Hilt is used for dependency injection, improving code testability and maintainability.
* **UI:** Built using Jetpack Compose for a modern and efficient user interface.


## Technologies Used

* **Kotlin:** Programming language.
* **Jetpack Compose:** Android UI toolkit.
* **Room Persistence Library:** SQLite database access layer.
* **Hilt:** Dependency Injection framework.
* **Coroutines:** For asynchronous operations.


## Prerequisites

* **Android Studio:**  Latest stable version.
* **Android SDK:**  API level 31 or higher.
* **JDK 17:** Or a compatible JDK.
* **Gradle:** Gradle 8.0 (or later, as specified in `gradle/wrapper/gradle-wrapper.properties`).
* **Kotlin Plugin:** Installed in Android Studio.


## Installation

1. **Clone the repository:**
   ```bash
   git clone <repository_url>
   ```

2. **Open in Android Studio:** Open the cloned project in Android Studio.

3. **Sync Project:** Android Studio should automatically sync the project. If not, manually sync the project with Gradle files.

4. **Install Dependencies:** The project uses Gradle to manage dependencies.  All necessary dependencies are declared in `app/build.gradle.kts`.  Android Studio will automatically download and install them during the project sync.

5. **Run the app:** Build and run the app on an emulator or physical device.


## Usage Examples

**Adding a Note:**

1. Open the app.
2. Enter a title in the "Title" field.
3. Enter a description in the "Description" field.
4. Click the "Save" button.  The note will be saved and displayed in the list.

**Deleting a Note:**

1. Tap on a note in the list.  The note will be deleted.


## Project Structure

```
JetpackNoteAppWithPersistence/
├── Screenshots/          // Screenshots of the application
├── app/                  // Main application code
│   ├── src/
│   │   ├── androidTest/  // Android instrumentation tests
│   │   ├── main/        // Main application source code
│   │   │   ├── java/    // Java source files (though primarily using Kotlin)
│   │   │   │   └── ... // Package structure for the application
│   │   │   └── ...
│   │   └── test/        // Unit tests
│   ├── build.gradle.kts // Module-level build file
│   └── ...
├── build.gradle.kts     // Top-level build file
├── gradle/              // Gradle wrapper files
│   └── wrapper/
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradle.properties    // Gradle project properties
├── gradlew               // Gradle wrapper script (Unix)
└── gradlew.bat          // Gradle wrapper script (Windows)
```

## Configuration

The main configuration is handled through Gradle files (`build.gradle.kts` and `settings.gradle.kts`).  `gradle.properties` contains settings like JVM arguments.  The Room database is configured in `app/src/main/java/com/example/jetpacknoteappwithpersistence/di/AppModule.kt`.


## License

### Disclaimer

This repository contains code created while following the course  
**"Android Jetpack Compose - Build Android Native UIs Fast"** by **Paulo Dichone**,  
available at: [O’Reilly Learning Platform](https://learning.oreilly.com/course/android-jetpack-compose/9781803237718/)

The content is intended for educational purposes only and closely follows the structure and lessons from the original course.

All rights to the course content and materials belong to **Paulo Dichone**.  
This repository is not affiliated with or endorsed by Paulo Dichone or O’Reilly.

If you are the content owner and would like this repository modified or removed, please contact me directly.

## Error Messages

Refer to the Android Studio error messages and logs for debugging help. If you encounter issues, ensure your environment is correctly setup, including Java, Android SDK, and Android Studio. Check the Gradle sync to confirm all dependencies are correctly resolved.

## Screenshots


<p align="center">
<img src="Screenshots/Screenshot 01.png" width="300" height="550">
<br>
<em>Figure 1: Home screen of the app with some notes.</em>
</p>

<p align="center">
<img src="Screenshots/Screenshot 02.png" width="300" height="550">
<br>
<em>Figure 2: Adding a new note.</em>
</p>

<p align="center">
<img src="Screenshots/Screenshot 03.png" width="300" height="550">
<br>
<em>Figure 3: Screenshot of the app with new notes added.</em>
</p>

## Error Messages

No specific error messages were documented in the codebase.  However, common Android development errors might include:

* **Missing dependencies:** Ensure all dependencies listed in `app/build.gradle.kts` are correctly installed and resolved.
* **Database errors:**  Room might throw exceptions if there are issues with the database schema or operations. Check the logs for more detailed error messages.
* **Compose errors:** Look for error messages related to composable functions or UI elements.


