    import javax.swing.*;

    import java.awt.*;
    import java.util.Scanner;

    import static javax.swing.JFrame.EXIT_ON_CLOSE;

    public class LinePlay {
        public static void mainDraw(Graphics graphics) {
            Scanner scan = new Scanner(System.in);
            System.out.println("How many on page?");
            double kolik = Math.sqrt((double)scan.nextInt());

            for (int i = 0; i <= kolik; i++) {
                for (int j = 0; j <= kolik; j++) {
                    for (int k = 0; k < WIDTH/ kolik; k +=3) {
                        graphics.setColor(Color.GREEN);
                        graphics.drawLine((int)(WIDTH-(((kolik -i)/ kolik)*WIDTH)+k), (int)(HEIGHT-((((kolik -j)/ kolik)*HEIGHT))), (int)(WIDTH-(((kolik -i-1)/ kolik)*WIDTH)), (int)(HEIGHT-((((kolik -j)/ kolik)*HEIGHT)))+k);
                        graphics.setColor(Color.BLUE);
                        graphics.drawLine((int)(WIDTH-(((kolik -i)/ kolik)*WIDTH)), (int)(HEIGHT-((((kolik -j)/ kolik)*HEIGHT)))+k, (int)(WIDTH-(((kolik -i)/ kolik)*WIDTH))+k, (int)(HEIGHT-((((kolik -j-1)/ kolik)*HEIGHT))));
                    }
                }
            }
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