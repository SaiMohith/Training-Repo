package com.me.collections;

import java.util.ArrayList;
//import java.util.HashSet;
import java.util.Iterator;
//import java.util.LinkedHashSet;
//import java.util.TreeSet;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		//HashSet<String> al=new HashSet<String>();
		//LinkedHashSet<String> al=new LinkedHashSet<String>();
		//TreeSet<String> al=new TreeSet<String>(); 

		al.add("Sparity");
		al.add("IBM");
		al.add("TCS");
		al.add("Infotech");
		al.add("Sparity");

		al.add(2, "CSC");

		System.out.println("Sparity : "+al.contains("Sparity"));
		System.out.println("Anil : "+al.contains("Anil"));

		System.out.println("ArrayList contains : " + al);
		System.out.println("al.get(2) : " + al.get(2));
		System.out.println("al.size() : " + al.size());

		System.out.println("al.indexOf('Sparity') : " + al.indexOf("Sparity"));
		System.out.println("al.lastIndexOf('Sparity') : "
				+ al.lastIndexOf("Sparity"));
		System.out.println("al.isEmpty() : " + al.isEmpty());

		System.out.println("-------------------------------");

		for (int i = 0; i < al.toArray().length; i++) {
			System.out.println("al.toArray()[" + i + "] : " + al.toArray()[i]);
		}
		System.out.println("-------------------------------");

		al.remove("TCS");
		al.remove(4);
		al.set(0, "SPARITY");
		System.out
				.println("After Removing TCS,index at 4,and set 0 index to SPARITY ");
		System.out.println("ArrayList contains : " + al);

		System.out.println("al.size() : " + al.size());

		System.out.println("-------------------------------");
		//al.clear();
		System.out.println("ArrayList contains : " + al);
		System.out.println("al.isEmpty() : " + al.isEmpty());
		System.out.println("al.size() : " + al.size());

		System.out.println("-------------------------------");

		System.out.println("Using For Each Loop : ");
		for (String s : al) {
			System.out.println(s);
		}

		System.out.println("-------------------------------");

		System.out.println("Using Iterator : ");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("-------------------------------");

		System.out.println("Using List Iterator : ");
		System.out.println();
		ListIterator<String> litr = al.listIterator();
		System.out.println("Forward Direction : ");
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println();
		System.out.println("Reverse Direction : ");
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

		System.out.println("-------------------------------");
	}
}
