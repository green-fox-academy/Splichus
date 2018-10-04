import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {
    public static void mainDraw(Graphics graphics) {
        drawOneLevel(graphics, 0, 0, 900, 900, 7);

    }

    public static void drawOneLevel (Graphics graphics, double cornerX, double cornerY, double width, double height, int count){
        if (count == 1) {

        } else {
        graphics.drawLine((int)(cornerX+width/3), (int)cornerY, (int)(cornerX+width/3), (int)(cornerY+height));
        graphics.drawLine((int)(cornerX+2*width/3), (int)cornerY, (int) (cornerX+2*width/3),(int)(cornerY+height));
        graphics.drawLine((int)(cornerX), (int)(cornerY+height/3), (int)(cornerX+width), (int)(cornerY+height/3));
        graphics.drawLine((int)(cornerX), (int)(cornerY+2*height/3), (int)(cornerX+width), (int)(cornerY+2*height/3));
        drawOneLevel(graphics, cornerX+width/3.0, cornerY, width/3.0, height/3.0, count-1);
        drawOneLevel(graphics, cornerX, cornerY+height/3.0, width/3.0, height/3.0, count-1);
        drawOneLevel(graphics, cornerX+2*width/3.0, cornerY+height/3.0, width/3.0, height/3.0, count-1);
        drawOneLevel(graphics, cornerX+height/3.0,cornerY+2*height/3.0, width/3.0, height/3.0, count-1);
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