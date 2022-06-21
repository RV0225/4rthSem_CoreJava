package Rough_Work;

import java.awt.*;

class MyCanvas extends Canvas {
    public MyCanvas() {
        setBackground(Color.gray);
        setSize(600, 600);
    }

    public void paint(Graphics g) {
        g.drawOval(80, 70, 150, 150);
        g.setColor(Color.BLACK);
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);
        g.drawArc(130, 180, 50, 20, 180, 180);
    }
}

public class Smiley {
    Smiley() {
        Frame f = new Frame("Hello");
        f.add(new MyCanvas());
        f.setLayout(null);
        f.setSize(800, 800);
        f.setVisible(true);

    }

    public static void main(String args[]) {
        new Smiley();
    }
}
