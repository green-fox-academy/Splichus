import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Carpet {

    public static void mainDraw(Graphics graphics) {
        int centerX= WIDTH/2;
        int centerY = WIDTH/2;
        int width = WIDTH;
        int count = 7;
        drawSquares(graphics, centerX, centerY, width, count);
    }

    public static void drawSquares (Graphics graphics, double centerX, double centerY, double width, int count) {

//        int[] x = {(int)width/3, (int)width/3, (int)(2*width/3), (int)(2*width/3)};
//        int[] y = {(int)width/3, (int)(2*width/3), (int)(2*width/3), (int)width/3};
        if (count == 1) {
        } else {
            graphics.fillRect((int)(centerX - width/6), (int)(centerY - width/6),(int)(width/3),(int)(width/3));
            drawSquares(graphics, centerX-width/3, centerY, width/3, count -1);
            drawSquares(graphics, centerX+width/3, centerY, width/3, count-1);
            drawSquares(graphics, centerX, centerY+width/3, width/3, count-1);
            drawSquares(graphics, centerX, centerY-width/3, width/3, count-1);
            drawSquares(graphics, centerX-width/3, centerY-width/3, width/3, count-1);
            drawSquares(graphics, centerX+width/3, centerY-width/3, width/3, count-1);
            drawSquares(graphics, centerX+width/3, centerY+width/3, width/3, count-1);
            drawSquares(graphics, centerX-width/3, centerY+width/3, width/3, count-1);
        }
    }

    // Don't touch the code below
    static int WIDTH = 900;
    static int HEIGHT = 900;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
