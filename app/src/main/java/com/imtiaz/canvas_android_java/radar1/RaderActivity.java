package com.imtiaz.canvas_android_java.radar1;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.imtiaz.canvas_android_java.R;

public class RaderActivity extends AppCompatActivity {

    RadarView radarView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rader);



        radarView = findViewById(R.id.radar);
        radarView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radarView.scan();
            }
        });
    }
}
