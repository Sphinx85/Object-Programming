package Swing;

import javax.swing.*;
import java.awt.*;

public class LayeredPane extends JFrame {
    public LayeredPane(){
        super("Tet Layered Pane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();
        Figure figure1 = new Figure(Color.red, 0);
        Figure figure2 = new Figure(Color.yellow, 0);
        Figure figure3 = new Figure(Color.black,1);

        figure1.setBounds(70,80,90,90);
        figure2.setBounds(170,310,100,300);
        figure3.setBounds(300,300,400,200);

        lp.add(figure1, JLayeredPane.POPUP_LAYER);
        lp.add(figure2, JLayeredPane.PALETTE_LAYER);
        lp.add(figure3, JLayeredPane.PALETTE_LAYER);

        setSize(800,600);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(false);
        new LayeredPane();
    }
}
