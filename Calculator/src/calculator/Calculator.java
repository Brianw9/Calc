package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;



public class Calculator extends eval {

	private JFrame frame;
	private JTextField txtDisplay;

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
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 237, 366);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setEditable(true);
		txtDisplay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDisplay.setBounds(10, 11, 211, 41);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		//---------First Row-------(Clear, Divide, Multiply, Subtract)
		
		
			JButton btnClear = new JButton("C");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtDisplay.setText(null);
				}
			});
			btnClear.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnClear.setBounds(10, 63, 50, 50);
			frame.getContentPane().add(btnClear);
			
			JButton btnDivide = new JButton("/");
			btnDivide.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String EnterNumber = txtDisplay.getText() + " " + btnDivide.getText() + " ";
					txtDisplay.setText(EnterNumber);
				}
			});
			btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnDivide.setBounds(65, 63, 50, 50);
			frame.getContentPane().add(btnDivide);
			
			JButton btnMulti = new JButton("*");
			btnMulti.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String EnterNumber = txtDisplay.getText() + " " + btnMulti.getText() + " ";
					txtDisplay.setText(EnterNumber);
				}
			});
			btnMulti.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnMulti.setBounds(120, 63, 50, 50);
			frame.getContentPane().add(btnMulti);
			
			JButton btnMinus = new JButton("-");
			btnMinus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String EnterNumber = txtDisplay.getText() + " " + btnMinus.getText() + " ";
					txtDisplay.setText(EnterNumber);
				}
			});
			btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnMinus.setBounds(173, 63, 50, 50);
			frame.getContentPane().add(btnMinus);
		
		//----------Second Row-----------(7,8,9)
		
			JButton btn7 = new JButton("7");
			btn7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String EnterNumber = txtDisplay.getText() + btn7.getText();
					txtDisplay.setText(EnterNumber);
					
				}
			});
			btn7.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btn7.setBounds(10, 115, 50, 50);
			frame.getContentPane().add(btn7);
			
			JButton btn8 = new JButton("8");
			btn8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String EnterNumber = txtDisplay.getText() + btn8.getText();
					txtDisplay.setText(EnterNumber );
				}
			});
			btn8.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btn8.setBounds(65, 115, 50, 50);
			frame.getContentPane().add(btn8);
			
			JButton btn9 = new JButton("9");
			btn9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String EnterNumber = txtDisplay.getText() + btn9.getText();
					txtDisplay.setText(EnterNumber );
				}
			});
			btn9.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btn9.setBounds(120, 115, 50, 50);
			frame.getContentPane().add(btn9);
		
		//---------Third Row------------(4,5,6, Plus)
		
			JButton btn4 = new JButton("4");
			btn4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String EnterNumber = txtDisplay.getText() + btn4.getText();
					txtDisplay.setText(EnterNumber );
				}
			});
			btn4.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btn4.setBounds(10, 167, 50, 50);
			frame.getContentPane().add(btn4);
			
			JButton btn5 = new JButton("5");
			btn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String EnterNumber = txtDisplay.getText() + btn5.getText();
					txtDisplay.setText(EnterNumber );
				}
			});
			btn5.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btn5.setBounds(65, 167, 50, 50);
			frame.getContentPane().add(btn5);
			
			JButton btn6 = new JButton("6");
			btn6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String EnterNumber = txtDisplay.getText() + btn6.getText();
					txtDisplay.setText(EnterNumber );
				}
			});
			btn6.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btn6.setBounds(120, 167, 50, 50);
			frame.getContentPane().add(btn6);
			
			JButton btnPlus = new JButton("+");
			btnPlus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String EnterNumber = txtDisplay.getText() + " " + btnPlus.getText() + " ";
					txtDisplay.setText(EnterNumber);
				}
			});
			btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnPlus.setBounds(173, 115, 50, 102);
			frame.getContentPane().add(btnPlus);
		
		//---------Fourth Row-----------(1,2,3)
		
			JButton btn1 = new JButton("1");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String EnterNumber = txtDisplay.getText() + btn1.getText();
					txtDisplay.setText(EnterNumber );
				}
			});
			btn1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btn1.setBounds(10, 219, 50, 50);
			frame.getContentPane().add(btn1);
			
			JButton btn2 = new JButton("2");
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String EnterNumber = txtDisplay.getText() + btn2.getText();
					txtDisplay.setText(EnterNumber );
				}
			});
			btn2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btn2.setBounds(65, 219, 50, 50);
			frame.getContentPane().add(btn2);
			
			JButton btn3 = new JButton("3");
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String EnterNumber = txtDisplay.getText() + btn3.getText();
					txtDisplay.setText(EnterNumber );
				}
			});
			btn3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btn3.setBounds(120, 219, 50, 50);
			frame.getContentPane().add(btn3);
		
		//-------Fifth Row---------(0, Period, Enter)
		
			JButton btn0 = new JButton("0");
			btn0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String EnterNumber = txtDisplay.getText() + btn0.getText();
					txtDisplay.setText(EnterNumber );
				}
			});
			btn0.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btn0.setBounds(10, 271, 105, 50);
			frame.getContentPane().add(btn0);
			
			JButton btnDot = new JButton(".");
			btnDot.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String EnterNumber = txtDisplay.getText() + btnDot.getText();
					txtDisplay.setText(EnterNumber );
				}
			});
			btnDot.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnDot.setBounds(120, 271, 50, 50);
			frame.getContentPane().add(btnDot);
			
			JButton btnEquals = new JButton("=");
			btnEquals.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String Calculate = txtDisplay.getText();
					txtDisplay.setText(String.valueOf(eval(Calculate)));
					
				}	
			});
			btnEquals.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnEquals.setBounds(173, 219, 50, 102);
			frame.getContentPane().add(btnEquals);
	}
}
