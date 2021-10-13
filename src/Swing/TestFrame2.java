package Swing;

import javax.swing.*;
import java.awt.*;

public class TestFrame2 {
    public static void main(String[] args) {
        createGUI();
    }

    private static void createGUI() {
        JFrame frame = new JFrame("Третье тестовое окно");
        JLabel label = new JLabel("Оказалось все идет слоями");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(label);
        frame.setPreferredSize(new Dimension(200,200));
        frame.pack();
        frame.setVisible(true);
    }
}
