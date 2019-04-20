package com.me.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	public String name;
	public String lastName;

	public Person(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}
}

public class ComparatorDemo implements Comparator<Person> {
	public int compare(Person p1, Person p2) {
		String p1Name = p1.getName(); 		/*+ " " + p1.getLastName();*/
		String p2Name = p2.getName(); 		/*+ " " + p2.getLastName();*/
		return p1Name.compareTo(p2Name);
	}

	public static void main(String arg[]) {
		List<Person> myList = new ArrayList<Person>();

		myList.add(new Person("ddd", "www"));
		myList.add(new Person("eee", "vvv"));
		myList.add(new Person("fff", "uuu"));
		myList.add(new Person("aaa", "zzz"));
		myList.add(new Person("bbb", "yyy"));
		myList.add(new Person("ccc", "xxx"));

		Collections.sort(myList, new ComparatorDemo());
		for (Person person : myList) {
			System.out.println("My name is " + person.getName() + " " + person.getLastName());
		}
	}
}