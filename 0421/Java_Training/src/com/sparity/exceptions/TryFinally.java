package com.sparity.exceptions;
//try block with finally
public class TryFinally {
	
	public static void main(String[] args) {
		int i=10;
		int j=0;
		int k;
		try{
			k=i/j;
			System.out.println(k);
		}finally{
			System.out.println("Finally block");
		}
	}

}
