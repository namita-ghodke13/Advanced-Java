/*Assignment - 1
Set B
a) Accept ‘n’ integers from the user. Store and display integers in sorted order having 
proper collection class. The collection should not accept duplicate elements.
*/

import java.util.*;
public class integer 
{
	public static void main(String[] args) 
	{
		TreeSet t1=new TreeSet();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit : ");
		int n=sc.nextInt();
		System.out.println("Enter n Integers : ");
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			t1.add(num);
		}
		System.out.println("Sorted Integers : "+t1);
	}
}