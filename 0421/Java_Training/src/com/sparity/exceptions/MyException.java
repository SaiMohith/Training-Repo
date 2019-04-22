package com.sparity.exceptions;

/* throw keyword is used to explicit throws user defined exceptions
 * 
 * 3 rules to create our own exceptions
 * ----->our Exception must extends Exceptions
 * ----->Implemented in Seperate Class
 * ----->Used in SubClass
 */
@SuppressWarnings("serial")
public class MyException extends Exception {

	MyException() {
		System.out.println("this is zero argument Exception");
	}

	MyException(String name) {
		System.out.println("String name : " + name);
	}
	MyException(int i){
		System.out.println("Int No : "+i);
	}

}
