import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {

    public static void mainDraw(Graphics graphics) {
        drawCircle(graphics, 0, 0, WIDTH, 9);

    }

    public static void drawCircle(Graphics graphics, double cornerX, double cornerY, double width, int count) {
        double a = width/2*Math.sqrt(3.0);
        double l = (a*Math.sqrt(3))/2;
        if (count == 1) {
        } else {
            graphics.drawOval((int) cornerX, (int) cornerY, (int) width, (int) width);
            drawCircle(graphics, cornerX+width/4, cornerY, width/2, count-1);
            drawCircle(graphics, cornerX+(width/32), cornerY+l/2, width/2, count-1);
            drawCircle(graphics, cornerX+width/2-(width/32), cornerY+l/2, width/2, count-1);
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
