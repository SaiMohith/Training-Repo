package com.sparity.thiskeyword;

public class ThisConstructorDemo {
	int id;
	String name;
	float sal;//we can call are pass the values to the constructer by using this keyword
	ThisConstructorDemo(){
		System.out.println("This is default constructor");
	}
	ThisConstructorDemo(int id){
		this();
		this.id=id;
	}
	ThisConstructorDemo(int id,String name){
		this(id);
		this.name=name;
	}
	ThisConstructorDemo(int id,String name,float sal){
		this(id,name);
		this.sal=sal;
	}
	void disp(){
		System.out.println(id+" "+name+" "+sal);
	}
	public static void main(String[] args) {
		ThisConstructorDemo d=new ThisConstructorDemo(10,"JAVA",123432.323f);
		d.disp();
	}

}
