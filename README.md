[![Release](https://jitpack.io/v/User/Repo.svg)]
(https://jitpack.io/#User/Repo)
[![](https://jitpack.io/v/kojofosu/Lazie-library.svg)](https://jitpack.io/#kojofosu/Lazie-library)

### Gradle

Make sure that the repositories section includes JCenter
```gradle
buildscript {
    ...
    repositories {
                jcenter()
                maven { url "https://jitpack.io" }
        ...
    }
```
Add the library to the dependencies:

```gradle
implementation 'com.mcdev.lazielibrary:lazie-library:1.0.0'
```