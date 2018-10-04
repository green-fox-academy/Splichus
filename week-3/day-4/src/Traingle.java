import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Traingle {
    public static void mainDraw(Graphics graphics) {
        drawTriangles(graphics, 0, 0, 900, 6);


    }


    public static void drawTriangles (Graphics graphics, double cornerX, double cornerY, double width, int count){
        double l = (width*Math.sqrt(3.0))/2.0;
        graphics.drawLine((int) (cornerX+width/2), (int)cornerY, (int)(cornerX+width/4), (int)(cornerY+l));
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