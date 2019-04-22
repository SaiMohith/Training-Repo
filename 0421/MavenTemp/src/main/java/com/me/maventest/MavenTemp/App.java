package com.me.maventest.MavenTemp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        

		if (args.length >= 2) {
			Add n = new Add();
			int arg1 = Integer.parseInt(args[0]);
			int arg2 = Integer.parseInt(args[1]);
			String arg3 = args[2];
			
			n.setA(arg1);
			n.setB(arg2);
			
			
			System.out.println(n.toString());
			System.out.println(n.getA());
			System.out.println(n.getB());
			if (arg3.equals("add")){
			System.out.println("result :: "+addition(n));
			}
			else if(arg3.equals("sub")){
				System.out.println("subtract :: "+subtraction(n));
			}
			else {System.out.println("Invalid Arg");}
		} else {
			System.out.println("No arguments passed");
		}
	
    }
    
    public static int addition(Add n) {
		return n.getA() + n.getB();
	}

	public static int subtraction(Add n) {
		return n.getA() - n.getB();
	}
	
}
