package com.me.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();

		l.add("aaa");
		l.add("12");
		l.add("123.f");

		for (String a : l) {
			System.out.println("For Each Loop" + a);
		}
		System.out.println("--------------------------------------------------");
		Iterator<String> it = l.iterator();

		while (it.hasNext()) {
			System.out.println("Using Iterator : " + it.next());
		}
		System.out.println("--------------------------------------------------");
		ListIterator<String> li = l.listIterator();
		while (li.hasNext()) {
			System.out.println("Forward : " + li.next());
		}
		while (li.hasPrevious()) {
			System.out.println("Reverse : " + li.previous());
		}
	}
}