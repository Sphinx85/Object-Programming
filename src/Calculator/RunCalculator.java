package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RunCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel content = new JPanel(new VerticalLayout());
        content.add(new TextField("text",10));

        class ButAction implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        }
        
        JPanel grid = new JPanel();
        GridLayout gLayout = new GridLayout(4,4,5,5);
        grid.setLayout(gLayout);
        for (int i = 9; i > 6; i--){
            grid.add(new JButton(String.valueOf(i)));

        }
        grid.add(new JButton("/"));
        for (int i = 6; i > 3; i--){
            grid.add(new JButton(String.valueOf(i)));
        }
        grid.add(new JButton("*"));
        for (int i = 3; i > 0; i--){
            grid.add(new JButton(String.valueOf(i)));
        }
        grid.add(new JButton("-"));
        grid.add(new JButton("0"));
        grid.add(new JButton("+"));
        grid.add(new JButton("^x"));
        grid.add(new JButton("="));
        //frame.getContentPane().add(grid);

        content.add(grid);

        frame.setContentPane(content);
        //frame.pack();
        frame.setVisible(true);


    }

    public void addAction(JButton button){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Test" + button.getText());
            }
        });
    }
}
