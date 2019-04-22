package com.me.collections;

import java.util.ArrayList;
import java.util.Collections;

class Students implements Comparable<Object> {

	int id;
	String name;
	String address;
	int age;

	Students(int id, String name, String address, int age) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
	}
	public int compareTo(Object obj) {
		Students st = (Students) obj;
		if (age == st.age) {
			return 0;
		} else if (age > st.age) {
			return 1;
		} else
			return -1;
	}
}

public class ComparableDemo {
	public static <T> void main(String[] args) {

		ArrayList<Students> al = new ArrayList<Students>();

		Students s = new Students(10001, "aaa", "hyderabad", 31);
		Students s1 = new Students(10002, "bbb", "hyderabad", 30);
		Students s2 = new Students(10003, "ccc", "hyderabad", 29);
		Students s3 = new Students(10004, "ddd", "hyderabad", 28);
		Students s4 = new Students(10005, "eee", "hyderabad", 27);
		Students s5 = new Students(10006, "fff", "hyderabad", 26);
		Students s6 = new Students(10007, "ggg", "hyderabad", 25);
		Students s7 = new Students(10008, "hhh", "hyderabad", 24);
		Students s8 = new Students(10009, "iii", "hyderabad", 23);
		Students s9 = new Students(10010, "jjj", "hyderabad", 22);

		al.add(s);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		al.add(s7);
		al.add(s8);
		al.add(s9);

		Collections.sort(al);

		for (Students a : al) {
			System.out.println(a.id + " " + a.name + " " + a.age + " "
					+ a.address);
		}
	}
}
