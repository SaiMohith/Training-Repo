
//what : when the super class method name parameters, and sub class method name parameters are same with any return type then it is method overriding  
//why  : when the super class method having uncleared/ambigute information then in the sub class we will provide cleared/understandable information 
//how  : by writing the same method in the super class and sub class, and give relation with the help of Inheritance 
//		 this is dynamic polymorphism
class SuperClass{
	void m1(){
		System.out.println("this is uncleared/ambigute information");
	}
}
class SubClass extends SuperClass{ //relation between SubClass and SuperClass
	void m1(){		//same method is present in superclass also
		super.m1(); //call the super class m1() method
		System.out.println("this is cleared/understandable informtion");
	}
}
public class MethodOverRidingDemo {
	public static void main(String[] args) {
		SubClass s=new SubClass();
		s.m1();//call the current class m1 method
		
	}
}
