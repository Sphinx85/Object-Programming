package Swing;

import javax.swing.*;
import java.awt.*;

public class ContentPane2 extends JFrame {

    public ContentPane2() {
        super("Test two");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel content = new JPanel();

        content.add(new Figure(Color.red, 0));
        content.add(new Button("Knock"));
        content.add(new Container());

        setContentPane(content);

        setPreferredSize(new Dimension(400,400));
        setVisible(true);
    }

    public static void main(String[] args) {

        new ContentPane2();
    }
}
