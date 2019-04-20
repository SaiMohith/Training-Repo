package com.sparity.exceptions;
//try block with catch and finally
public class TryCatchFinally {
public static void main(String[] args) {
	int [] arr=new int[3];
	arr[0]=10;
	arr[1]=12;
	arr[2]=15;
	try{
	arr[3]=123;
	}catch(ArrayIndexOutOfBoundsException ae){
		System.out.println("check the array size");
	}finally{
		System.out.println("this is finally Block");
	}
}
}
