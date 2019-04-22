package com.sparity.exceptions;
/* we can use both try,catch and throws in a program
 * If we want to handle the exception then we will go for Try catch
 * In that case we know at which exception will come then we can handle that exception
 * If we dont know which exception will come then we go for throws*/

public class ThrowsWithTryCatch {
@SuppressWarnings("null")
public static void main(String[] args) throws Exception{
	int a=10;
	int b=10;
	try{
		int c=a/b;
		System.out.println(c);
		String s= null;
		System.out.println(s.length());
	}catch(ArithmeticException ae){
		System.out.println(ae);
	}
	int [] arr={1,2,3,4};
	arr[12]=20;
}
}
