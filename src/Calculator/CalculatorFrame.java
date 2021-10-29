package Calculator;

import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame {

    String [] keys = {"7","8","9","/","4","5","6","*","1","2","3","-","0","^","=","+"};
    Integer variableOne;
    Integer variableTwo;
    String action;
    StringBuilder stringBuilder = new StringBuilder();

    public CalculatorFrame(){
        //Создаем окно и основную рабочую панель
        JFrame calcFrame = new JFrame("Sphinx Calculator");
        setDefaultLookAndFeelDecorated(false);
        setPreferredSize(new Dimension(640,480));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container mainFrame = calcFrame.getContentPane();

        //Создаем дисплей калькулятора
        JTextField calculatorDisplay = new JTextField(20);
        calculatorDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
        calcFrame.add(calculatorDisplay);

        //Создаем клавиатуру калькулятора
        JPanel keyboard = new JPanel();
        GridLayout grid = new GridLayout(4,4,5,5);
        keyboard.setLayout(grid);
        //Добавляем кнопки на панель
        for (int i = 0; i < keys.length; i++){
            JButton button = new JButton(keys[i]);
            keyboard.add(button);
            selectFunction(button, calculatorDisplay,checkSymbol(keys[i]),keys[i]);
        }

        calcFrame.getContentPane().add(keyboard);
        pack();
        setVisible(true);

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

    private void selectFunction(JButton button, JTextField textField, Integer symbol, String key) {

        switch (symbol){
            case 0:
                button.addActionListener(e -> textField.setText(textField.getText()+key));
                break;
            case 1:
                break;
            case 2:
                break;
        }
    }
}
