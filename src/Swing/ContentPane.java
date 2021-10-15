package Swing;

import javax.swing.*;
import java.awt.*;

public class ContentPane extends JFrame {
    public ContentPane() {
        super("Content Pane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        JPanel content = new JPanel();
        content.add(new Button("First"));
        content.add(new Button("Second"));

        setContentPane(content);


        setPreferredSize(new Dimension(100,200));
        setVisible(true);
    }

    public static void main(String[] args) {
        new ContentPane();
    }
}
