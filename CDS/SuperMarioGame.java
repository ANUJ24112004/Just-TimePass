import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class SuperMarioGame extends JFrame implements KeyListener {
    private int marioX = 50; // Initial x-position of Mario
    private int marioY = 250; // Initial y-position of Mario
    private final int MARIO_WIDTH = 50; // Width of Mario
    private final int MARIO_HEIGHT = 50; // Height of Mario
    private int obstacleX = 300; // Initial x-position of the obstacle
    private int obstacleY = 220; // Initial y-position of the obstacle
    private final int OBSTACLE_WIDTH = 100; // Width of the obstacle
    private final int OBSTACLE_HEIGHT = 30; // Height of the obstacle

    public SuperMarioGame() {
        setTitle("Super Mario Game");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        // Draw Mario
        g2d.setColor(Color.RED);
        g2d.fillRect(marioX, marioY, MARIO_WIDTH, MARIO_HEIGHT);

        // Draw obstacle
        g2d.setColor(Color.GREEN);
        g2d.fillRect(obstacleX, obstacleY, OBSTACLE_WIDTH, OBSTACLE_HEIGHT);
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        // Move Mario
        if (keyCode == KeyEvent.VK_LEFT) {
            marioX -= 10;
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            marioX += 10;
        }

        // Repaint the window
        repaint();
    }

    public void keyReleased(KeyEvent e) {
        // Not needed for this game
    }

    public void keyTyped(KeyEvent e) {
        // Not needed for this game
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SuperMarioGame game = new SuperMarioGame();
            game.setVisible(true);
        });
    }
}
