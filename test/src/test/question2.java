package test;

import java.io.IOException;

	public class question2 {
	
	public static void main(String[] args) throws IOException {
		 for (int i =1; i <= 100; i++) {
			 if (i % 15 == 0)  //MDC of 3 and 5
				System.out.println("FooBaa"); 
			 else if (i % 3 == 0)
				System.out.println("Foo"); 
			 else if (i % 5 == 0)
				System.out.println("Baa"); 
		 }
	}
}
