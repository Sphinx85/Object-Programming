package Calculator;

import javax.swing.*;
import java.awt.*;

public class RunCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel content = new JPanel(new VerticalLayout());
        content.add(new TextField("0",25));
        JPanel grid = new JPanel();
        GridLayout gLayout = new GridLayout(4,4,5,5);
        grid.setLayout(gLayout);

        for (int i = 9; i > 6; i--){
            addAction((JButton) grid.add(new JButton(String.valueOf(i))));
        }
        addAction((JButton) grid.add(new JButton("/")));
        for (int i = 6; i > 3; i--){
            addAction((JButton) grid.add(new JButton(String.valueOf(i))));
        }
        addAction((JButton) grid.add(new JButton("*")));
        for (int i = 3; i > 0; i--){
            addAction((JButton) grid.add(new JButton(String.valueOf(i))));
        }
        addAction((JButton) grid.add(new JButton("-")));
        addAction((JButton) grid.add(new JButton("0")));
        addAction((JButton) grid.add(new JButton("+")));
        addAction((JButton) grid.add(new JButton("^x")));
        resultAction((JButton) grid.add(new JButton("=")));

        content.add(grid);
        frame.setContentPane(content);
        frame.setVisible(true);
    }

    public static void addAction(JButton button){
        button.addActionListener(e -> System.out.println("Test" + button.getText()));
    }

    public static void resultAction(JButton button){
        button.addActionListener(e -> System.out.println("result" + button.getText()));
    }
}