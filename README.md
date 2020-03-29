# Canvas-Android-Java
Canvas basics(Paint,Canvas,Bitmap),Shader animation, Radar 


To draw the display of a mobile divice with android need 4 things : 1. View 2. Canvas 3. Paint 4. Bitmap

-> Bitmap is the physical surface. Canvas provides an API to draw on the bitmap, The paint is for styling what you draw and the view dispalys the bitmap.
-> You create a Bitmap associate it with a view, create a canvas with Paint object for the Bitmap. And then you can draw.
-> You must invalidate() the view when your are done drawing so that the Android system redraws the dispaly
-> All drawing happens on the UI thread , so performance matters


///==========///

Android Canvas class encapsulates the bitmaps used as surface. It exposes the draw methods which can be used for designing.
Let us first clear the following terms:

# Bitmap: The surface being drawn on.
# Paint: It lets us specify how to draw the primitives on bitmap. It is also referred to as “Brush”.
# Canvas: It supplies the draw methods used to draw primitives on underlying bitmap.
Each drawing object specifies a paint object to render. Let us see the available list of drawing objects and they are as follows:

# drawArc: This draws an arc between the two angles bounded by an area of rectangle.
# drawBitmap: It draws an bitmap on canvas.
# drawRGB/drawARGB/drawColor: This fills the canvas with a single color.
# drawBitmapMesh: It draws a bitmap using a mesh. It manipulates the appearance of target by moving points on it.
# drawCircle: This draws a circle on a specified radius centered on a given point.
# drawLine(s):it draws a line (or series of lines) between points.
# drawOval: it draws an oval which is bounded by the area of rectangle.
# drawPaint: It fills the entire canvas with a specific paint.
# drawPath: It draws a path as per specification.
# drawPicture: It draws a picture specified on a rectangular area.
# drawPosText: it draws a text string specifying the offset of each character.
# drawRect: It draws a rectangle.
# drawRoundRect: it draws a rectangle with round edges.
# drawText: It draws a text string on canvas.
The Paint class consists of a paint brush and a palette. It lets us choose how to render the primitives drawn into canvas by draw methods. We can control the color, style, font, special effects etc can be modified by modifying the paint object. For instance, setColor method can be used to select the color of Paint. Paint class supports transparency so it can be used to control variety of shades or effects, etc. Let us create a simple example and see the basic usage of canvas and paint.
