# Jetpack-Note-App-with-Persistence

This repository contains an Android application that can be used to write notes on. It is like a todo list. This app is unable to persist data. This was created by following the following [course](https://learning.oreilly.com/videos/android-jetpack-compose/9781803237718/).

This app builds up on the previous note app which can be found in [this](https://github.com/ayesh99747/Jetpack-Note-App) repository.

## Authors

- [@ayesh99747](https://github.com/ayesh99747)

## Specifications

This app was developed for android API 34.

## Images

The following are screenshots of the app.

<img src="/Screenshots/Screenshot 1.png" width="300" height="550">
<img src="/Screenshots/Screenshot 2.png" width="300" height="550">
<img src="/Screenshots/Screenshot 3.png" width="300" height="550">

## Notes

- Dependency Injection can be used to reduce the amount of coupling between classes.
  - If classes are tightly coupled, it is difficult to test the functions in the class which use this dependency.
  - In kotlin, we can do this by passing in the object we want to inject into the constructor as a parameter.
  - We can use HILT and Dagger to do this for android apps.
