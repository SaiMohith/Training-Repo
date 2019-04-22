package com.sparity.exceptions;

/*what : Exception is a Situation where we are running a program with abnormal Conditions
 why  : to terminate the program normally
 how  : there are two ways to handle Exception
 --------->User Handle Exception----user can handle exceptions with the help of keywords .....they are...try,catch,finally
 --------->Ignore Exception----user can Ignore with the help of keywords.....they are throw,throws
 there are totally 5 key words to handle these Exceptons they are
 ----->try,catch,finally,throws,throw
 these 5 keywords are called Exception handle Constructs*/
public class ExceptionsDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c;

		try {
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException ae) {
			System.out.println("Enter positive value of b");
		}

		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;

		try {
			arr[3] = 4;
		} catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("check the arr size");
		}

		int[] ar = { 1, 2, 3 };

		try {
			ar[3] = 5;
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("Check the ar size");
		}

	}
}
