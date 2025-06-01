/*Assignment - 2
Set B
c) Write a program that implements a multi-thread application that has three threads. 
First thread generates random integer every 1 second and if the value is even, second 
thread computes the square of the number and prints. If the value is odd, the third 
thread will print the value of cube of the number.
*/

import java.util.*;
class thread1 extends Thread
{
	int n;
	Random r;
	Thread t;
	public void run()
	{
		r=new Random();
		for(int i=0;i<10;i++)
	    { 
		   n=r.nextInt(20);
	       System.out.println("Random Number : "+n);
	       try
	       {
	         if(n%2==0)
	         {
	        	 thread2 t2=new thread2(n); 
	    	     t2.start();
	         }
	         else
	         {
	        	 thread3 t3=new thread3(n);
	    	     t3.start();
	         }
	         sleep(1000);
	       }
	       catch(Exception e)
	       {
	    	   e.printStackTrace();
	       }
	    }
	}
}
class thread2 extends Thread
{
	int x;
	thread2(int n)
	{
		x=n;
	}
	public void run()
	{
		int sq=x*x;
		System.out.println("Square : "+sq);
	}
}
class thread3 extends Thread
{
	int x;
	thread3(int n)
	{
		x=n;
	}
	public void run()
	{
		int cu=x*x*x;
		System.out.println("Cube : "+cu);
	}
}
public class MultiThread
{
	public static void main(String[] args)
	{
		thread1 t1=new thread1();
		t1.start();
	}
}