import javax.swing.*;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {
    public static void mainDraw(Graphics graphics) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the length of the side?");
        int length = scan.nextInt();
        System.out.println("How many lines of pyramid you want?");
        int sizeOfThePyramid = scan.nextInt();


        int[] x = {WIDTH/2-length/2, WIDTH/2+length/2, WIDTH/2};
        double l = (((x[1]-x[0])*Math.sqrt(3.0))/2);
        System.out.println();
        int[] y = {length, length, length-(int)l};

        for (int i = 0; i < sizeOfThePyramid; i++) {
            for (int j = 0; j < 3; j++) {
                y[j] +=(int) l;
                x[j] -= length/2;
            }
            int [] copyOfX = Arrays.copyOf(x, 3);
            for (int j = 0; j <=i ; j++) {
                printTriangle(graphics, copyOfX, y);
                for (int k = 0; k < 3; k++) {
                    copyOfX[k] +=length;
                }
            }
        }
    }

    public static void printTriangle (Graphics graphics, int[] x, int[] y) {
        graphics.drawPolygon(x, y, 3);
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