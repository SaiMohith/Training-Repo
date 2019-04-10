
//getters and setters are used when the instance variable access specifier is private
class EmployeeEx{
	private int id;
	private String name;
	private float sal;
	
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setSal(float sal){
		this.sal=sal;
	}
	public float getSal(){
		return sal;
	}
	
			public void disp(){
				System.out.println(id+" "+name+" "+sal);
			}
}
class ManagerExEmployee extends EmployeeEx{
	private String role;
	public void setRole(String role){
		this.role=role;
	}
	public String getRole(){
		return role;
	}
			public void dispRole(){
				System.out.println(role);
			}
}
public class SingleLevelInhetitanceSetterGetterDemo {
	public static void main(String[] args) {
		ManagerExEmployee m=new ManagerExEmployee();
		m.setId(1001);
		m.setName("SPARITY");
		m.setSal(1234.234f);
		m.setRole("Java Developer");
		m.disp();
		m.dispRole();
		System.out.println(m.getId()+" "+m.getName()+" "+m.getSal()+" "+m.getRole());
	}

}
