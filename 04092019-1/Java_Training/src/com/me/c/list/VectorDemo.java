package com.me.c.list;

import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Vector v = new Vector();

		v.add(1);
		v.add("String");
		v.add('C');
		v.add(123.34f);
		v.add(9999999999L);
		v.add(12134.1234234f);
		v.add(true);

		System.out.println(v);

		ListIterator itr = v.listIterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-------------");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		System.out.println("Capacity : "+v.capacity());
		v.add(1);
		v.add("String");
		v.add('C');
		System.out.println("Capacity : "+v.capacity());
		v.add(123.34f);
		System.out.println("Capacity : "+v.capacity());
		v.add(9999999999L);
	
		v.add(12134.1234234f);
		v.add(true);
		v.add(1);
		v.add("String");
		v.add('C');
		v.add(123.34f);
		v.add(9999999999L);
		v.add(12134.1234234f);
		System.out.println("Capacity : "+v.capacity());
		v.add(true);
		System.out.println("Capacity : "+v.capacity());
	}
}
