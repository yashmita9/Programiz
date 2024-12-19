//Java Program to Check Whether a Character is Alphabet or Not

package Basic;

public class Alphabet {

	public static void main(String[] args) {
		
		char ch = 'd';
		
		if(ch >='a' && ch <='z' || ch>='A' && ch <='Z') {
			System.out.println(ch + " is an alphabet.");
		}else {
			System.out.println(ch + " is not alphabet.");
		}
		
	}
	
}
