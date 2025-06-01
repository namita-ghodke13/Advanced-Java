/*Assignment - 2
Set C
b) Write a program to create a thread for moving a ball inside a panel vertically. The ball 
should be created when the user clicks on the start button.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BallPanel extends JPanel implements ActionListener
{
	private int ballr=10;
	private Timer t;
	public BallPanel()
	{
		JButton btn=new JButton("Start");
		btn.addActionListener(this);
		add(btn);
		t=new Timer(50,this);
	}
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillOval(50,ballr,30,30);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals("Start"))
		{
			t.start();
		}
		else
		{
			ballr+=5;
			if(ballr>=getHeight()-30)
			{
				t.stop();
			}
		}
		repaint();
	}
	public static void main(String[] args)
	{
        JFrame f=new JFrame("Moving Ball");
        BallPanel bp=new BallPanel();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(bp);
        f.setSize(400,400);
        f.setVisible(true);
	}
}