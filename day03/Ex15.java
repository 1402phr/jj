package day03;

public class Ex15 {
	/*
	다음 모양으로 * 를 사용해서 출력하세요.
	
	
	1. 
		*****
		*****
		*****
		*****
		*****
	
	2. 
		 *
		 **
		 ***
		 ****
		 *****
	
	3.     *
		  **
		 ***
		****
	   *****
	   
	4. 
		 *****
		 ****
		 ***
		 **
		 *
		 
	5. 
		*****
		 ****
		  ***
		   **
		    *
 */

	public static void main(String[] args) {
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				String star = "*";
				if(j < i) star = " ";
				
				System.out.println();
				
			}
		}
	}

}
