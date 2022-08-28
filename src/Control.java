import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Control extends KeyAdapter {

    public Control() {
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println(e);
    }

    /**
     * Invoked when a key has been pressed.
     */
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e);
    }

    /**
     * Invoked when a key has been released.
     */
    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e);
    }
}
