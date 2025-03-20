package String;

// String mai se kitne integer numbers hai unko find karna ................

public class CountNoOfIntFromString {

	public static void main(String[] args) {
		
		String name = "yashmita7652";
		int count = 0 , sum = 0;
		
		for(int i = 0 ; i < name.length();i++) {
			
			//isDigit give char Ascii value 
			if(Character.isDigit(name.charAt(i))) {
				
				//getNumericValue gives actual integer value
				int val = Character.getNumericValue(name.charAt(i));
				sum = sum + val;;
				count++;
			}
			
		}
		System.out.println(".............................................");
		System.out.println("sum of the integer value " +sum);
		System.out.println("no of integer from string " +count);
		
	}

}