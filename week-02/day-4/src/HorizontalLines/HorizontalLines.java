package HorizontalLines;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {
    public static void mainDraw(Graphics graphics) {
        int[] xPoints = new int[]{50, 125, 245};
        int[] yPoints = new int[]{50, 20, 205};
        for (int i = 0; i < xPoints.length; i++) {
            drawer(xPoints[i], yPoints[i], graphics);


        }
    }
        public static void drawer(int x, int y, Graphics graphics) {
            int lineLength = 50;
            graphics.drawLine(x, y, x + lineLength, y);
        }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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
