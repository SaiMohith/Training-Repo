package com.sparity.thiskeyword;

public class ThisVariableDemo {
	int id;
	String name;
	//when the instance variables and local variables are having same name then we use this 
	ThisVariableDemo(int id,String name){
		this.id=id;
		this.name=name;
	}
	public void disp(){
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		ThisVariableDemo d=new ThisVariableDemo(1001,"SPARITY");
		d.disp();
	}

}
