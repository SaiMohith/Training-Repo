package com.sparity.exceptions;
//try block in another try block
public class TryInTry {
public static void main(String[] args) {
	
	try{
		int i=10;
		int j=2;
		
		int c=i/j;
		System.out.println(c);
		
			try{
				int [] a={1,2};
				a[3]=10;
							
			}catch(ArrayIndexOutOfBoundsException a){
				System.out.println("Check array Size");
			}
		
	}catch(ArithmeticException ae){
		System.out.println("j value can't be zero");
	}
}
}
