package All;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class Main implements ActionListener{
	
	double num1 = 0;
	double num2 = 0;
	double memoryResult;
	double result = 0;
	int calculation;
	String operation;
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JTextField textField = new JTextField();
	JButton button_c = new JButton("C");
	JButton button_m = new JButton("M");
	JButton button_root = new JButton("√");
	JButton button_plus = new JButton("+");
	JButton button_log = new JButton("log");
	JButton button_sin = new JButton("sin");
	JButton button_minus = new JButton("-");
	JButton button_ln = new JButton("ln");
	JButton button_cos = new JButton("cos");
	JButton button_multiplication = new JButton("*");
	JButton button_power = new JButton("x^y");
	JButton button_tan = new JButton("tan");
	JButton button_division = new JButton("/");
	JButton button_second_power = new JButton("x^2");
	JButton button_mod = new JButton("mod");
	JButton button_third_power = new JButton("x^3");
	JButton button_factorial = new JButton("x!");
	JButton button_equals = new JButton("=");
	JButton button_zero = new JButton("0");
	JButton button_point = new JButton(".");
	JButton button_one = new JButton("1");
	JButton button_two = new JButton("2");
	JButton button_three = new JButton("3");
	JButton button_four = new JButton("4");
	JButton button_five = new JButton("5");
	JButton button_six = new JButton("6");
	JButton button_seven = new JButton("7");
	JButton button_eight = new JButton("8");
	JButton button_nine = new JButton("9");
	JButton button_pie = new JButton("Pie");
	
	public void AddComponents()
	{
		label.setBounds(390,0,50,50);
		label.setForeground(Color.white);
		frame.add(label);
		
		textField.setBounds(10,40,410,40);
		textField.setFont(new Font("Arial",Font.BOLD,20));
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.add(textField);
		
		button_c.setBounds(10,90,60,40);
		button_c.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(button_c);
		
		button_seven.setBounds(10,140,60,40);
		button_seven.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(button_seven);
		
		button_four.setBounds(10,190,60,40);
		button_four.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(button_four);
		
		button_one.setBounds(10,240,60,40);
		button_one.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(button_one);
		
		button_m.setBounds(80,90,60,40);
		button_m.setFont(new Font("Arial",Font.BOLD,15));
		frame.add(button_m);
		
		button_eight.setBounds(80,140,60,40);
		button_eight.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(button_eight);
		
		button_five.setBounds(80,190,60,40);
		button_five.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(button_five);
		
		button_two.setBounds(80,240,60,40);
		button_two.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(button_two);
		
		button_zero.setBounds(10,290,130,40);
		button_zero.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(button_zero);
		
		button_root.setBounds(150,90,60,40);
		button_root.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(button_root);
		
		button_nine.setBounds(150,140,60,40);
		button_nine.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(button_nine);
		
		button_six.setBounds(150,190,60,40);
		button_six.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(button_six);
		
		button_three.setBounds(150,240,60,40);
		button_three.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(button_three);
		
		button_point.setBounds(150,290,60,40);
		button_point.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(button_point);
		
		button_plus.setBounds(220,90,60,40);
		button_plus.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(button_plus);
		
		button_minus.setBounds(220,140,60,40);
		button_minus.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(button_minus);
		
		button_multiplication.setBounds(220,190,60,40);
		button_multiplication.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(button_multiplication);
		
		button_division.setBounds(220,240,60,40);
		button_division.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(button_division);
		
		button_equals.setBounds(220,290,60,40);
		button_equals.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(button_equals);
		
		button_log.setBounds(290,90,60,40);
		button_log.setFont(new Font("Arial",Font.BOLD,15));
		frame.add(button_log);
		
		button_ln.setBounds(290,140,60,40);
		button_ln.setFont(new Font("Arial",Font.BOLD,15));
		frame.add(button_ln);
		
		button_power.setBounds(290,190,60,40);
		button_power.setFont(new Font("Arial",Font.BOLD,15));
		frame.add(button_power);
		
		button_second_power.setBounds(290,240,60,40);
		button_second_power.setFont(new Font("Arial",Font.BOLD,15));
		frame.add(button_second_power);
		
		button_third_power.setBounds(290,290,60,40);
		button_third_power.setFont(new Font("Arial",Font.BOLD,15));
		frame.add(button_third_power);
		
		button_sin.setBounds(360,90,60,40);
		button_sin.setFont(new Font("Arial",Font.BOLD,15));
		frame.add(button_sin);
		
		button_cos.setBounds(360,140,60,40);
		button_cos.setFont(new Font("Arial",Font.BOLD,12));
		frame.add(button_cos);
		
		button_tan.setBounds(360,190,60,40);
		button_tan.setFont(new Font("Arial",Font.BOLD,15));
		frame.add(button_tan);
		
		button_mod.setBounds(360,240,60,40);
		button_mod.setFont(new Font("Arial",Font.BOLD,12));
		frame.add(button_mod);
		
		button_factorial.setBounds(360,290,60,40);
		button_factorial.setFont(new Font("Arial",Font.BOLD,12));
		frame.add(button_factorial);
		
		button_pie.setBounds(430,90,60,40);
		button_pie.setFont(new Font("Arial",Font.BOLD,15));
		frame.add(button_pie);
	}
	
	public static void Run()
	{
		Main application = new Main();
		application.prepareGui();
		application.AddComponents();
		application.addActionEvent();;
	}
	
	void prepareGui()
	{
		frame.setSize(550, 400);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.gray);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		Run();

	}
	
	public void addActionEvent() {
		button_c.addActionListener(this);
		button_m.addActionListener(this);
		button_root.addActionListener(this);
		button_plus.addActionListener(this);
		button_log.addActionListener(this);
		button_sin.addActionListener(this);
		button_seven.addActionListener(this);
		button_eight.addActionListener(this);
		button_nine.addActionListener(this);
		button_minus.addActionListener(this);
		button_ln.addActionListener(this);
		button_cos.addActionListener(this);
		button_four.addActionListener(this);
		button_five.addActionListener(this);
		button_six.addActionListener(this);
		button_multiplication.addActionListener(this);
		button_power.addActionListener(this);
		button_tan.addActionListener(this);
		button_one.addActionListener(this);
		button_two.addActionListener(this);
		button_three.addActionListener(this);
		button_division.addActionListener(this);
		button_second_power.addActionListener(this);
		button_mod.addActionListener(this);
		button_zero.addActionListener(this);
		button_point.addActionListener(this);
		button_equals.addActionListener(this);
		button_third_power.addActionListener(this);
		button_factorial.addActionListener(this);
		button_pie.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		
		Object source = e.getSource();
		
		if(source == button_c)
		{
			label.setText("");
			textField.setText("");
		}
		else if(source == button_zero)
		{
			if(textField.getText().equals("0"))
			{
				return;
			}
			else
			{
				textField.setText(textField.getText() + "0");
			}
		}
		else if(source == button_one)
		{
			textField.setText(textField.getText() + "1");
		}
		else if(source == button_two)
		{
			textField.setText(textField.getText() + "2");
		}
		else if(source == button_three)
		{
			textField.setText(textField.getText() + "3");
		}
		else if(source == button_four)
		{
			textField.setText(textField.getText() + "4");
		}
		else if(source == button_five)
		{
			textField.setText(textField.getText() + "5");
		}
		else if(source == button_six)
		{
			textField.setText(textField.getText() + "6");
		}
		else if(source == button_seven)
		{
			textField.setText(textField.getText() + "7");
		}
		else if(source == button_eight)
		{
			textField.setText(textField.getText() + "8");
		}
		else if(source == button_nine)
		{
			textField.setText(textField.getText() + "9");
		}
		else if(source == button_point)
		{
			if(textField.getText().contains("."))
			{
				return;
			}
			else
			{
				textField.setText(textField.getText() + ".");
			}
		}
		else if(source == button_plus)
		{
			operation = "addition";
			num1 = Double.parseDouble(textField.getText());
			textField.setText("");
		}
		else if(source == button_minus)
		{
			operation = "subtraction";
			num1 = Double.parseDouble(textField.getText());
			textField.setText("");
		}
		else if(source == button_multiplication)
		{
			operation = "multiplication";
			num1 = Double.parseDouble(textField.getText());
			textField.setText("");
		}
		else if(source == button_division)
		{
			operation = "division";
			num1 = Double.parseDouble(textField.getText());
			textField.setText("");
		}
		else if(source == button_root)
		{
			operation = "root";
			num1 = Double.parseDouble(textField.getText());
			textField.setText("");
			result = Math.sqrt(num1);
			textField.setText("" + result);
		}
		else if(source == button_log)
		{
			operation = "log";
			num1 = Double.parseDouble(textField.getText());
			textField.setText("");
			result = Math.log(num1);
			textField.setText("" + result);
		}
		else if(source == button_ln)
		{
			operation = "ln";
			num1 = Double.parseDouble(textField.getText());
			textField.setText("");
			result = (1/num1)*Math.log(num1);
			textField.setText("" + result);
		}
		else if(source == button_power)
		{
			operation = "power";
			num1 = Double.parseDouble(textField.getText());
			textField.setText("");
		}
		else if(source == button_second_power)
		{
			num1 = Double.parseDouble(textField.getText());
			textField.setText("");
			result = num1 * num1;
			textField.setText("" + result);
		}
		else if(source == button_third_power)
		{
			num1 = Double.parseDouble(textField.getText());
			textField.setText("");
			result = num1 * num1 * num1;
			textField.setText("" + result);
		}
		else if(source == button_sin)
		{
			num1 = Double.parseDouble(textField.getText());
			textField.setText("");
			result = Math.sin(num1);
			textField.setText("" + result);
		}
		else if(source == button_cos)
		{
			num1 = Double.parseDouble(textField.getText());
			textField.setText("");
			result = Math.cos(num1);
			textField.setText("" + result);
		}
		else if(source == button_tan)
		{
			num1 = Double.parseDouble(textField.getText());
			textField.setText("");
			result = Math.tan(num1);
			textField.setText("" + result);
		}
		else if(source == button_factorial)
		{
			num1 = Double.parseDouble(textField.getText());
			textField.setText("");
			result = 1;
			int localVar = (int)num1;
			for(int i = 1; i <= localVar; i++)
			{
				result = result * i;
			}
			textField.setText("" + result);
		}
		else if(source == button_mod)
		{
			operation = "mod";
			num1 = Double.parseDouble(textField.getText());
			textField.setText("");
		}
		else if(source == button_m)
		{
			textField.setText("" + memoryResult);
		}
		else if(source == button_equals)
		{
			memoryResult = result;
			num2 = Double.parseDouble(textField.getText());
			textField.setText("");
			if(operation == "addition")
			{
				result = num1 + num2;
			}
			else if(operation == "subtraction")
			{
				result = num1 - num2;
			}
			else if(operation == "multiplication")
			{
				result = num1 * num2;
			}
			else if(operation == "division")
			{
				result = num1 / num2;
			}
			else if(operation == "power")
			{
				result = Math.pow(num1, num2);
			}
			else if(operation == "mod")
			{
				result = num1 % num2;
			}
			textField.setText("" + result);
		}
	}

}
