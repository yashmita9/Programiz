package Basic;


import java.io.*;
import java.util.*;


public class EndOfFile {
	
  public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        
	        Scanner sc = new Scanner(System.in);
	        int lineNumber = 1;
	        
	        while(sc.hasNext()){
	            String line = sc.nextLine();
	             System.out.println(lineNumber + " " + line);
	           lineNumber++;
	        }
	    }
	
	
}
