

import java.lang.reflect.Field;
//3 steps to get Private variable
//---->load class file--(Class.forName("<class name>"))
//---->Set the property to Visible--(field.setAccessible(true))
//---->To instance the class and access the Property--(new classname().property)


public class EncapsulationDemo {
	public static void main(String[] args) throws SecurityException, NoSuchFieldException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
		
		/*SecurityManager mg=new SecurityManager();
		System.setSecurityManager(mg);*/

			@SuppressWarnings("rawtypes")
			Class s = Class.forName("Test");
			//Class.forName() is used to load the class on the JVM with out creating an object
			Field f = s.getDeclaredField("n");
			f.setAccessible(true);

			System.out.println(f.get(new Test()));
	}
}
