package Basic;

public class VowelConsonant {

	public static void main(String[] args) {
		
		char ch ='A';
		
//		by if else...............
		
//		if(ch == 'A' || ch == 'E' ||ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' || ch == 'u') {
//			System.out.println("This is vowel");
//		}else {
//			System.out.println(" consonent ");
//		}
		
//		By Switch.............
		
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			
			System.out.println("vowel");
			
			break;

		default:
			System.out.println("consonent");
			break;
		}
		
	}
	
}
