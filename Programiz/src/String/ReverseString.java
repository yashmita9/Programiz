package String;

//Write a program to revers a string ..............

public class ReverseString {

	public static void main(String[] args) {
		
		String name = "yashmita";
		int len = name.length();
		for(int i = len-1; i >=0 ; i--) {
			System.out.print(name.charAt(i));
		}
		
	}
	
}
