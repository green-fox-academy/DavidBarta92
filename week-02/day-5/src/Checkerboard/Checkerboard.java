package Checkerboard;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        int size = 10;
        int x = 0;
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if ( x % 2 == 0 ) {
                    graphics.setColor(Color.black);
                } else {
                    graphics.setColor(Color.white);
                }
                x++;
                graphics.fillRect(j*(WIDTH/size),i *(HEIGHT/size),WIDTH/size,HEIGHT/size);
            }
            x++;
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
