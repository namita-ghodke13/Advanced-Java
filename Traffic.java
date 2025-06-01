/*Assignment - 2
Set C
a) Write a program that simulates a traffic light. The program lets the user select one of 
three lights: red, yellow, or green with radio buttons. On selecting a button, an 
appropriate message with “stop” or “ready” or “go”should appear above the buttons in 
a selected color. Initially there is no message shown.
*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Traffic extends JFrame implements ActionListener
{
	JPanel p=new JPanel();
	JLabel title=new JLabel("Traffic Light");
	JRadioButton b1=new JRadioButton("Red");
	JRadioButton b2=new JRadioButton("Yellow");
	JRadioButton b3=new JRadioButton("Green");
	JButton btn=new JButton("OK");
	ButtonGroup bg=new ButtonGroup();
	JLabel red;
	JLabel yellow;
	JLabel green;
	Traffic()
	{
		setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		setSize(800,700);
		setTitle("Java Project Program");
		setLocation(400,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		red=new JLabel("STOP");
		red.setForeground(Color.red);
		yellow=new JLabel("READY");
		yellow.setForeground(Color.yellow);
		green=new JLabel("GO");
		green.setForeground(Color.green);
		p.setPreferredSize(new Dimension(500,400));
		p.setLayout(null);
		p.setBackground(Color.LIGHT_GRAY);
		title.setBounds(200,0,200,100);
		p.add(title);
		b1.setBounds(100,210,100,20);
		p.add(b1);
		b2.setBounds(200,210,100,20);
		p.add(b2);
		b3.setBounds(300,210,100,20);
		p.add(b3);
		btn.setBounds(200,310,100,50);
		p.add(btn);
		btn.addActionListener(this);
		red.setBounds(220,110,100,50);
		yellow.setBounds(220,110,100,50);
		green.setBounds(220,110,100,50);
		b1.setForeground(Color.red);
		b2.setForeground(Color.yellow);
		b3.setForeground(Color.green);
		b1.setBackground(Color.LIGHT_GRAY);
		b2.setBackground(Color.LIGHT_GRAY);
		b3.setBackground(Color.LIGHT_GRAY);
		red.setFont(new Font("Arial",Font.BOLD,20));
		yellow.setFont(new Font("Arial",Font.BOLD,20));
		green.setFont(new Font("Arial",Font.BOLD,20));
		p.add(red);
		p.add(yellow);
		p.add(green);
		red.setVisible(false);
		yellow.setVisible(false);
		green.setVisible(false);
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		this.add(p);
		this.pack();
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btn)
		{
			if(b1.isSelected())
			{
				yellow.setVisible(false);
				green.setVisible(false);
				red.setVisible(true);
			}
			else if(b2.isSelected())
			{
				red.setVisible(false);
				green.setVisible(false);
				yellow.setVisible(true);
			}
			if(b3.isSelected())
			{
				red.setVisible(false);
				yellow.setVisible(false);
				green.setVisible(true);
			}
		}
	}
	public static void main(String[] args) 
	{
          new Traffic();
	}
}