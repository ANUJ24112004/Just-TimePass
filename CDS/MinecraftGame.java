import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MinecraftGame extends JFrame {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int BLOCK_SIZE = 20;

    private boolean[][] blocks = new boolean[WIDTH / BLOCK_SIZE][HEIGHT / BLOCK_SIZE];

    public MinecraftGame() {
        setTitle("Minecraft Game");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int x = e.getX() / BLOCK_SIZE;
                int y = e.getY() / BLOCK_SIZE;
                if (x >= 0 && x < blocks.length && y >= 0 && y < blocks[0].length) {
                    blocks[x][y] = !blocks[x][y];
                    repaint();
                }
            }
        });
    }

    public void paint(Graphics g) {
        super.paint(g);
        for (int x = 0; x < blocks.length; x++) {
            for (int y = 0; y < blocks[0].length; y++) {
                if (blocks[x][y]) {
                    g.setColor(Color.BLUE);
                    g.fillRect(x * BLOCK_SIZE, y * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
                } else {
                    g.setColor(Color.WHITE);
                    g.drawRect(x * BLOCK_SIZE, y * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MinecraftGame game = new MinecraftGame();
            game.setVisible(true);
        });
    }
}
