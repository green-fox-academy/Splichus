import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredBoxFunction {

    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 1 parameter:
        // the square size
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.
        for (int i = 0; i < 3; i++) {
            drawSquare(graphics, rn(1, HEIGHT));
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
    public static void drawSquare (Graphics graphics, int size) {
        graphics.setColor(randomColor());
        graphics.drawRect(WIDTH/2-size/2, HEIGHT/2 - size/2, size, size);
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