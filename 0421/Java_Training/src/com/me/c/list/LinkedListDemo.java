package com.me.c.list;
/*List(Interface)  :  it allows Duplicate values
* 					  it provides Insertion order while retriving  or iterating of data
*LinkedList(Class) :  array list is used when we have to add/remove/delete elements at First/middle */
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
@SuppressWarnings({"rawtypes", "unchecked"})
public static void main(String[] args) {

	LinkedList ll=new LinkedList();
	ll.add("SPARITY");
	ll.add(9);
	ll.add(999.9f);
	ll.add(99999999.9999999999999999999999d);
	ll.add(9999999999L);
	ll.add('I');
	ll.add(false);
	System.out.println(ll);

	ll.add(1,'S');
	System.out.println(ll);

	ll.remove(1);
	System.out.println(ll);
	System.out.println("ll.contains(9) : "+ll.contains(9));
	ll.addFirst("First");
	ll.addLast("Last");
	System.out.println(ll);
	ll.removeFirst();
	ll.removeLast();
	System.out.println(ll);
	
	

	
	
	
	
	Iterator itr=ll.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
		}
	
		}
}
