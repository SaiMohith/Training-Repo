package com.me.c.list;

import java.util.Stack;

public class StackDemo {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Stack s = new Stack();
		s.add(1);
		s.add(333.1334f);
		s.add(99999999999l);
		s.add("String");
		s.add('A');
		s.add(true);

		System.out.println(s.peek()); 

		System.out.println(s);
		s.pop();
		System.out.println(s.firstElement());

		System.out.println(s);
		System.out.println(s.peek());
		s.pop();

		System.out.println(s);
		s.pop();

		System.out.println(s);
		s.pop();

		System.out.println(s);
		s.pop();

		System.out.println(s.peek());
		System.out.println(s);
		s.pop();

	}
}
