package com.me.c.list;

import java.util.Vector;

public class VectorParticularDataType {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);

		System.out.println(v);

		for (Integer i : v) {
			System.out.println(i);
		}
		v.clear();
		System.out.println(v);
		System.out.println("Size : " + v.size());
		System.out.println("isEmpty : " + v.isEmpty());

	}
}
