
//what : it gives the relation between only two types(superclass to subclass (or) parentclass to childclass )
//why  : to take all the accessable elements from superclass to sub class
//how  : class <subclass name> extends <superclass name> 
class Employee{
	int id;
	String name;
	float sal;
	
	Employee(int id,String name,float sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
		System.out.println("Cons:"+id+" "+name+" "+sal);
	}
	void disp(){
		System.out.println(id+" "+name+" "+sal);
	}
}
class ManagerEmployee extends Employee{
	String role;
	ManagerEmployee(String role,int id,String name,float sal){
		super(id,name,sal);
		this.role=role;
	}
	public void dispRole(){
		System.out.println(id+" "+name+" "+sal+""+role);
	}
}
public class SingleLevelInheritanceDemo {
public static void main(String[] args) {
	ManagerEmployee m=new ManagerEmployee("Spark",1234,"Mohtih",1234.23f);
	m.disp();
	m.dispRole();
}
}
