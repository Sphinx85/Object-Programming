package Calculator;

import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame {

    String [] keys = {"7","8","9","/","4","5","6","*","1","2","3","-","0","^","=","+"};
    Integer variableOne = 0;
    Integer variableTwo = 0;
    //Integer controller;
    String action;
    //StringBuilder stringBuilder = new StringBuilder();
    //int stringBuilderLength;

    public CalculatorFrame(){
        //Создаем окно и основную рабочую панель
        JFrame calcFrame = new JFrame("Sphinx Calculator");
        setDefaultLookAndFeelDecorated(false);
        //setPreferredSize(new Dimension(640,480));
        calcFrame.setSize(640,480);
        calcFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container mainFrame = calcFrame.getContentPane();

        //Создаем дисплей калькулятора
        JTextField calculatorDisplay = new JTextField(20);
        calculatorDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
        mainFrame.add(calculatorDisplay, "North");

        //Создаем клавиатуру калькулятора
        JPanel keyboard = new JPanel();
        GridLayout grid = new GridLayout(4,4,5,5);
        keyboard.setLayout(grid);
        //Добавляем кнопки на панель
        for (String key : keys) {
            JButton button = new JButton(key);
            keyboard.add(button);
            selectFunction(button, calculatorDisplay, checkSymbol(key), key);
        }

        calcFrame.getContentPane().add(keyboard);
        calcFrame.pack();
        calcFrame.setVisible(true);
    }

    private Integer checkSymbol(String key) {
        if (key.equals("/") ||
            key.equals("*") ||
            key.equals("-") ||
            key.equals("+") ||
            key.equals("^")){
            return 1;
        } else if(key.equals("=")){
            return 2;
        } else return 0;
    }

    private void selectFunction(JButton button, JTextField display, Integer symbol, String key) {

        switch (symbol){
            case 0:
                button.addActionListener(e -> display.setText(display.getText()+key));
                break;
            case 1:

                button.addActionListener(e -> {

                    if (variableOne.equals(0)){
                        variableOne = Integer.valueOf(display.getText());
                        action = key;
                        display.setText("");

                    } else {
                        variableTwo = Integer.valueOf(display.getText());
                        display.setText(Integer.toString(calculate(variableOne,variableTwo,action)));
                        action = key;
                    }
                    //display.setText(Integer.toString(calculate(variableOne,variableTwo,action)));
                    /*if (variableOne.equals(null)){
                        variableOne = Integer.valueOf(display.getText());
                        action = key;
                        display.setText("");

                    } else {
                        variableTwo = Integer.valueOf(display.getText());
                        action = key;
                        display.setText(Integer.toString(calculate(variableOne,variableTwo,key)));
                    }*/
                    //stringBuilder.append(display.getText());
                    //stringBuilderLength = stringBuilder.length();
                    //stringBuilder.delete(0,stringBuilder.length());

                    //System.out.println("display " + stringBuilder);
                    System.out.println("Var 1 " + variableOne);
                    System.out.println("Var 2 " + variableTwo);
                    System.out.println("action " + action);
                    System.out.println(calculate(variableOne,variableTwo,action));
                    //System.out.println("stringLength " + stringBuilderLength);

                });


                break;
            case 2:
                break;
        }
    }

    private int calculate(Integer variableOne, Integer variableTwo, String action) {
        int result = 0;


        switch (action){
            case "+":
                result = variableOne + variableTwo;
                break;
            case "-":
                result = variableOne - variableTwo;
            default:
                throw new IllegalStateException("Неизвестное действие: " + action);
        }
        return result;
    }
}
