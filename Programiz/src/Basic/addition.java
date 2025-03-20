package Basic;

import java.util.Scanner;

public class addition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your first number ");
		float a = sc.nextFloat();
		
		System.out.println();
		
		System.out.print("Enter your scound number ");
		float b = sc.nextFloat();
		
		System.out.println("your result is " + (a+b));
		
		System.out.println(calculateSum(5));
		
	}
	
	    public static int calculateSum(int number) {
	        
	        return number+10;
	    }
	
}
