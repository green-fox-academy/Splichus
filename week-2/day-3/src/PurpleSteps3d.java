import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]
        printSteps(graphics, 7, 10);

    }
    public static void printSteps (Graphics g, int howManySteps, int length) {
        int sum = 0;
        for (int i = 0; i < howManySteps ; i++) {
            sum += i;
            g.setColor(Color.black);
            g.drawRect(sum*length, sum*length, i*length+length, i*length+length);
            g.setColor(Color.BLUE);
            g.fillRect(sum*length+1, sum*length+1, i*length+length-1, i*length+length-1);
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