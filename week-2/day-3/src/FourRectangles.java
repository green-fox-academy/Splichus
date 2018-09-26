import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        for (int i = 0; i < 4 ; i++) {
            drawRandomRectangle(graphics);
            }

    }
    public static Color randomColor () {
        Color colour = new Color(rn(0, 256), rn(0, 256), rn(0, 256));
        return colour;
    }
    public static int rn (int lowerLimit, int range) {
        int toReturn = lowerLimit + ((int)(Math.random()*range));
        return toReturn;
    }
    public static void drawRandomRectangle (Graphics graphics) {
        graphics.setColor(randomColor());
        int x = rn(0, WIDTH);
        int y = rn (0, HEIGHT);
        int width = rn (1, HEIGHT-x);
        int height = rn (1, WIDTH - y);
        graphics.fillRect(x, y, width, height);
    }


    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}