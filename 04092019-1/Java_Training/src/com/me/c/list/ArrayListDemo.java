package com.me.c.list;

//List : Allows Duplicate Values,provides insertion order
//Arraylist : if we have to insert,delete or update elements at last then we will go for ArrayList
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList al = new ArrayList(); // here we are not passing any
										// particular data type

		al.add("String"); // String
		al.add(123); // Integer
		al.add(111.11f); // Float
		al.add('A'); // Char
		al.add(true); // Boolean

		Iterator it = al.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		/*for (ArrayListDemo a : al) {
			System.out.println(a);
		}*/

	}
}
