package test;

import java.io.IOException;

public class question6 {
	
	public static void main(String[] args) throws IOException {
		 
		 String strTest = "test string length";
	      int count = 0;
	      for(char c: strTest.toCharArray()) {
	         count++;
	      }
	      
	      System.out.println("String '" + strTest +  "' length: " + count);
	}
	

}
