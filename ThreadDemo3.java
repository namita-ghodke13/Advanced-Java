/*Assignment - 2
Set C
c) Using the concepts of thread synchronization create two threads as sender and 
receiver. Sender thread will set a message to the receiver thread that will display the 
message on console. The sender thread accepts the input message from console.
Continue this process until sender sets the message as “Good Bye Corona”.
*/

import java.io.*;
import java.util.*;
class Message
{
	private String msg;
	private boolean empty=true;
	public synchronized String receive()
	{
		while(empty)
		{
			try
			{
				wait();
			}
			catch(InterruptedException ie)
			{ }
		}
		empty=true;
		notifyAll();
		return msg;
	}
	public synchronized void send(String msg)
	{
		while(!empty)
		{
			try
			{
				wait();
			}
			catch(InterruptedException ie)
			{ }
		}
		empty=false;
		this.msg=msg;
		notifyAll();
	}
}
class Sender implements Runnable
{
	private Message m;
	public Sender(Message m)
	{
		this.m=m;
	}
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter a Message : ");
			String msg=sc.nextLine();
			m.send(msg);
            if(msg.equals("Good Bye Corona"))
            {
            	break;
            }
		}
	}
}
class Receiver implements Runnable
{
	private Message m;
	public Receiver(Message m)
	{
		this.m=m;
	}
	public void run()
	{
		while(true)
		{
			String msg=m.receive();
			System.out.println("\nReceived Message : "+msg);
			if(msg.equals("Good Bye Corona"))
			{
				break;
			}
		}
	}
}
public class ThreadDemo3 
{
	public static void main(String[] args) 
	{
         Message m=new Message();
         Sender s=new Sender(m);
         Receiver r=new Receiver(m);
         Thread st=new Thread(s);
         Thread rt=new Thread(r);
         st.start();
         rt.start();
	}
}