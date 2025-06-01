/*Assignment - 1
Set B
b) Write a program to sort HashMap by keys and display the details before sorting and 
after sorting.
*/

import java.util.*;
public class Sort
{
	public static void main(String[] args) 
	{
		HashMap hm=new HashMap();
		hm.put(45,"Yash");
		hm.put(12,"Om");
		hm.put(56,"Aniket");
		hm.put(22,"Raj");
		hm.put(88,"Ram");
		hm.put(10,"Sham");
		hm.put(77,"Aman");
		System.out.println("Before Sorting HashMap : ");
		System.out.print(hm+"\n");
		
		TreeMap tm=new TreeMap(hm);
		System.out.println("\nAfter Sorting HashMap : ");
		System.out.print(tm);
	}
}
