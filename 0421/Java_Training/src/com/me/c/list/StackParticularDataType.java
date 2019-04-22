package com.me.c.list;

import java.util.Stack;

public class StackParticularDataType {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(8);
		s.add(9);
		s.add(10);
		System.out.println(s);
		System.out.println("Capacity : "+s.capacity());
		s.add(11);
		System.out.println(s);
		System.out.println("Capacity : "+s.capacity());
		s.add(12);
		s.add(13);
		s.add(14);
		s.add(15);
		s.add(16);
		s.add(17);
		s.add(18);
		s.add(19);
		s.add(20);
		System.out.println(s);
		System.out.println("Capacity : "+s.capacity());
		s.add(21);
		System.out.println(s);
		System.out.println("Capacity : "+s.capacity());
	}
}
