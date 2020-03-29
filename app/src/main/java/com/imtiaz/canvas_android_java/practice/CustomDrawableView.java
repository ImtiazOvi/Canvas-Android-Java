package com.imtiaz.canvas_android_java.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;

public class CustomDrawableView extends View {
  private ShapeDrawable drawable;
  private ShapeDrawable drawable2;

  public CustomDrawableView(Context context) {
    super(context);

    int x = 200;
    int y = 500;
    int width = 500;
    int height = 100;

    int xx = 200;
    int yy = 500;
    int widthx = 600;
    int heighty = 150;



//    setContentDescription(context.getResources().getString(
//            R.string.my_view_desc));

    drawable = new ShapeDrawable(new OvalShape());
    drawable2 = new ShapeDrawable(new OvalShape());
    // If the color isn't set, the shape uses black as the default.
    drawable.getPaint().setColor(0xff74AC23);
    drawable2.getPaint().setColor(0xff74AAAA);
    // If the bounds aren't set, the shape can't be drawn.
    drawable.setBounds(x, y, x + width, y + height);
    drawable2.setBounds(xx, yy, xx + widthx, yy + heighty);
  }

  protected void onDraw(Canvas canvas) {
    drawable.draw(canvas);
    drawable2.draw(canvas);

  }
}