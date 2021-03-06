# MVVM-Rhine

**Android端 MVVM + Jetpack 架构组件的Github客户端。**

### [English Documentation](https://github.com/qingmei2/MVVM-Rhine) | 中文文档

## 通知

关于项目的起源，请参考笔者的这篇文章：

> [使用MVVM尝试开发Github客户端及对编程的一些思考](https://juejin.im/post/5be7bbd9f265da61797458cf)

## 屏幕截图

<div align:left;display:inline;>
<img width="200" height="360" src="https://github.com/qingmei2/MVVM-Rhine/blob/master/screenshots/login.png"/>
<img width="200" height="360" src="https://github.com/qingmei2/MVVM-Rhine/blob/master/screenshots/home.png"/>
<img width="200" height="360" src="https://github.com/qingmei2/MVVM-Rhine/blob/master/screenshots/repos.png"/>
<img width="200" height="360" src="https://github.com/qingmei2/MVVM-Rhine/blob/master/screenshots/me.png"/>
</div>

## 三方组件

### Android官方架构组件

* [DataBinding: Declaratively bind observable data to UI elements.](https://developer.android.com/topic/libraries/data-binding/)

* [Lifecycle: Create a UI that automatically responds to lifecycle events.](https://developer.android.com/topic/libraries/architecture/lifecycle)

* [LiveData: Build data objects that notify views when the underlying database changes.](https://developer.android.com/topic/libraries/architecture/livedata)

* [ViewModel: Store UI-related data that isn't destroyed on app rotations. Easily schedule asynchronous tasks for optimal execution.](https://developer.android.com/topic/libraries/architecture/viewmodel)

* [Room: Access your app's SQLite database with in-app objects and compile-time checks.](https://developer.android.com/topic/libraries/architecture/room)

* [Navigation: Handle everything needed for in-app navigation.](https://developer.android.com/topic/libraries/architecture/navigation/)

* [Paging: Makes it easier for you to load data gradually and gracefully within your app's RecyclerView.](https://developer.android.com/topic/libraries/architecture/paging/)

### 网络请求

* [Retrofit2: Type-safe HTTP client for Android and Java by Square, Inc.](https://github.com/square/retrofit)

* [OkHttp: An HTTP+HTTP/2 client for Android and Java applications.](https://github.com/square/okhttp)

### 依赖注入

* [Kodein-DI: Painless Kotlin Dependency Injection](https://github.com/Kodein-Framework/Kodein-DI)

### 响应式库

* [RxKotlin: RxJava bindings for Kotlin](https://github.com/ReactiveX/RxKotlin)

* [RxJava2: A library for composing asynchronous and event-based programs using observable sequences for the Java VM](https://github.com/ReactiveX/RxJava)

* [RxAndroid: RxJava bindings for Android](https://github.com/ReactiveX/RxAndroid)

* [RxBinding: RxJava binding APIs for Android's UI widgets.](https://github.com/JakeWharton/RxBinding)

* [RxPermissions: Android runtime permissions powered by RxJava2.](https://github.com/tbruyelle/RxPermissions)

* [RxWeaver: A lightweight and flexible error handler tools for RxJava2.](https://github.com/qingmei2/RxWeaver)

* [AutoDispose: Automatic binding+disposal of RxJava 2 streams.](https://github.com/uber/AutoDispose)

### 函数式库

* [Arrow: Functional companion to Kotlin's Standard Library.](https://arrow-kt.io/)

### 其它

* [Glide: An image loading and caching library for Android focused on smooth scrolling](https://github.com/bumptech/glide)

* [Timber: A logger with a small, extensible API which provides utility on top of Android's normal Log class.](https://github.com/JakeWharton/timber)

### 工具/插件

* [MVVM-Rhine-Template: Activity or Fragment code generation template for MVVM-Rhine.](https://github.com/qingmei2/MVVM-Rhine-Template)

## 开始使用

*  直接通过git命令行进行clone:

```shell
$ git clone https://github.com/qingmei2/MVVM-Rhine.git
```

## 如何入手学习这个项目？

如何使用`Android Jetpack`？

>* [Android官方架构组件Lifecycle：生命周期组件详解&原理分析](https://juejin.im/post/5c53beaf51882562e27e5ad9)
>* [Android官方架构组件LiveData: 观察者模式领域二三事](https://juejin.im/post/5c25753af265da61561f5335)
>* [Android官方架构组件ViewModel:从前世今生到追本溯源](https://juejin.im/post/5c047fd3e51d45666017ff86)
>* [Android官方架构组件Paging：分页库的设计美学](https://juejin.im/post/5c53ad9e6fb9a049eb3c5cfd)
>* [Android官方架构组件Navigation：大巧不工的Fragment管理框架](https://juejin.im/post/5c53be3951882562d27416c6)
>* [Android官方架构组件DataBinding双向绑定篇: 观察者模式的殊途同归](https://juejin.im/post/5c3e04b7f265da611b589574)

如何使用`Kodein`进行依赖注入？

> * [ 告别Dagger2，在Kotlin项目中使用Kodein进行依赖注入 ](https://www.jianshu.com/p/b0da805f7534)
> * [【译】Android开发从Dagger2迁移至Kodein的感受  ](https://www.jianshu.com/p/e5eef49570b9)

如何进阶学习`RxJava`？

> * [ 理解RxJava（一）：基本流程源码分析 ](https://www.jianshu.com/p/7fce2955f2db)
> * [ 理解RxJava（二）：操作符流程原理分析 ](https://www.jianshu.com/p/0a28428e734d)
> * [ 理解RxJava（三）：线程调度原理分析 ](https://www.jianshu.com/p/9e3930fbcb26)
> * [ 理解RxJava（四）Subject用法及原理分析 ](https://www.jianshu.com/p/d7efc29ec9d3)

> * [ 解决RxJava内存泄漏（前篇）：RxLifecycle详解及原理分析 ](https://www.jianshu.com/p/8311410de676)
> * [ 解决RxJava内存泄漏（后篇）：Android架构中添加AutoDispose解决RxJava内存泄漏 ](https://www.jianshu.com/p/8490d9383ba5)


如果您依然不满意这个项目中的代码风格, 欢迎体验笔者关于**状态管理**的最新实践，个人而言更趋近于理想中的设计:

> [MVI-Rhine: 基于Jetpack + MVVM, 更加响应式&函数式的编程实践](https://github.com/qingmei2/MVI-Rhine)

## 感谢

:art: 项目中的UI设计部分参考了 [gitme](https://github.com/flutterchina/gitme).

:star: 项目参考了 [rx-mvvm-android](https://github.com/ffgiraldez/rx-mvvm-android) 并对其部分代码进行了引用.

## License

    The MVVM-Rhine: Apache License

    Copyright (c) 2018 qingmei2

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
