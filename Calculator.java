
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public JFrame frame;
    public JTextField textField;
    public double first, second, result;
    String operation, answer;

    public static void main(String[] args) {
        //
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Calculator calculator = new Calculator();
                    calculator.frame.setVisible(true);
                } catch (Exception e) {
                    // Good for debugging purpose
                    e.printStackTrace();
                }
            }
        });
    }

    // Creating a constructor for the Calculator Class
    public Calculator() {
        initialize();
    }

    // Creating Initialize method for the Constructor
    public void initialize() {
        // Creating my Calculator Frame
        frame = new JFrame("Calculator");
        frame.setResizable(false);
        frame.setSize(300,420);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Creating a text field
        textField = new JTextField();
        textField.setFont(new Font("Tahoma",Font.PLAIN, 32));
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setBounds(5,5,280,60);
        frame.getContentPane().add(textField);

        // Creating a LayOut

        // Creating a Clear Button
        JButton clear = new JButton("C");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    textField.setText(null);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        clear.setFont(new Font("Tahoma",Font.BOLD,22));
        clear.setForeground(new Color(51,204,255));
        clear.setBounds(5,70,60,60);
        frame.getContentPane().add(clear);

        // % symbol
        JButton percent = new JButton("%");
        percent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    first = Double.parseDouble(textField.getText());
                    textField.setText("");
                    operation = "%";

                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        percent.setFont(new Font("Tahoma",Font.BOLD,20));
        percent.setForeground(new Color(51,204,255));
        percent.setBounds(70,70,60,60);
        frame.getContentPane().add(percent);

        // Creating a BackSpace Button
        JButton delete = new JButton("Del");
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    if (textField.getText().length() > 0) {
                        StringBuilder obj = new StringBuilder(textField.getText());
                        obj.deleteCharAt(textField.getText().length() - 1);
                        String s = obj.toString();
                        textField.setText(s);
                    }

                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        delete.setFont(new Font("Tahoma",Font.BOLD,16));
        delete.setForeground(new Color(51,204,255));
        delete.setBounds(135,70,60,60);
        frame.getContentPane().add(delete);

        // Creating a divide button
        JButton divide = new JButton("/");
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    first = Double.parseDouble(textField.getText());
                    textField.setText("");
                    operation = "/";
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        divide.setFont(new Font("Tahoma",Font.BOLD,22));
        divide.setForeground(new Color(51,204,255));
        divide.setBounds(200,70,80,60);
        frame.getContentPane().add(divide);

        // Creating a "7" button
        JButton seven = new JButton("7");
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String num = textField.getText() + seven.getText();
                    textField.setText(num);

                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        seven.setFont(new Font("Tahoma",Font.BOLD,22));
        seven.setForeground(new Color(0,0,0));
        seven.setBounds(5,135,60,60);
        frame.getContentPane().add(seven);

        // Creating a "8" button
        JButton eight = new JButton("8");
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String num = textField.getText() + eight.getText();
                    textField.setText(num);

                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        eight.setFont(new Font("Tahoma",Font.BOLD,22));
        eight.setForeground(new Color(0,0,0));
        eight.setBounds(70,135,60,60);
        frame.getContentPane().add(eight);

        // Creating a "9" Button
        JButton nine = new JButton("9");
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = textField.getText() + nine.getText();
                textField.setText(num);
            }
        });
        nine.setFont(new Font("Tahoma",Font.BOLD,22));
        nine.setForeground(new Color(0,0,0));
        nine.setBounds(135,135,60,60);
        frame.getContentPane().add(nine);

        // Creating a multiply Button
        JButton multiply = new JButton("x");
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    first = Double.parseDouble(textField.getText());
                    textField.setText("");
                    operation = "x";
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        multiply.setFont(new Font("Tahoma",Font.BOLD,22));
        multiply.setForeground(new Color (51,204,255));
        multiply.setBounds(200,135,80,60);
        frame.getContentPane().add(multiply);

        // Creating a "4" button
        JButton four = new JButton("4");
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = textField.getText() + four.getText();
                textField.setText(num);
            }
        });
        four.setFont(new Font("Tahoma",Font.BOLD,22));
        four.setForeground(new Color(0,0,0));
        four.setBounds(5,200,60,60);
        frame.getContentPane().add(four);

        // Creating a "5" button
        JButton five = new JButton("5");
        five.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num = textField.getText() + five.getText();
                textField.setText(num);
            }
        });
        five.setFont(new Font("Tahoma",Font.BOLD,22));
        five.setForeground(new Color(0,0,0));
        five.setBounds(70,200,60,60);
        frame.getContentPane().add(five);

        // Creating a "6" button
        JButton six = new JButton("6");
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = textField.getText() + six.getText();
                textField.setText(num);
            }
        });
        six.setFont(new Font("Tahoma",Font.BOLD,22));
        six.setForeground(new Color(0,0,0));
        six.setBounds(135,200,60,60);
        frame.getContentPane().add(six);

        // Creating "-" sign
        JButton minus = new JButton("-");
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    first = Double.parseDouble(textField.getText());
                    textField.setText("");
                    operation = "-";
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        minus.setFont(new Font("Tahoma",Font.BOLD,22));
        minus.setForeground(new Color(51,204,255));
        minus.setBounds(200,200,80,60);
        frame.getContentPane().add(minus);

        // Creating a "1" button
        JButton one = new JButton("1");
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = textField.getText() + one.getText();
                textField.setText(num);
            }
        });
        one.setFont(new Font("Tahoma",Font.BOLD,22));
        one.setForeground(new Color(0,0,0));
        one.setBounds(5,265,60,60);
        frame.getContentPane().add(one);

        // Creating a "2" button
        JButton two = new JButton("2");
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = textField.getText() + two.getText();
                textField.setText(num);
            }
        });
        two.setFont(new Font("Tahoma",Font.BOLD,22));
        two.setForeground(new Color(0,0,0));
        two.setBounds(70,265,60,60);
        frame.getContentPane().add(two);

        // Creating a "3" button
        JButton three = new JButton("3");
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = textField.getText() + three.getText();
                textField.setText(num);
            }
        });
        three.setFont(new Font("Tahoma",Font.BOLD,22));
        three.setForeground(new Color(0,0,0));
        three.setBounds(135,265,60,60);
        frame.getContentPane().add(three);

        // Creating a "+" button
        JButton plus = new JButton("+");
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    first = Double.parseDouble(textField.getText());
                    textField.setText("");
                    operation = "+";
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        plus.setFont(new Font("Tahoma",Font.BOLD,22));
        plus.setForeground(new Color(51,204,255));
        plus.setBounds(200,265,80,60);
        frame.getContentPane().add(plus);

        // Adding "0" button
        JButton zero = new JButton("0");
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = textField.getText() + zero.getText();
                textField.setText(num);
            }
        });
        zero.setFont(new Font("Tahoma",Font.BOLD,22));
        zero.setForeground(new Color(0,0,0));
        zero.setBounds(5,330,125,50);
        frame.getContentPane().add(zero);

        // Creating a decimal button
        JButton decimal = new JButton(".");
        decimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = textField.getText() + decimal.getText();
                textField.setText(num);
            }
        });
        decimal.setFont(new Font("Tahoma",Font.BOLD,22));
        decimal.setForeground(new Color(0,0,0));
        decimal.setBounds(135,330,60,50);
        frame.getContentPane().add(decimal);

        // Creating equals button
        JButton equals = new JButton("=");
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    second = Double.parseDouble(textField.getText());
                    switch (operation) {

                        case "+":
                            result = first + second;
                            answer = String.format("%.2f",result);
                            textField.setText(answer);
                            break;

                        case "-":
                            result = first - second;
                            answer = String.format("%.2f",result);
                            textField.setText(answer);
                            break;

                        case "x":
                            result = first * second;
                            answer = String.format("%.2f",result);
                            textField.setText(answer);
                            break;

                        case "/":
                            if (second > 0) {
                                result = first / second;
                                answer = String.format("%.2f",result);
                                textField.setText(answer);
                                break;
                            }

                        case "%":
                            result = first % second;
                            answer = String.format("%.2f",result);
                            textField.setText(answer);
                            break;

                    }
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        equals.setFont(new Font("Tahoma",Font.BOLD,22));
        equals.setForeground(new Color(51,204,255));
        equals.setBounds(200,330,80,50);
        frame.getContentPane().add(equals);

    }

}
