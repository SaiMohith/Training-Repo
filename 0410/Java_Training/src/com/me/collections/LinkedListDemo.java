package com.me.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Sparity");
		ll.add("IBM");
		ll.add("TCS");
		ll.add("Infotech");
		ll.add("CSC");
		ll.add("Sparity");

		System.out.println("Linked List Contains : " + ll);
		System.out.println("Size of Linked List : " + ll.size());
		System.out.println("Linked list is Empty : " + ll.isEmpty());
		System.out.println("index of sparity : " + ll.indexOf("Sparity"));
		System.out.println("last index of Sparity : "
				+ ll.lastIndexOf("Sparity"));
		System.out.println("--------------------------------------------------");

		System.out.println("Using toArray in for loop : ");
		for (int i = 0; i < ll.toArray().length; i++) {
			System.out.println("ll.toArray()[" + i + "] : " + ll.toArray()[i]);
		}
		System.out.println("--------------------------------------------------");
		System.out.println("Using for loop : ");
		for (String s : ll) {
			System.out.println(s);
		}
		System.out.println("--------------------------------------------------");
		System.out.println("Using List Iterator : ");
		System.out.println();
		System.out.println("Forward Direction : ");
		ListIterator<String> li = ll.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println();
		System.out.println("Reverse Direction : ");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}
}
