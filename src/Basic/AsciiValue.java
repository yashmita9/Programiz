package Basic;

public class AsciiValue {

	public static void main(String[] args) {
		
		char ch = 'A';
		
		int ascii = ch ;
		
		// You can also cast char to int
		int castAscii = (int) ch;
		
		System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
		
        System.out.println("The ASCII value of "+getASCII('h'));
	}
	
	//Write a function to return the ASCII value of a character.
	
	    public static int getASCII(char ch) {
	        int ascii = ch;
	        return ascii;
	    }
	
	
}
