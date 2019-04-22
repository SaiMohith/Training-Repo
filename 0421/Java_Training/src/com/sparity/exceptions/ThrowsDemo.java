package com.sparity.exceptions;
/* Throws Key word is used to throw an exception explicit with out handling
 * Throws can handle by System
 * Throws can do Normal termination of the program if there exists any exception
 * Throws can be applicable to methods only*/
public class ThrowsDemo {
public static void main(String [] args) throws Exception{
	int i=10;
	int j=0;
	try{
	int k=i/j;
	System.out.println("value of  k :"+ k);
	}catch(ArithmeticException ae){
		System.out.println("Denominater Can't be Zero");
	}
	int [] arr={1,2,3};
	arr[2]=5;
	for(int a:arr){
		System.out.print(" "+a+"\n");
	}
	String s = "asdf";
	System.out.println(s.length());
	
	@SuppressWarnings("unused")
	int no=Integer.parseInt("1234");
}
}
