package Basic;

public class SwapNumbers {

	public static void main(String[] args) {
		
		float firstNo = 10f;
		float secNo = 5f;
		
		System.out.println("First number before swapping :"+firstNo);
		System.out.println("Sec number before swapping :"+secNo);
		
		firstNo = firstNo + secNo;//10+5 = 15
		secNo =  firstNo - secNo;//15-5 = 10
		firstNo = firstNo - secNo; //15-10
		
		System.out.println("First number after swapping :" +firstNo);
		System.out.println("Sec number after swapping :" +secNo);
		
	}
	
}
