[![](https://jitpack.io/v/kojofosu/Lazie-library.svg)](https://jitpack.io/#kojofosu/Lazie-library)      [![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)        

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

```groovy
    implementation 'com.github.kojofosu:Lazie-library:${latest-version}'
```
## Add these in your launcher activity's  `onCreate()`

### Setting timer for your custom splash view
```java
    Splashie.splash(ACTIVITY.this, TARGET_CLASS.class, DURATION_IN_SECONDS);
```

### Using in-built splash screen
- no need for an XML layout when using this
```java
    SplashScreen splashScreen = new SplashScreen(ACTIVITY.this);
    splashScreen.createSimpleSplashScreen(R.mipmap.lakes, R.string.title, R.string.message);
    splashScreen.setActivityBackgroundColor(R.color.colorPrimaryDark);   
```

### sample
```java
    SplashScreen splashScreen = new SplashScreen(ACTIVITY.this);       //initiating splashscreen or splash view
    splashScreen.createSimpleSplashScreen(R.mipmap.lakes, R.string.title, R.string.message);       //creating splashscreen
    splashScreen.setActivityBackgroundColor(R.color.colorPrimaryDark);             //changing background color for splashscreen
    Splashie.splash(ACTIVITY.this, TARGET_CLASS.class, 4);       //setting duration for splash screen
```