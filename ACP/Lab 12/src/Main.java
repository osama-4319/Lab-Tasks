import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
                                //********************** Calculator Class **********************\\
class Calculator implements ActionListener {

    JFrame frame = new JFrame("Osmi Calculator");
    JPanel textPanel = new JPanel(new BorderLayout());
    JPanel buttonPanel = new JPanel(new GridLayout(4, 1, 5, 5));
    JTextField screen = new JTextField("");
    double firstOperand = 0;
    double secondOperand = 0;
    char operator;
                                //********************** Constructor **********************\\
    Calculator() {
        frame.setVisible(true);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout());
        screen.setPreferredSize(new Dimension(300, 50));
        // Adding Panels to Frame
        frame.add(textPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);
        // Buttons adding
        textPanel.add(screen);
        for (int i = 1; i <= 9; i++) {
            buttonPanel.add(createButton(Integer.toString(i)));
        }
        buttonPanel.add(createButton("0"));
        buttonPanel.add(createButton("="));
        buttonPanel.add(createButton("C"));
        buttonPanel.add(createButton("+"));
        buttonPanel.add(createButton("-"));
        buttonPanel.add(createButton("/"));
        buttonPanel.add(createButton("*"));
        //Close java processing after closing window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
                                //********************** Create Buttons **********************\\
    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.addActionListener(this);
        return button;
    }
                                //********************** Action Performed **********************\\
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "+":
            case "-":
            case "*":
            case "/":
                operator = command.charAt(0);
                if (!screen.getText().isEmpty()) {
                    firstOperand = Double.parseDouble(screen.getText());
                }
                screen.setText("");
                break;
            case "=":
                if (!screen.getText().isEmpty()) {
                    secondOperand = Double.parseDouble(screen.getText());
                    double result = calculate();
                    screen.setText(Double.toString(result));
                }
                break;
            case "C":
                screen.setText("");
                break;
            default:
                screen.setText(screen.getText() + ((JButton) e.getSource()).getText());
                break;
        }
    }
                                //********************** Calculation **********************\\
    private double calculate() {
        double result = 0;
        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0)
                    result = firstOperand / secondOperand;
                else
                    screen.setText("Error: Division by zero");
                break;
        }
        return result;
    }
}
                                //********************** Entry Point **********************\\
public class Main{
     public static void main(String[] args) {
        //SwingUtilities.invokeLater(() -> new Calculator());
        Calculator obj = new Calculator();
    }
}