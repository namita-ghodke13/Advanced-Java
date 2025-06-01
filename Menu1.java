/*Assignment - 1
Set C
c) Read a text file, specified by the first command line argument, into a list. The 
program should then display a menu which performs the following operations on the list: 
1.Insert line  2.Delete line  3.Append line  4.Modify line  5.Exit
When the user selects Exit, save the contents of the list to the file and end the 
program.
*/

import java.util.*;
import java.io.*;
public class Menu1 
{
	public static void main(String[] arg) 
	{
         Scanner sc=new Scanner(System.in);
         try
         {
        	 File f=new File(arg[0]);
        	 BufferedReader br=null;
        	 br=new BufferedReader(new FileReader(f));
        	 FileOutputStream fout=new FileOutputStream(arg[0]);
        	 int ch;
        	 ArrayList a1=new ArrayList();
        	 String line="";
        	 while((line=br.readLine())!=null)
        	 {
        		 a1.add(line);
        	 }
        	 do
        	 {
        		 System.out.println("1-Insert Line \n2-Delete Line \n3-Append Line \n4-Modify Line \n5-Exit");
        		 System.out.println("Enter Your Choice : ");
        		 ch=sc.nextInt();
        		 String l1="This is a new Line";
        		 switch(ch)
        		 {
        		     case 1:a1.add(l1);
        		                break;
        		     case 2:a1.remove(l1);
        		                break;
        		     case 3:a1.add(l1);
        		                break;
        		     case 4:int n=a1.size()-1;
        		                a1.set(n,"\tUpdated Line");
        		                break;
        		     case 5:ListIterator li=a1.listIterator();
        		                while(li.hasNext())
        		                {
        		                	String l2=(String)li.next();
        		                	byte b[]=l2.getBytes();
        		                	fout.write(b);
        		                }
        		                System.exit(1);
        		                break;
        		 }
        	 }
        	 while(ch<6);
        	 br.close();
        	 fout.close();
         }
         catch(Exception e)
         {
        	 System.out.println(e);
         }
	}
}