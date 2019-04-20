package com.sparity.exceptions;

abstract class SampleIntf {
	void add() {
		System.out.println("add");
	}

abstract	void division() throws ArithmeticException; /*{
		System.out.println("div");
		
	}*/
}

public class ThrowsInheritance extends SampleIntf {

	int i = 10;
	int j = 0;

	public void add() {
		System.out.println("value of i+j : " + (i + j));
	}

	public void division() {
		/*try {
			int c = i / j;
			System.out.println("division : " + c);
		} catch (ArithmeticException ae) {
			System.out.println("denominator can't be Zero change the value");
		}*/
	}

	public static void main(String[] args) {
		ThrowsInheritance t = new ThrowsInheritance();
		t.add();
		t.division();
	}
}
