package m201903.animation_canvas_hinhtron;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class graphicview extends View {
    Path circle;
    Paint cPaint = new Paint();
    //Contructor
    public graphicview(Context context) {
        super(context);
    }
    //Phương thức để vẽ lên Canvas (View.onDraw())
    @Override
    protected void onDraw(Canvas canvas)
    {
        circle = new Path();
        circle.addCircle(150,150,100,Path.Direction.CCW);
        cPaint.setColor(Color.BLACK);//Set màu cho hình tròn
        canvas.drawPath(circle, cPaint);
    }

}
