package Basic;

public class BinaryConversion {

	public static void main(String[] args) {
		
		int num = 6;
		int rem ;
		int pow = 1 ,ans = 0;
		while(num > 0) {
			 rem = num%2;
			 num = num/2;
			 ans += (rem * pow);
			 pow = pow *10;
			
			
		}
		System.out.print(ans);
	}
	
	
}
