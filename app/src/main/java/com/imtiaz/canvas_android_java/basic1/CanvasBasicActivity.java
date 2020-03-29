package com.imtiaz.canvas_android_java.basic1;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.imtiaz.canvas_android_java.R;

public class CanvasBasicActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas_basic);


        linearLayout = findViewById(R.id.linearLayout);

        CanvasCustomView myView = new CanvasCustomView(this);

        linearLayout.addView(myView);
    }
}
