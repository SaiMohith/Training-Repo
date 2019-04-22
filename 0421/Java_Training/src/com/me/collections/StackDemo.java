package com.me.collections;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		
		Stack<String> s=new Stack<String>();
		s.push("Sparity");
		s.push("Infotech");
		s.push("TCS");
		s.push("IBM");
		s.push("CSC");
		//System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.indexOf("CSC"));
		
	}
}
