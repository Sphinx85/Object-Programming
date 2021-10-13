package Swing;

import javax.swing.*;
import java.awt.*;

public class TestFrame {
    public static void main(String[] args) {
        newGUI();
    }

    private static void newGUI() {
        JFrame frame = new JFrame("Второе тестовое окно");
        JLabel label = new JLabel("Создал второе окно и создам вторую надпись");
        JLabel label2 = new JLabel("Ну а вот и вторая надпись. Закремляем материал");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(label);
        frame.getContentPane().add(label2);
        frame.setPreferredSize(new Dimension(300,500));
        frame.pack();
        frame.setVisible(true);
    }
}
