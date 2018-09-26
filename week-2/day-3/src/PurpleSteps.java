import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void mainDraw(Graphics graphics) {
//      Reproduce this:
//      https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png
        printSteps(graphics, 9, 20);
    }
    public static void printSteps (Graphics g, int howManySteps, int howBigSteps) {
        for (int i = 0; i < howManySteps ; i++) {
            g.setColor(Color.black);
            g.drawRect(i*howBigSteps, i*howBigSteps, howBigSteps, howBigSteps);
            g.setColor(Color.PINK);
            g.fillRect(i*howBigSteps+1, i*howBigSteps+1, howBigSteps-1, howBigSteps-1);
        }
    }


    // Don't touch the code below
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

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}