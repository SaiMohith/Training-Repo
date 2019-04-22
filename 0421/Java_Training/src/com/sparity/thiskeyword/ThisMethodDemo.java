package com.sparity.thiskeyword;

public class ThisMethodDemo {
	
	public void methodOne(){
		System.out.println("this is First Method");
	}
	public void methodTwo(){
		System.out.println("this is Method Two");
	}
	public void methodDemo(){
		methodTwo();	//it will convert into this.methodTwo(); when the program is compiled
	}
public static void main(String[] args) {
	ThisMethodDemo d=new ThisMethodDemo();
	d.methodDemo();
	d.methodOne();
}
}
