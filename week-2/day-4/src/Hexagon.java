import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon {
    public static void mainDraw(Graphics graphics) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many lines you want");
        int size = scan.nextInt();
        System.out.println("How Big Hexagons you want");
        int length = scan.nextInt();

        int startX = WIDTH / 2 - length / 2;
        int startY = 70;
        double height = (length * Math.sqrt(3)) / 2;

        drawHexagon(graphics, startX, startY, length);
    }

    public static void drawLineOfHexagons (Graphics graphics, int x, int y, int lines, int length) {

        for (int i = 0; i < lines; i++) {
            drawHexagon(graphics, x, y+(2*i*length), length);
        }
    }

    public static void drawHexagon(Graphics graphics, int startX, int startY, int length) {

        double height = (length * Math.sqrt(3)) / 2;

        int[] xArray = {startX, startX-length/2, startX-length/2, startX+length/2, startX+length, startX+length/2};
        int[] yArray = {startY, (int)(startY-height), (int)(startY-(2*height)),(int)(startY-(2 * height)),(int)(startY-height),startY};

        graphics.drawPolygon(xArray, yArray, 6);
    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

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