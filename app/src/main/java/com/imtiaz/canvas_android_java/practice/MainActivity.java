package com.imtiaz.canvas_android_java.practice;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    CustomDrawableView customDrawableView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);


        customDrawableView = new CustomDrawableView(this);

        setContentView(customDrawableView);
    }
}
