
//what : in the current class method name must be same, and parameters must be different with any return type then it is method overloading
//why  : to do same operations with different parameters
//how  : to write same method name with different parameters
//this is static polymorphism
public class MethodOverLoadingDemo {
		void m1(){
			System.out.println("this is method m1");
		}
		void m1(int i){
			System.out.println("this is method m1 wi"
					+ "th one parameter...value of i : "+i);
		}
		void m1(String s){
			System.out.println("this is method m1 with String Return type : "+s);
		}
		void m1(int a,int b){
			System.out.println("the sum of given numbers : "+(a+b));
		}
		public static void main(String[] args) {
			MethodOverLoadingDemo m=new MethodOverLoadingDemo();
			m.m1();
			m.m1(12345);
			m.m1("Sai");
			m.m1(20, 20);
		}
}
