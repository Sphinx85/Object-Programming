package Calculator;

import javax.swing.*;
import java.awt.*;

public class RunCalculator {

    public static void main(String[] args) {
        //Создаем окно
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Создаем панель контента
        JPanel content = new JPanel(new VerticalLayout());

        //Создаем текстовое поле и выравнивание в нем
        JTextField textField = new JTextField("0",18);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        content.add(textField);

        //Создаем панель с кнопками
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

        //Добавляем все в окно
        content.add(grid);
        frame.setContentPane(content);
        frame.setSize(250,200);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
    //Функции кнопок
    public static void addAction(JButton button){
        button.addActionListener(e -> System.out.println("Test" + button.getText()));
    }
    //Функция кнопки результата
    public static void resultAction(JButton button){
        button.addActionListener(e -> System.out.println("result" + button.getText()));
    }
}