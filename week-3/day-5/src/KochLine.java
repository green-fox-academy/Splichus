import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class KochLine {

    public static void mainDraw(Graphics graphics) {
        int random = WIDTH;

        double startingX= random/4.0;
        double startingY = random/2.0;
        double endX = 3*random/4.0;
        int width = 300;
        int count = 2;

//        double startX = 50;
//        double startY = 50;
//        double endX   = 50 + 80 * Math.cos(-60 * Math.PI / 180);
//        double endY   = 50 + 80 * Math.sin(-60 * Math.PI / 180);

//        graphics.drawLine((int)startX, (int)startY, (int)endX, (int)endY );


        drawKochLine(graphics, startingX, startingY, endX, startingY, count);

    }

    public static void drawKochLine (Graphics graphics, double startingX, double startingY, double endX, double endY, int count) {
        double width = endX-startingX;
        graphics.setColor(Color.BLACK);
        graphics.drawLine((int)startingX, (int) startingY, (int)(endX), (int)endY);
//        graphics.setColor(Color.WHITE);
//        graphics.drawLine((int)(startingX+width/3),(int)startingY,(int)(endX-width/3), (int)endY);
        double l = (width/3*Math.sqrt(3.0)/2);
        if (count == 1) {
        } else {
            drawKochLine(graphics, startingX+2*width/3, startingY, startingX+(width/3) * (Math.cos(60 * Math.PI / 180)), startingY-(width/3) * (Math.sin(30 * Math.PI / 180)), count-1);
//            drawKochLine(graphics, startingX+2*width/3, startingY, startingX+width/2, startingY-l, count-1);

        }
    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
//        for (int i = 0; i < 100; i++) {
//            panel.repaint();
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            this.setBackground(Color.WHITE);
            mainDraw(graphics);
        }
    }
}
