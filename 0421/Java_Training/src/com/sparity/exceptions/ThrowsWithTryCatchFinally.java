package com.sparity.exceptions;
/* we can write Try,catch,finally and throws in a program
 * finally : is execute always if the is exception or not it may be normal termination or force termination
 * In the finally block we can write closing the connections/files/ any thing */
public class ThrowsWithTryCatchFinally {
public static void main(String[] args) throws Exception{
	int a=20;
	int b=10;
	try{
		int c=a/b;
		System.out.println(c);
		
		String s="12345";
	
		int i=Integer.parseInt(s);
		System.out.println(i);
	}catch(ArithmeticException ae){
		System.out.println(ae);
	}
	finally{
		System.out.println("this is finally block");
	}
}
}
