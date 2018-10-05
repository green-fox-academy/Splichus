import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagons {
    public static void mainDraw(Graphics graphics) {
        drawOneLevel(graphics, 0, 0, 900, 9);


    }

    public static void drawOneLevel (Graphics graphics, double cornerX, double cornerY, double width, int count){
        double a = width/2.0;
        double l = (a*Math.sqrt(3.0))/2;
        double heigth = 2*l;
        if (count == 1){
        } else {
            graphics.drawLine((int) (cornerX + (width / 4)), (int) cornerY, (int) cornerX, (int) (cornerY + l));
            graphics.drawLine((int) (cornerX), (int) (cornerY + l), (int) (cornerX + (width / 4)), (int) (cornerY + (2 * l)));
            graphics.drawLine((int) (cornerX + (width / 4)), (int) (cornerY + (2 * l)), (int) (cornerX + (3 * width / 4)), (int) (cornerY + (2 * l)));
            graphics.drawLine((int) (cornerX + (3 * width / 4)), (int) (cornerY + (2 * l)), (int) (cornerX + width), (int) (cornerY + l));
            graphics.drawLine((int) (cornerX + width), (int) (cornerY + l), (int) (cornerX + (3 * width / 4)), (int) (cornerY));
            graphics.drawLine((int) (cornerX + (3 * width / 4)), (int) (cornerY), (int) (cornerX + (width / 4)), (int) (cornerY));
            drawOneLevel(graphics, cornerX+(width/8), cornerY, width/2.0, count-1);
            drawOneLevel(graphics, cornerX+(width/8), cornerY+l, width/2.0, count-1);
            drawOneLevel(graphics, cornerX+(width/2), cornerY+(l/2), width/2.0, count-1);
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