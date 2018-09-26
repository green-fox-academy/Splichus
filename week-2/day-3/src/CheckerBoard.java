import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        for (int i = 0; i < 10; i++) {
            if (i%2 == 0) {
                for (int j = 0; j < 10; j++) {
                    if (j % 2 == 0) {
                        blackBox(graphics, j * 20, i*20);
                    } else {
                        whiteBox(graphics, j * 20, i*20);
                    }
                }
            } else {
                for (int k = 0; k < 10; k++) {
                    if (k % 2 == 0) {
                        whiteBox(graphics, k * 20, i*20);
                    } else {
                        blackBox(graphics, k * 20, i*20);
                    }
                }
            }
        }

    }

    public static void blackBox (Graphics graphics, int x, int y) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(x, y, 20, 20);
    }
    public static void whiteBox (Graphics graphics, int x, int y) {
        graphics.setColor(Color.WHITE);
        graphics.fillRect(x, y, 20, 20);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}