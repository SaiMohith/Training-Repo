package com.sparity.exceptions;
//try block with catch
public class TryCatch {
public static void main(String[] args) {
	int a=10;
	int b=0;
	try{
	int	c=a/b;
	System.out.println(c);
	}catch(ArithmeticException e){
		System.out.println("Enter Positive values");
	}
}
}
