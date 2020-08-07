# java-with-scala

Without the equivalent `sourceSets` in gradle, we get the error of unable to resolve symbol while compiling.

- This is because of the compilation flow from gradle... it first tries to compile java code, then scala code.
- So if Java code refers to Scala code then it does not compile and reports symbol not found errors.

- A hack to solve this problem is using this `sourceSets` and effectively using Scala compiiler to compile both Scala and Java...

```groovy
sourceSets {
    main {
        scala {
            srcDirs = ['src/main/scala','src/main/java']
        }
        java {
            srcDirs = []
        }
    }
}

```
