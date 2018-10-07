import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagons {

    public static void mainDraw(Graphics graphics) {


        int cornerX = 0;
        int cornerY = 0;
        int width = Helpers.randomNumber(600, 50);
        int count = 6;

        drawHexagons(graphics, cornerX, cornerY, width, count);

    }

    public static void drawHexagons (Graphics graphics, double cornerX, double cornerY, double width, int count) {

        double l = (width/2*Math.sqrt(3))/2;

        if (count == 1) {
        } else {
            graphics.setColor(Helpers.randomColor());
            graphics.drawLine((int) (cornerX + (width / 4)), (int) cornerY, (int) cornerX, (int) (cornerY + l));
            graphics.drawLine((int) (cornerX), (int) (cornerY + l), (int) (cornerX + (width / 4)), (int) (cornerY + (2 * l)));
            graphics.drawLine((int) (cornerX + (width / 4)), (int) (cornerY + (2 * l)), (int) (cornerX + (3 * width / 4)), (int) (cornerY + (2 * l)));
            graphics.drawLine((int) (cornerX + (3 * width / 4)), (int) (cornerY + (2 * l)), (int) (cornerX + width), (int) (cornerY + l));
            graphics.drawLine((int) (cornerX + width), (int) (cornerY + l), (int) (cornerX + (3 * width / 4)), (int) (cornerY));
            graphics.drawLine((int) (cornerX + (3 * width / 4)), (int) (cornerY), (int) (cornerX + (width / 4)), (int) (cornerY));
            drawHexagons(graphics, cornerX + (width / 6), cornerY, width/3, count-1);
            drawHexagons(graphics, cornerX + width/2, cornerY, width/3, count - 1);
            drawHexagons(graphics, cornerX, cornerY+2*l/3, width/3, count-1);
            drawHexagons(graphics, cornerX+2*width/3, cornerY+2*l/3, width/3, count-1);
            drawHexagons(graphics, cornerX + (width / 6), cornerY+4*l/3, width/3, count-1);
            drawHexagons(graphics, cornerX + width/2, cornerY+4*l/3, width/3, count-1 );
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

        for (int i = 0; i < 100; i++) {
            panel.repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
