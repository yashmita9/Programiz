package Basic;

public class EvenOddByTernary {

	public static void main(String[] args) {
		int number = 100;
		
		String evenOdd = (number%2==0)? "even number" : "odd";
		System.out.println(number + " is " + evenOdd);
	}
	
}
