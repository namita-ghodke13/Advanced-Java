/*Assignment - 2
Set B
a) Write a program to calculate the sum and average of an array of 1000 integers 
(generated randomly) using 10 threads. Each thread calculates the sum of 100 
integers. Use these values to calculate average. [Use join method ].
*/

import java.util.*;
public class Random1 extends Thread
{
	Random r;
	Thread t;
	static int total,avg1;
	int a[]=new int[100];
	Random1(String name) throws InterruptedException
	{
		t=new Thread(this,name);
		r=new Random();
		for(int i=0;i<10;i++)
		{
			a[i]=r.nextInt(5);
		}
		t.start();
		t.join();
	}
	public void run()
	{
		int sum=0;
		for(int i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<10;i++)
		{
			sum=sum+a[i];
		}
		total=total+sum;
		System.out.println("Sum of "+Thread.currentThread().getName()+" : "+sum);
	}
	static void avg()
	{
		System.out.println("Total Sum of Threads :"+total);
		avg1=total/5;
		System.out.println("Average : "+avg1);
	}
	public static void main(String[] args) throws InterruptedException 
	{
         Random1 t1=new Random1("t1");
         Random1 t2=new Random1("t2");
         Random1 t3=new Random1("t3");
         Random1 t4=new Random1("t4");
         Random1 t5=new Random1("t5");
         avg();
	}
}