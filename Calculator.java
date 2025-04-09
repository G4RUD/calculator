
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JTextField textField = new JTextField();
        JPanel panel = new JPanel(new GridLayout(4, 4));
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            panel.add(button);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String cmd = e.getActionCommand();
                    if (cmd.equals("C")) {
                        textField.setText("");
                    } else if (cmd.equals("=")) {
                        try {
                            String result = String.valueOf(eval(textField.getText()));
                            textField.setText(result);
                        } catch (Exception ex) {
                            textField.setText("Error");
                        }
                    } else {
                        textField.setText(textField.getText() + cmd);
                    }
                }
            });
        }

        frame.setLayout(new BorderLayout());
        frame.add(textField, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static double eval(String expr) {
        return new javax.script.ScriptEngineManager()
            .getEngineByName("JavaScript")
            .eval(expr, new javax.script.SimpleBindings());
    }
}
