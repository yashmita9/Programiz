package String;

//String mai particular words ko revers karna on a same place ..........

public class ReverseAtSamePlace {
	
	public static void main(String[] args) {
		
		String name = "yashmita rathore";
		String[] arr = name.split(" ");
		
		
		for(int i = 0 ; i < arr.length ; i++) {
//			System.out.println(arr[i].length());
			for(int j = arr[i].length()-1; j>=0; j-- ) {
				System.out.print(arr[i].charAt(j));
			}
			
			System.out.print(" ");
		}
		
		
	}

}