package StarryNight;

import javax.swing.*;
import java.awt.*;
import java.lang.Math;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.black);
        graphics.fillRect(0,0,WIDTH,HEIGHT);
        for (int i = 0; i < 100; i++){
            int source = (int) (Math.random()*100);
            stars(source, graphics);
        }
    }
    public static void stars(int source, Graphics graphics){
        int x = (int) (Math.random()*10);
        int y = (int) (Math.random()*10);
        graphics.setColor(new Color(source*2, source*2, source*2, source*2));
        graphics.fillRect(source*x,source*y,source/10,source/10);
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
