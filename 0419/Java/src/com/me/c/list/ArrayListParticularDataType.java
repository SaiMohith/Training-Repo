package com.me.c.list;

/*List(Interface)  :  it allows Duplicate values
 * 					  it provides Insertion order while retriving  or iterating of data
 *ArrayList(Class) :  array list is used when we have to add/remove/delete elements at LAST */
import java.util.ArrayList;

public class ArrayListParticularDataType {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(); // this is creating of
														// ArrayList
														// oblect..........we
														// are passing only
														// String type of data

		al.add("Sparity"); // add()---is a method to add elements
		al.add("Infotech");
		al.add("CSC");
		al.add("IBM");
		al.add("TCS");
		al.add("Infosys");
		al.add("Sparity");
		al.add("Infotech");
		al.add("CSC");
		al.add("IBM");
		al.add("TCS");
		al.add("Infosys");
		// al.add(1); it doesn't allow other data type Except String

		System.out.println(al);
		System.out.println("");
		al.add(2, "SPARITY"); // add(index,String)---is a method to add element
								// at particular index
		System.out.println(al);
		System.out.println("");
		al.remove(2); // remove(index)----is a method to remove element at that
						// index
		System.out.println(al);
		System.out.println("");
		System.out.println("Sparity : " + al.contains("Sparity"));  // contains(element)-----if
																	// the
																	// element
																	// contains
																	// in the
																	// list then
																	// it become
																	// true else
																	// it become
																	// false
		System.out.println("SPARITY : " + al.contains("SPARITY"));
		System.out.println("isEmpty : " + al.isEmpty()); // isEmpty()-----if the
															// list is empty
															// then it is True
															// else It is false
		System.out.println("Size    : " + al.size()); // Size()-------it gives
														// the size of the list
		al.clear();// clear()------it clear all the elements in the list
		System.out.println(al);
		System.out.println("Size    : " + al.size());
		System.out.println("isEmpty : " + al.isEmpty());
	}

}
