package calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
//import java.awt.Toolkit;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	JButton btnC;
	JButton button;
	JButton btnNewButton;
	JButton button_1;
	JButton button_2;
	JButton button_3;
	JButton button_4;
	JButton button_5;
	JButton button_6;
	JButton button_7;
	JButton button_8;
	JButton button_9;
	JButton button_10;
	JButton button_11;
	JButton button_12;
	JButton button_13;
	JButton button_14;
	JButton button_15;
	
	JLabel lblNewLabel;
	
	JRadioButton rdbtnOff;
	JRadioButton rdbtnOn;
	
	Double number, answer;
	int operator;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
		rdbtnOn.setEnabled(false);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(223, 11, 75, 14);
		frame.getContentPane().add(lblNewLabel);
		
	}


	/** 
	 * Disable the controls of the calculator when user selects 'off' radio button
	 */
	public void disableAllControls(){
		rdbtnOff.setEnabled(false);
		rdbtnOn.setEnabled(true);
		textField.setEnabled(false);
		btnC.setEnabled(false);
		button.setEnabled(false);
		btnNewButton.setEnabled(false);
		button_1.setEnabled(false);
		button_2.setEnabled(false);
		button_3.setEnabled(false);
		button_4.setEnabled(false);
		button_5.setEnabled(false);
		button_6.setEnabled(false);
		button_7.setEnabled(false);
		button_8.setEnabled(false);
		button_9.setEnabled(false);
		button_10.setEnabled(false);
		button_11.setEnabled(false);
		button_12.setEnabled(false);
		button_13.setEnabled(false);
		button_14.setEnabled(false);
		button_15.setEnabled(false);
	}
	
	/** 
	 * Enable the controls of the calculator when user selects 'on' radio button
	 */
	public void enableAllControls(){
		textField.setText(null);
		rdbtnOff.setEnabled(true);
		rdbtnOn.setEnabled(false);
		textField.setEnabled(true);
		btnC.setEnabled(true);
		button.setEnabled(true);
		btnNewButton.setEnabled(true);
		button_1.setEnabled(true);
		button_2.setEnabled(true);
		button_3.setEnabled(true);
		button_4.setEnabled(true);
		button_5.setEnabled(true);
		button_6.setEnabled(true);
		button_7.setEnabled(true);
		button_8.setEnabled(true);
		button_9.setEnabled(true);
		button_10.setEnabled(true);
		button_11.setEnabled(true);
		button_12.setEnabled(true);
		button_13.setEnabled(true);
		button_14.setEnabled(true);
		button_15.setEnabled(true);
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calculator - By Prahlad");
	//	frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\prahl\\workspace\\Calculator App\\src\\icon\\calculatorIcon.png"));
		frame.setResizable(false);
		frame.setBounds(100, 100, 327, 446);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(true);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setBounds(8, 27, 290, 52);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		rdbtnOn = new JRadioButton("ON", true);
		rdbtnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enableAllControls();
			}
		});
		rdbtnOn.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnOn.setBounds(6, 100, 54, 23);
		frame.getContentPane().add(rdbtnOn);
		
		rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disableAllControls();
			}
		});
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnOff.setBounds(6, 126, 54, 23);
		frame.getContentPane().add(rdbtnOff);
		
		ButtonGroup onOff = new ButtonGroup();
		onOff.add(rdbtnOn);
		onOff.add(rdbtnOff);
		
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnC.setBounds(66, 100, 60, 45);
		frame.getContentPane().add(btnC);
		
		button = new JButton("<--");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int length = textField.getText().length();
				int lastPosition = length - 1;
				String afterDelete;
				if(length > 0){
					StringBuilder back = new StringBuilder(textField.getText());
					back.deleteCharAt(lastPosition);
					afterDelete = back.toString();
					textField.setText(afterDelete);
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 24));
		button.setBounds(136, 100, 84, 45);
		frame.getContentPane().add(button);
		
		btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton.setBounds(10, 177, 60, 45);
		frame.getContentPane().add(btnNewButton);
		
		button_1 = new JButton("8");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_1.setBounds(86, 177, 60, 45);
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton("9");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_2.setBounds(162, 177, 60, 45);
		frame.getContentPane().add(button_2);
		
		button_3 = new JButton("-");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(textField.getText());
				operator = 2; // for subtraction
				textField.setText(null);
				lblNewLabel.setText(Double.toString(number));
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_3.setBounds(238, 177, 60, 45);
		frame.getContentPane().add(button_3);
		
		button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_4.setBounds(8, 233, 60, 45);
		frame.getContentPane().add(button_4);
		
		button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_5.setBounds(84, 233, 60, 45);
		frame.getContentPane().add(button_5);
		
		button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_6.setBounds(160, 233, 60, 45);
		frame.getContentPane().add(button_6);
		
		button_7 = new JButton("*");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(textField.getText());
				operator = 3; // for multiplication
				textField.setText(null);
				lblNewLabel.setText(Double.toString(number));
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_7.setBounds(236, 233, 60, 45);
		frame.getContentPane().add(button_7);
		
		button_8 = new JButton("1");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_8.setBounds(8, 289, 60, 45);
		frame.getContentPane().add(button_8);
		
		button_9 = new JButton("2");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_9.setBounds(84, 289, 60, 45);
		frame.getContentPane().add(button_9);
		
		button_10 = new JButton("3");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_10.setBounds(160, 289, 60, 45);
		frame.getContentPane().add(button_10);
		
		button_11 = new JButton("/");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(textField.getText());
				operator = 4; // for division
				textField.setText(null);
				lblNewLabel.setText(Double.toString(number));
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_11.setBounds(236, 289, 60, 45);
		frame.getContentPane().add(button_11);
		
		button_12 = new JButton("0");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "0");
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_12.setBounds(10, 351, 60, 45);
		frame.getContentPane().add(button_12);
		
		button_13 = new JButton(".");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_13.setBounds(86, 351, 60, 45);
		frame.getContentPane().add(button_13);
		
		button_14 = new JButton("=");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				arithmeticOperation();
				lblNewLabel.setText(null);
			}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_14.setBounds(162, 351, 135, 45);
		frame.getContentPane().add(button_14);
	
		button_15 = new JButton("+");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(textField.getText());
				operator = 1; // for addition
				textField.setText(null);
				lblNewLabel.setText(number + "+");
				
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_15.setBounds(238, 100, 60, 45);
		frame.getContentPane().add(button_15);
	}
	
	/** 
	 * Calculation
	 */
	public void arithmeticOperation(){
		switch(operator){
		case 1: // Addition
			answer = number + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(answer));
			break;
		case 2: // Subtraction
			answer = number - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(answer));
			break;
		case 3: // Multiplication
			answer = number * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(answer));
			break;
		case 4: // Division
			answer = number / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(answer));
			break;
		}
	}
}
