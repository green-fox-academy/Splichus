import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StaryNight {
    public static void mainDraw(Graphics graphics) {
//  - Draw the night sky:
//  - The background should be black
//  - The stars can be small squares
//  - The stars should have random positions on the canvas
//  - The stars should have random color (some shade of grey)
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        graphics.setColor(Color.YELLOW);

        for (int i = 0; i < 100; i++) {
            graphics.fillRect(rn(0, WIDTH), rn(0, HEIGHT), 2, 2);
        }

    }

    public static Color randomColor() {
        Color colour = new Color(rn(0, 256), rn(0, 256), rn(0, 256));
        return colour;
    }

    public static int rn(int lowerLimit, int range) {
        int toReturn = lowerLimit + ((int) (Math.random() * range));
        return toReturn;
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