package LinePlay;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {
        for (int i = 1; i*20 <= WIDTH ; i++) {
            int x1=20; int y1=0; int x2=320; int y2=20;
            graphics.setColor(Color.MAGENTA);
            drawLines(x1*i, y1, x2, y2*i, graphics);
            graphics.setColor(Color.BLUE);
            drawLines((x1-20), (20+y1)*i, (x2-300)*i, (y2+300), graphics);
        }
    }
    public  static void drawLines(int x1,int y1, int x2, int y2, Graphics graphics) {
        graphics.drawLine(x1,y1,x2, y2);
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
