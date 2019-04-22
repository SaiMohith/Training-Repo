

//what :  it is nothing but method overriding with the help of inheritance we can achive method overriding
//why  :  with the help of only one super class/interface reference can be used to different sub class 
//how  :  <superclass> refVariable;
//        refvariable=new <sub class>();-----with this refvariable we will get sub class implementation of the super class 
//		  refvariable=new <another sub class>();-----with this refvariable we will get another sub class implementation of the super class
//by using the same refvariable we can call different class----so it is ObjectLevelPolymorphism
abstract class Car {

	String Reg_no;

	Car(String Reg_no) {
		this.Reg_no = Reg_no;
	}

	void dispRno() {
		System.out.println("Registration No : " + Reg_no);
	}

	void tank() {
		System.out.println("Open Tank key");
	}

	abstract void model();

	abstract void maxSpeed();

}

class BMW extends Car {
	String Reg_no;

	BMW(String Reg_no) {
		super(Reg_no);
	}

	public void model() {
		System.out.println("BMW Model : X6");
	}

	public void maxSpeed() {
		System.out.println("Max Speed : 320 km/h");
	}
}

class Audi extends Car {
	String Reg_no;

	Audi(String Reg_no) {
		super(Reg_no);
	}

	public void model() {
		System.out.println("Audi Model : Q3");
	}

	public void maxSpeed() {
		System.out.println("Max Speed  : 340 km/h");
	}
}

public class ObjectLevelPolymorphism {
	public static void main(String[] args) {
		Car c;
		c = new BMW("AP 06 AP 6666");
		c.dispRno();
		c.tank();
		c.model();
		c.maxSpeed();
		c = new Audi("AP 03 AP 3333");
		c.dispRno();
		c.tank();
		c.model();
		c.maxSpeed();
	}
}
