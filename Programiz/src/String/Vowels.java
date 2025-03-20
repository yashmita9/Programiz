package String;

// String mai vowel kitne hai wo find karna ....................

public class Vowels {

	public static void main(String[] args) {
		
		String name = "yashmita";
		int count = 0;
		
		for(int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			
			if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E'||c=='I' || c=='O' || c == 'U') {
				System.out.print(c);
				System.out.print(" ");
				count++;
			}
		}
		System.out.println(count);
	}
	
}
