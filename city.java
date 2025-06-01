/*Assignment - 1 
Set A
a)Write a java program to accept names of ‘n’ cities, insert same into array list 
collection and display the contents of same array list, also remove all these elements.
*/

import java.util.*;
public class city 
{
	public static void main(String[] args) 
	{
         Scanner sc=new Scanner(System.in);
         ArrayList a1=new ArrayList();
         System.out.println("Enter Limit : ");
         int n=sc.nextInt();
         System.out.println("Enter n Names of Cities : ");
         for(int i=0;i<n;i++)
         {
        	 String name=sc.next();
        	 a1.add(name);
         }
         System.out.println("City Names : "+a1);
         a1.clear();
         System.out.println("All City Names Removed : "+a1);
	}
}
