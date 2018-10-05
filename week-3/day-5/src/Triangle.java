import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {

    public static void mainDraw(Graphics graphics) {
        int cornerX = 450;
        int cornerY = 50;
        int width = 900;
        int count = 7;

        drawTriangle(graphics, cornerX, cornerY,width,count);
        drawBaseTriangle(graphics, cornerX, cornerY, width);

    }

    public static void drawTriangle(Graphics graphics, double cornerX, double cornerY, double width, int count) {
        double l = ((width/2.0)*Math.sqrt(3.0))/2.0;
        if (count == 1) {

        } else {
            graphics.setColor(Helpers.randomColor());
            graphics.drawLine((int)(cornerX), (int)cornerY, (int)(cornerX-(width/4)), (int)(cornerY+l));
            graphics.drawLine((int)(cornerX-(width/4)), (int)(cornerY+l), (int)(cornerX+(width/4)), (int)(cornerY+l));
            graphics.drawLine((int)(cornerX+(width/4)), (int)(cornerY+l), (int)cornerX, (int)cornerY);

            drawTriangle(graphics,cornerX+(width/4), cornerY, width/2, count-1);
            drawTriangle(graphics,cornerX-(width/4), cornerY, width/2, count-1);
            drawTriangle(graphics, cornerX, cornerY+(l), width/2, count-1);
        }
    }
    public static void drawBaseTriangle (Graphics graphics, double cornerX, double cornerY, double width) {
        double l = ((width/2.0)*Math.sqrt(3.0))/2.0;
        graphics.drawLine((int)(cornerX-width/2), (int)(cornerY), (int)(cornerX), (int)(cornerY+l*2));
        graphics.drawLine((int) (cornerX), (int)(cornerY+l*2), (int)(cornerX+width/2), (int)cornerY);
        graphics.drawLine((int)(cornerX+width/2), (int)cornerY, (int)(cornerX-width/2), (int)(cornerY));
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
