
class Student{
	
	int id=100001;
	String name="Sparity";
	float fee=12345.00f;
	void disp(){
		System.out.println("Student Class disp Method "+id+"-"+name+"-"+fee);
	}
	
}
class Teacher extends Student{
	int id=12345;
	String name="JAVA";
	float sal=22123.23f;
	void disp(){
		super.disp();
		System.out.println("Teacher class Disp Method "+id+" "+name+" "+sal);
	}
}
class Sample extends Teacher{
	void disp(){
		super.disp();
		System.out.println("Sample class disp Method");
	}
}
public class MultiLevelInheritanceDemo {
		public static void main(String[] args) {
			Sample s=new Sample();
			s.disp();
		}
}
