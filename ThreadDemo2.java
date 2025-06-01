/*Assignment - 2
Set B
b) Write a program for a simple search engine. Accept a string to be searched. Search 
for the string in all text files in the current folder. Use a separate thread for each file. 
The result should display the filename, line number where the string is found.
*/

import java.io.*;
import java.util.*;
class Mythread extends Thread
{
	String str;
	String fname;
   Mythread(String str,String fname)
	{
		this.str=str;
		this.fname=fname;
	}
	public void run()
	{
		try
		{
			int flag=0;
			File f=new File(fname);
			BufferedReader br=new BufferedReader(new FileReader(f));
			String line=" ";
			while((line=br.readLine())!=null)
			{
				if(line.contains(str)==true)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				System.out.println("String Found in Folder/File : "+fname+"\nLine where String is Found : "+line);
			}
			else
			{
				System.out.println("String not Found : "+fname);
			}
			br.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class ThreadDemo2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Search String : ");
		String str=sc.nextLine();
		String dirname="thread";
		File d=new File(dirname);
		if(d.isDirectory())
		{
			String s[]=d.list();
			for(int i=0;i<s.length;i++)
			{
				File f=new File(dirname + "/" +s[i]);
				if(f.isFile()&&s[i].endsWith(".txt"))
				{
					Mythread t=new Mythread(str,f.getAbsolutePath());
					t.start();
				}
			}

		}
		sc.close();
	}
}