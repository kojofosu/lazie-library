package com.mcdev.demo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.mcdev.lazielibrary.SplashScreen;
import com.mcdev.lazielibrary.Splashie;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SplashScreen splashScreen = new SplashScreen(MainActivity.this);
        splashScreen.createSimpleSplashScreen(R.mipmap.lakes);
        splashScreen.setActivityBackgroundColor(R.color.colorPrimaryDark);
        Splashie.splash(MainActivity.this, Main2Activity.class,4);
    }
}
