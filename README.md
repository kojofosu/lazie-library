
### Gradle

Make sure that the repositories section includes JCenter
```gradle
buildscript {
    ...
    repositories {
        jitpack()
        ...
    }
```
Add the library to the dependencies:

```gradle
implementation 'com.mcdev.lazielibrary:lazie-library:1.0.0'
```