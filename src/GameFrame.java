import javax.swing.*;
import java.awt.*;

public class GameFrame extends JPanel {

    Control gameControl;
    Snake player;

    public GameFrame() {
        gameControl = new Control();
        this.addKeyListener(gameControl);
        player = new Snake(0,0,25,25);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        g2.fill(player.getHead());
    }
}
