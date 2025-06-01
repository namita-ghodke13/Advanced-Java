/*Assignment - 2
Set A
a) Program to define a thread for printing text on output screen for ‘n’ number of times. 
Create 3 threads and run them. Pass the text ‘n’ parameters to the thread constructor. 
Example: 
i. First thread prints “COVID19” 10 times. 
ii. Second thread prints “LOCKDOWN2020” 20 times 
iii. Third thread prints “VACCINATED2021” 30 times
*/

import java.util.*;
public class ThreadDemo extends Thread
{
	String name;
	int n;
	ThreadDemo(String name,int n)
	{
		this.name=name;
		this.n=n;
	}
	public void run()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(name);
		}
	}
	public static void main(String[] args) 
	{
		ThreadDemo t1=new ThreadDemo("COVID19", 10);
		ThreadDemo t2=new ThreadDemo("LOCKDOWN2020", 20);
		ThreadDemo t3=new ThreadDemo("VACCINATED2021", 30);
		t1.start();
		t2.start();
		t3.start();
	}
}