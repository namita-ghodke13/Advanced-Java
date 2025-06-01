/*Assignment - 1
Set A
c)Write a program to create a new tree set, add some colors (string) and print out the 
tree set.
*/

import java.util.*;
public class colors 
{
	public static void main(String[] args)
	{
	    TreeSet ts=new TreeSet();
	    ts.add("Red");
	    ts.add("Pink");
	    ts.add("Green");
	    ts.add("White");
	    ts.add("Purple");
	    ts.add("Blue");
	    ts.add("Yellow");
	    
	    System.out.println("Color Names : \n"+ts);
	}
}