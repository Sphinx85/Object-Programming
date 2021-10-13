package Swing;

import javax.swing.*;
import java.awt.*;

public class TestSwing {
    public static void main(String[] args) {
        testFrame();
    }

    private static void testFrame() {
        JFrame frame = new JFrame("Test Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Ну наконец-то я запилил сюда текст, но увы пришлось включить урок");
        frame.getContentPane().add(label);
        frame.setBounds(0,0,200,500);
        frame.pack();
        frame.setVisible(true);
    }
}
