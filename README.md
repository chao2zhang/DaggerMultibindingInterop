# DaggerMultibindingInterop
Sample project for Kotlin-Java interop issue for dagger multibinding

➜  DaggerMultibindingJavaInterop git:(main) ./gradlew build                                                              

> Task :compileJava FAILED
/Users/cazhang/DaggerMultibindingJavaInterop/src/main/java/MyComponent.java:8: error: [Dagger/MissingBinding] java.util.Map<java.lang.Class<? extends ViewModel>,? extends Factory> cannot be provided without an @Provides-annotated method.
interface MyComponent {
^
      java.util.Map<java.lang.Class<? extends ViewModel>,? extends Factory> is injected at
          UseViewModelFactory(factoryMap)
      UseViewModelFactory is requested at
          MyComponent.useViewModelFactory()
1 error

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':compileJava'.
> Compilation failed; see the compiler error output for details.

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org
