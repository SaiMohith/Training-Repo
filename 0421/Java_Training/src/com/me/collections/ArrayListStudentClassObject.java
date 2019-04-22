package com.me.collections;

import java.util.LinkedList;

class Student {
	int id;
	String name;
	String address;

	Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
}

public class ArrayListStudentClassObject {
	public static void main(String[] args) {
	
	//	ArrayList<Student> al = new ArrayList<Student>();
	//	HashSet<Student> al=new HashSet<Student>();
	//  LinkedHashSet<Student> al=new LinkedHashSet<Student>();

		LinkedList<Student> al=new LinkedList<Student>();

		Student s  = new Student(1001, "aaa", "Hyderabad");
		Student s1 = new Student(1002, "bbb", "L.B.Nagar");
		Student s2 = new Student(1003, "ccc", "S.R.Nagar");
		Student s3 = new Student(1004, "ddd", "Hyderabad");
		Student s4 = new Student(1005, "eee", "L.B.Nagar");
		Student s5 = new Student(1006, "fff", "S.R.Nagar");

		al.add(s);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);

		for (Student a : al) {
			System.out.println(a.id + " " + a.name + " " + a.address);
		}
	}
}
