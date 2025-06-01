/*Assignment - 1
Set C
b) Write a program to create link list of integer objects. Do the following:
i. add element at first position
ii. delete last element
iii. display the size of link list
*/

import java.util.*;
public class List 
{
	public static void main(String[] args) 
	{
         LinkedList  l1=new LinkedList();
         l1.add(2);
         l1.add(5);
         l1.add(10);
         System.out.println("Linked List : "+l1);
         l1.addFirst(1);
         System.out.println("Element added at First Position : "+l1);
         l1.removeLast();
         System.out.println("Linked List after deleted Last Element : "+l1);
         System.out.println("Size of the Linked List : "+l1.size());
	}
}