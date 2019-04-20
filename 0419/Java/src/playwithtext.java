import java.util.Scanner;

public class playwithtext {
	public static void main(String[] args) {
		int a = 7; 
		String b = "Hello!";
		String c = "Mohith";
		String d = " ";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		System.out.println(b+d+c);
		
		
		int value = 0;
	    
        while(value < 10)
        {
            System.out.println("loop " + value);
            
            value = value + 1;
        }	
        
        int i;
		
        for (i=0; i< 10; i++){
        	System.out.printf("value of i in this iteration: %d \n", i);
        	
        }
        
        
 int loop = 0;
        
        while(true) {
            System.out.println("Looping: " + loop);
            
            if(loop == 3) {
                break;
            }
            
            loop++;
        
            System.out.println("Running");
        }
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int EnteredNumber = input.nextInt();
        System.out.println("Number Entered is: " + EnteredNumber);
        
	}
	
	
}
