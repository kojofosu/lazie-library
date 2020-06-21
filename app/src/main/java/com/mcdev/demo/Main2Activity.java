package com.mcdev.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mcdev.lazielibrary.Copie;


public class Main2Activity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView2);
        textView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
//                new Copie.Builder(getApplicationContext())
//                        .copy("text", textView.getText().toString())
//                        .makeToast("Copied.")
//                        .build();

                Copie.copyWithToast(getApplicationContext(), "label", textView.getText().toString(), "Has been copied");
                return true;
            }
        });
    }
}
