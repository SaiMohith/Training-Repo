package com.me.collections;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("Sparity");
		v.add("Infotech");
		v.add("TCS");
		v.add("IBM");
		v.add("CSC");

		System.out.println(v);

		for (String s : v) {
			System.out.println(s);
		}

		v.remove(3);
		System.out.println(v);

	}
}
