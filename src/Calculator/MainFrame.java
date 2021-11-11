package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    String [] keys = {"7","8","9","/","4","5","6","*","1","2","3","-","0","^","=","+"};
    Integer variableOne;
    Integer variableTwo;
    String action;
    StringBuilder stringBuilder = new StringBuilder();
    StringBuilder field = new StringBuilder();
    int builderStringLength;

    public MainFrame(){
        JFrame mainFrame = new JFrame("Calculator");
        setSize(400,400);
        setLocation(250,250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container disp = mainFrame.getContentPane();
        JTextField display = new JTextField(20);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        disp.add(display,"North");

        JPanel keyboard = new JPanel();
        GridLayout grid = new GridLayout(4,4,3,3);
        keyboard.setLayout(grid);
        for(int i = 0; i < 16; i++){
            JButton button = new JButton(keys[i]);
            keyboard.add(button);

            if(i == 1 || i == 0 || i == 2 || i == 8 || i == 4 || i == 5 || i == 6 || i == 9 || i == 10 || i == 12){
                checkFunction(button,0,display,i);
            } else if(keys[i].equals("/") || keys[i].equals("*") || keys[i].equals("-") || keys[i].equals("+") || keys[i].equals("^")){
                checkFunction(button,1,display,i);
            } else if(keys[i].equals("=")){
                checkFunction(button,2,display,i);
            }
        }
        mainFrame.getContentPane().add(keyboard);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    private void checkFunction(JButton button, int s,JTextField display,int symbol) {
        switch (s){
            case 0:
                button.addActionListener(e -> display.setText(display.getText() + keys[symbol]));
                break;

            case 1:
                button.addActionListener(e -> {

                        stringBuilder.append(display.getText());
                        builderStringLength = stringBuilder.length();
                        variableOne = Integer.valueOf(display.getText());
                        display.setText(display.getText() + keys[symbol]);
                        action = keys[symbol];
//                        display.setText("");
                    });
                break;

            case 2:
                button.addActionListener(e -> {
                    stringBuilder.delete(0, builderStringLength);
                    stringBuilder.append(display.getText());
                    variableTwo = Integer.valueOf(stringBuilder.substring(builderStringLength + 1));
                    builderStringLength = stringBuilder.length();
                    display.setText(Integer.toString(calculate(variableOne, variableTwo,action)));
                    variableOne = null;
                    variableTwo = null;
                    action = null;
                    stringBuilder.delete(0, builderStringLength);
                    builderStringLength = 0;
                });
        }
    }

    public int calculate(int temp1, int temp2, String action){
        int result = 0;
        switch (action){
            case "/": result = temp1 / temp2;
                break;
            case "*": result = temp1 * temp2;
                break;
            case "+": result = temp1 + temp2;
                break;
            case "-": result = temp1 - temp2;
                break;
            case "^":
                for(int i = 0, temp3 = 0; i < temp2; i++){
                    if(temp3 != 0){
                        temp3 = temp3 * temp1;
                    } else{
                        temp3 = temp1;
                    }
                    result = temp3;
                }
                break;

        }
        return result;
    }
}
