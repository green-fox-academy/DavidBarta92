package RainbowBoxFunction;

import javax.swing.*;

import java.awt.*;

import static CenterBoxFunction.CenterBoxFunction.drawSquare;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
        for (int i = 0; i < 3 ; i++) {
            double x = Math.random()*100;
            String[] color = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
            drawSquare(x,graphics);
        }
        public  static void drawSquare( double x, Graphics graphics) {
            int xX = (int)x;
            graphics.setColor(Color.blue);
            graphics.drawRect((WIDTH / 2) - (xX / 2), (HEIGHT / 2) - (xX / 2), xX, xX);
        }
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
