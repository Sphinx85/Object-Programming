package Swing;

import javax.swing.*;


public class ContentPane extends JFrame {
    public ContentPane() {
        super("Content Pane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        JPanel content = new JPanel();
        content.add(new JButton("First"));
        content.add(new JButton("Second"));

        setContentPane(content);

        setSize(400,200);


        //setPreferredSize(new Dimension(400,200));
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new ContentPane();
    }
}
