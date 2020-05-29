package PurpleSteps3d;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        int x=5;
        int y=2;
        for (int i = 0; i <6 ; i++) {
            drawSquare(x += y ,y += 10,graphics);
        }
    }
    public  static void drawSquare(int x,int y, Graphics graphics) {
        graphics.setColor(Color.MAGENTA);
        graphics.fillRect(x,x,y,y);
        graphics.setColor(Color.black);
        graphics.drawRect(x,x,y,y);
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
