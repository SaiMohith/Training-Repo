

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MobileNumberExample {
	static String number;
	static String mail;
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Mobile Number");
	
	number=br.readLine();
	
	System.out.println(number.matches("(0|\\+91)?[0-9]{10}"));
		/*System.out.println("enter mail id");
		mail=br.readLine();
		System.out.println(mail.matches("([0-9]|([A-Z]|[a-z])){1}([a-z]|[A-Z]|[0-9]|\\.)*\\@{1}[a-z]+(\\. && [a-z])+"));
		*/
}
}
