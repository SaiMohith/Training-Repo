package com.me.c.list;
/*List(Interface)  :  it allows Duplicate values
* 					  it provides Insertion order while retriving  or iterating of data
*LinkedList(Class) :  array list is used when we have to add/remove/delete elements at First/middle */
import java.util.LinkedList;

public class LinkedListParticularDataType {
public static void main(String[] args) {
	LinkedList<Integer> ll=new LinkedList<Integer>();
	
	ll.add(1);
	ll.add(2);
	ll.add(3);
	ll.add(4);
	ll.add(5);
	
	System.out.println(ll);
	ll.add(1,123);
	System.out.println(ll);
	for(Integer i:ll){
		System.out.println(i);
	}
}
}
