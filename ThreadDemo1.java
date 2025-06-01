/*Assignment - 2
Set A
b) Write a program in which thread sleep for 6 sec in the loop in reverse order from 100
to 1 and change the name of thread.
*/

public class ThreadDemo1 extends Thread 
{
	public void run()
	{
		for(int i=100;i>=1;i--)
		{
			System.out.println(Thread.currentThread().getName());
			try
			{
				sleep(6000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) 
	{
	     ThreadDemo1 ob=new ThreadDemo1();
	     ob.setName("BCS");
	     ob.start();
	}
}