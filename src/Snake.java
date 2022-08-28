import java.awt.*;
import java.util.ArrayList;

public class Snake {
    private final Rectangle head;
    private ArrayList<Rectangle> body;
    private int length;

    public Snake(int x,int y, int width,int height) {
        head = new Rectangle(x,y,width,height);
        //initiate length here;
    }

    public Rectangle getHead(){
        return head;
    }

}
