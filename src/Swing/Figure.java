package Swing;

import javax.swing.*;
import java.awt.*;

public class Figure extends JComponent {

    private final Color color;
    private final int type;

    public Figure(Color color, int type) {
        this.color = color;
        this.type = type;
        setOpaque(false);
    }

    public void paintComponent(Graphics g){
        g.setColor(color);
        switch (type){
            case 0:
                g.fillOval(0,0,200,200);
                break;

            case 1:
                g.fillRect(0,0,300,300);
                break;
        }
    }
}
