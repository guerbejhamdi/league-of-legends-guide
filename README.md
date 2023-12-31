  <h2 align="center">League of Legends Android Guide App</h2>

This is an Android app built to demonstrate the use of modern development tools with best practices implementation. The app is written in **Kotlin**, which is the first-class and official programming language for Android development. Kotlin is a statically typed, general-purpose programming language with type inference. It is designed to interoperate fully with Java, and the JVM bytecode generated by Kotlin is 100% compatible with Java bytecode. 

The app uses **Coroutines** for asynchronous programming. Coroutines are a concurrency design pattern that you can use on Android to simplify code that executes asynchronously. They were added to Kotlin in version 1.3 and are based on established concepts from other languages. Coroutines help to manage long-running tasks that might otherwise block the main thread and cause your app to become unresponsive.

The app also uses **Flow**, which is a cold asynchronous data stream that sequentially emits values and completes normally or with an exception.

For dependency injection, this app uses **Hilt** instead of manual dependency injection. Hilt is a dependency injection library for Android that reduces the boilerplate of doing manual dependency injection in your project. It provides a standard way to use DI in your application by providing containers for every Android class in your project and managing their lifecycles automatically. Hilt is built on top of the popular DI library Dagger to benefit from the compile-time correctness, runtime performance, scalability, and Android Studio support that Dagger provides. Hilt uses KSP (Kotlin Symbol Processing) instead of KAPT (Kotlin Annotation Processing Tool) for code generation.

## Description

The app currently displays all League of Legends champions and has a details screen that shows important champion details. More features will be added later such as build recommendation, champion counters, tips and tricks, etc.

## App Architecture

The app follows the **Clean Architecture** pattern, which separates the application into three layers: presentation, domain, and data. The presentation layer is responsible for displaying data to the user, the domain layer contains business logic, and the data layer is responsible for retrieving data from various sources.

The presentation layer consists of Activities and Fragments that display data to the user using ViewModels. The ViewModel acts as a mediator between the View (UI) and the Model (data). It also uses **Dependency Injection** to manage dependencies between different components of the app.

The domain layer contains Use Cases that contain business logic and interact with repositories to retrieve data.

The data layer contains repositories that retrieve data from various sources such as local database or remote API.

## Incoming Features

- Build recommendation
- Champion counters
- Tips and tricks

## 🙌 Contributions :
We welcome contributions to improve this project, Whether you want to fix a bug, implement a new feature, or suggest an enhancement, we're open to your ideas. Please create the issue at [here](https://github.com/guerbejhamdi/league-of-legends-guide/issues) & If you have implemented some changes then raise the Pull request over ```develop``` branch.

## Connect with me:
[![Github Profile](https://skillicons.dev/icons?i=github)](https://github.com/guerbejhamdi)
[![LinkedIn](https://skillicons.dev/icons?i=linkedin)](https://www.linkedin.com/in/hamdiguerbej/)

## License :
```
MIT License

Copyright (c) 2023 Hamdi Guerbej

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

</br>
