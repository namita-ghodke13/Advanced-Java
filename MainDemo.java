/*Assignment - 2
Set A
c) Write a program to solve producer consumer problem in which a producer produces 
a value and consumer consume the value before producer generate the next value. 
(Hint: use thread synchronization)
*/

import java.util.*;
class Shop
{
	int material;
	boolean flag=false;
	public synchronized int get()
	{
		while(flag==false)
		{
			try
			{
			     wait();	
			}
			catch(Exception e)
			{
				e.getStackTrace();
			}
		}
		flag=false;
		notify();
		return material;
	}
    public synchronized void put(int value)
    {
	    while(flag==true)
	    {
		    try
		    {
			     wait();	
		    }
		    catch(Exception e)
		    {
			    e.getStackTrace();
		    }
	    }
	    material=value;
	    flag=true;
	    notify();
    }
}
class Consumer extends Thread
{
	Shop sh;
	int no;
	public Consumer(Shop sh,int no)
	{
		this.sh=sh;
		this.no=no;
	}
	public void run()
	{
		int val=0;
		for(int i=0;i<10;i++)
		{
			int value = sh.get();
			System.out.println("Consumer #"+this.no+"90+:"+value);
		}
	}
}
class Producer extends Thread
{
	Shop sh;
	int no;
	public Producer(Shop sh,int no)
	{
		this.sh=sh;
		this.no=no;
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			sh.put(i);
			System.out.println("Producer #"+this.no+"put :"+i);
			try
			{
			    sleep((int)(Math.random()*1000));
			}
			catch(Exception e)
			{
				e.getStackTrace();
			}
		}
	}
}
public class MainDemo
{
	public static void main(String[] args) 
	{
			Shop sh=new Shop();
			Producer p=new Producer(sh,1);
			Consumer c=new Consumer(sh,1);
			p.start();
			c.start();
	}
}