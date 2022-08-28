import javax.swing.*;

public class start {
    public static void main(String[] args) {
        //give the window a name here
        JFrame window = new JFrame("");
        window.setSize(800,400);
        window.setLocation(0,0);
        window.setLayout(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Control windowKeyListener = new Control();
        window.addKeyListener(windowKeyListener);
        GameFrame snakeGame = new GameFrame(windowKeyListener);
        snakeGame.setFocusable(true);
        snakeGame.setSize(800,400);
        window.setContentPane(snakeGame);
        window.setFocusable(true);
    }
}
