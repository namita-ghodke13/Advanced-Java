/*Assignment - 1
Set B
c) Write a program that loads names and phone numbers from a text file where the data 
is organized as one line per record and each field in a record are separated by a tab 
(\t).it takes a name or phone number as input and prints the corresponding other value 
from the hash table.(hint : use hash tables)
*/

import java.util.*;
import java.io.*;
public class File1 
{
	public static void main(String[] args)throws IOException
	{
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new FileReader("D:/Eclipse Programs/file.txt"));
        Hashtable ht=new Hashtable();
        
        String s;
        while((s=br.readLine())!=null)
        {
        	String data[]=s.split("\t");
        	String name=data[0].trim();
        	String phno=data[1].trim();
        	ht.put(name,phno);
        }
        System.out.println(ht);
        System.out.println("Enter Name to Search : ");
        String name=sc.next();
        
        if(ht.containsKey(name))
        {
        	System.out.println(ht.get(name));
        }
        else
        {
        	System.out.println("Name not Found");
        }
	}
}