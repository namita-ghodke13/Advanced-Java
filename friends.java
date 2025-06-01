/*Assignment - 1
Set A
b)Write a java program to read ‘n’ names of your friends, store it into linked list, also 
display contents of the same.
*/

import java.util.*;
public class friends 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		LinkedList l1=new LinkedList();
		System.out.println("Enter Limit : ");
		int n=sc.nextInt();
		System.out.println("Enter n Names of your Friends : ");
		for(int i=0;i<n;i++)
		{
			String name=sc.next();
			l1.add(name);
		}
		System.out.println("Friends Names : "+l1);
	}
}
