package com.mcdev.demo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mcdev.lazielibrary.Copie;
import com.mcdev.lazielibrary.SplashScreen;
import com.mcdev.lazielibrary.Splashie;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SplashScreen splashScreen = new SplashScreen(MainActivity.this);
        splashScreen.setActivityBackgroundColor(R.color.colorPrimary);
        splashScreen.createSimpleSplashScreen(R.mipmap.lakes);

        Splashie.splash(MainActivity.this, Main2Activity.class,4);


    }
}
