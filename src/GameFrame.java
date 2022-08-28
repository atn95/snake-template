import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JPanel {

    Control gameControl;
    Snake player;
    Timer gameTicks = new Timer(500, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            GameUpdate();
        }
    });

    public GameFrame(Control windowKeyListener) {
        gameControl = windowKeyListener;
        player = new Snake(0,0,25,25);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        g2.fill(player.getHead());
        //Draw the body here
    }

    public void GameUpdate() {

    }
}
