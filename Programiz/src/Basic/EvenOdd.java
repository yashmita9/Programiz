package Basic;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		 Scanner reader = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = reader.nextInt();

		if(num%2 == 0)
		{
			System.out.println("this is even number");
		}else {
			System.out.println("this is odd number");
		}
		
		System.out.println(checkNumber(25));
	}
	
	    public static String checkNumber(int number) {
	        if(number%2 == 0){
	            return "even";
	        }else{
	            return "odd";
	        }
	}
}
