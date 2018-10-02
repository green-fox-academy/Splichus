import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Test {
    public static void mainDraw(Graphics graphics) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many lines you want");
        int size = 7;
        System.out.println("How Big Hexagons you want");
        int length = 50;

        double height = (length * Math.sqrt(3)) / 2;
        int startX = WIDTH / 2 - length / 2;
        int startY = HEIGHT/2 - (int)(size*height);

        for (int i = 0; i <= size/2; i++ ) {
            if (i==3) {
                graphics.setColor(Color.BLUE);
                drawLineOfHexagons(graphics, (int)(startX-(1.5*i*length)), (int)(startY+(i*height)), size-i, length);
                drawLineOfHexagons(graphics, (int)(startX+(1.5*i*length)), (int)(startY+(i*height)), size-i, length);
            }
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
    public static void drawLineOfHexagons (Graphics graphics, int x, int y, int lines, int length) {
        double height = (length * Math.sqrt(3)) / 2;
        for (int i = 0; i < lines; i++) {
            if (i == 0 || i == lines-1) {
                graphics.setColor(Color.BLUE);
                drawHexagon(graphics, x, (int)(y+(2*i*height)), length);
                graphics.setColor(Color.BLACK);
                drawHexagonBoarder(graphics, x, (int)(y+(2*i*height)), length, 1);
            }else {
                graphics.setColor(Color.GRAY);
                drawHexagon(graphics, x, (int)(y+(2*i*height)), length);
                graphics.setColor(Color.BLACK);
                drawHexagonBoarder(graphics, x, (int)(y+(2*i*height)), length, 1);
            }
        }
    }
    public static void drawHexagon(Graphics graphics, int startX, int startY, int length) {

        double height = (length * Math.sqrt(3)) / 2;
        int[] xArray = {startX, startX - length / 2, startX, startX + length, startX + length + length / 2, startX + length};
        int[] yArray = {startY, (int) (startY - height), (int) (startY - (2 * height)), (int) (startY - (2 * height)), (int) (startY - height), startY};
        graphics.fillPolygon(xArray, yArray, 6);
    }
    public static void drawHexagonBoarder (Graphics graphics, int startX, int startY, int length, int thickness) {

        double height = (length * Math.sqrt(3)) / 2;
        int[] xArray = {startX, startX-length/2, startX, startX+length, startX+length+length/2, startX+length};
        int[] yArray = {startY, (int)(startY-height), (int)(startY-(2*height)),(int)(startY-(2 * height)),(int)(startY-height),startY};

        graphics.drawPolygon(xArray, yArray, 6);

        for (int i = 0; i < thickness; i++) {
            for (int j = 0; j < xArray.length; j++) {
                xArray[j]-=1;
                yArray[j]-=1;
            }
            graphics.drawPolygon(xArray, yArray, 6);
        }

    }

    // Don't touch the code below
    static int WIDTH = 1000;
    static int HEIGHT = 1000;

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