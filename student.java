/*Assignment - 1
Set A
d) Create the hash table that will maintain the mobile number and student name. Display 
the contact list.
*/

import java.util.*;
public class student
{
	public static void main(String[] args)
	{
		Hashtable ht=new Hashtable();
		ht.put("Om",7824762649L);
		ht.put("Sai",9984844848L);
		ht.put("Ram",9845656754L);
		ht.put("Sham",7849126311L);
		System.out.println("Contact List : \n"+ht);
	}
}
