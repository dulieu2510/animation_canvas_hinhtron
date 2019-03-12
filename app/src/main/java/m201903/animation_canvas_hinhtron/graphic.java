package m201903.animation_canvas_hinhtron;

import android.app.Activity;
import android.os.Bundle;

public class graphic extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Gán nội dung khung nhìn là thể hiện của lớp GraphicsView
        setContentView(new graphicview(this));
    }
}
