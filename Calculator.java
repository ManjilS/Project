package program;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {
	String str="";
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
					frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 104, 546, 288);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str= str+btnNewButton.getText();
				textField.setText(str);
			}
		});
		
		btnNewButton.setBounds(10, 226, 55, 41);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str= str+btnNewButton_1.getText();
				textField.setText(str);
			}
		});
		btnNewButton_1.setBounds(99, 226, 55, 41);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str= str+btnNewButton_2.getText();
				textField.setText(str);
			}
		});
		btnNewButton_2.setBounds(191, 226, 55, 41);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str= str+btnNewButton_3.getText();
				textField.setText(str);
			}
		});
		btnNewButton_3.setBounds(10, 164, 55, 41);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str= str+btnNewButton_4.getText();
				textField.setText(str);
			}
		});
		btnNewButton_4.setBounds(97, 164, 55, 41);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str= str+btnNewButton_5.getText();
				textField.setText(str);
			}
		});
		btnNewButton_5.setBounds(191, 164, 55, 41);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str= str+btnNewButton_6.getText();
				textField.setText(str);
			}
		});
		btnNewButton_6.setBounds(10, 107, 55, 47);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str= str+btnNewButton_7.getText();
				textField.setText(str);
			}
		});
		btnNewButton_7.setBounds(99, 107, 55, 47);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str= str+btnNewButton_8.getText();
				textField.setText(str);
			}
		});
		btnNewButton_8.setBounds(191, 108, 55, 46);
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str= str+btnNewButton_9.getText();
				textField.setText(str);
			}
		});
		btnNewButton_9.setBounds(10, 50, 55, 47);
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton(".");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str= str+btnNewButton_10.getText();
				textField.setText(str);
			}
		});
		btnNewButton_10.setBounds(96, 47, 58, 47);
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("AC");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
				str="";
			}
		});
		btnNewButton_11.setBounds(188, 50, 55, 41);
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("+");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str= str+btnNewButton_12.getText();
				textField.setText(str);
			}
		});
		btnNewButton_12.setBounds(290, 76, 55, 47);
		panel.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("-");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str= str+btnNewButton_13.getText();
				textField.setText(str);
			}
		});
		btnNewButton_13.setBounds(399, 76, 55, 47);
		panel.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("*");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str= str+btnNewButton_14.getText();
				textField.setText(str);
			}
		});
		btnNewButton_14.setBounds(290, 146, 55, 47);
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("/");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str= str+btnNewButton_15.getText();
				textField.setText(str);
			}
		});
		btnNewButton_15.setBounds(397, 146, 57, 47);
		panel.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("=");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1="";
				String n2="";
				boolean operatorFound=false;
				String operator="";
				int flag =0;double sum=0;
				for (int i = 0; i < str.length(); i++) {
			        char currentChar = str.charAt(i);

			        
					if (!operatorFound) {
			            if (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/') {
			                operator = String.valueOf(currentChar);
			                operatorFound = true;
			            } else {
			                n1 += currentChar;
			            }
			        } else {
			            n2 += currentChar;
			        }
			    }
				
				if (e.getSource() == btnNewButton_16) {
			        double number1 = Double.parseDouble(n1);
			        double number2 = Double.parseDouble(n2);

			        switch (operator) {
			            case "+":
			                sum = number1 + number2;
			                break;
			            case "-":
			                sum = number1 - number2;
			                break;
			            case "*":
			                sum = number1 * number2;
			                break;
			            case "/":
			                if (number2 != 0) {
			                    sum = number1 / number2;
			                } else {
			                    textField.setText("Error: Division by zero");
			                    return;
			                }
			                break;
			            default:
			                textField.setText("Error: Invalid operator");
			                return;
			        }

			        textField.setText(String.valueOf(sum));
			    }
			}			
		});
		btnNewButton_16.setBounds(333, 212, 85, 55);
		panel.add(btnNewButton_16);
		
		textField = new JTextField();
		textField.setBounds(10, 24, 546, 70);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
