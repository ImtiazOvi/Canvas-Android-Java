package com.imtiaz.canvas_android_java.linedraw;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.imtiaz.canvas_android_java.R;

public class LineDrawActivity extends AppCompatActivity {
    Context context;
    Resources resources;
    RelativeLayout relativeLayout;
    Button button;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_draw);

        context = getApplicationContext();
        resources = getResources();
        relativeLayout = findViewById(R.id.relativeLayout);
        button = findViewById(R.id.button);

        imageView = findViewById(R.id.imageView);

        // Click by button draw line
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Bitmap
                Bitmap bitmap = Bitmap.createBitmap(10, 700, Bitmap.Config.ARGB_8888);

                // Canvas
                Canvas canvas = new Canvas(bitmap);
                canvas.drawColor(Color.RED);

                // Paint
                Paint paint = new Paint();
                paint.setColor(Color.RED);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(8);
                paint.setAntiAlias(true);
                int offset = 50;

                // Draw line
                canvas.drawLine(
                        offset, canvas.getHeight() / 2, canvas.getWidth() - offset, canvas.getHeight() / 2, paint);
                imageView.setImageBitmap(bitmap);
            }
        });
    }
}
