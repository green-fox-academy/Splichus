import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {

    public static void mainDraw(Graphics graphics) {
        int centerX = WIDTH/2;
        int centerY = WIDTH/2;
        int width = WIDTH;
        int count = 4;
        drawSquares(graphics, centerX, centerY, width, count);
    }

    public static void drawSquares (Graphics graphics, double centerX, double centerY, double width, int count) {
        if (count==0) {

        } else {
            drawSquare(graphics, centerX, centerY, width, 10*count-2);
            drawSquares(graphics, centerX - (width/4), centerY - (width / 4), width/2, count-1);
            drawSquares(graphics, centerX + (width/4), centerY - (width / 4), width/2, count-1);
            drawSquares(graphics, centerX + (width/4), centerY + (width / 4), width/2, count-1);
            drawSquares(graphics, centerX - (width/4), centerY + (width / 4), width/2, count-1);

        }


    }
    public static void drawSquare (Graphics graphics, double centerX, double centerY, double width, int count) {

        if(count == 0){

        } else {
            graphics.drawRect((int) (centerX - (width) / 4), (int) (centerY - (width / 4)), (int) (width / 2), (int) (width / 2));
            drawSquare(graphics, centerX, centerY, width-2, count-1);
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
