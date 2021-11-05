package day02; // 삼항 연산자=조건 연산자를 중첨해서 사용하면 됨

public class Extra01 {
	public static void main(String[] args) {
		/*
		  5~25 사이의 정수 2개를 랜덤하게 발생시키고 0~2 사이의 정수를 랜덤하게 발생시켜서 
		  그 0~2 사이의 정수가 
		  0이면 5~25 사이의 정수중 첫번째 정수를 반지름으로 하느 원의 넓이를 
		  1이면 삼각형의 넓이를
		  2이면 사각형의 넓이를 
		  계산해서 출력하는 프로그램을 작성하시오
		  
		  원 : r*r*3.14
		  삼각형 : 밑변*높이/2
		  사각형 : 가로*세로
		 */
		
		//작업순서
		//1. 5~25 랜덤 정수
		int no1 = (int)(Math.random() * 19 + 5);
		
		//2. 0~2 랜덤정수
		int no2 = (int)(Math.random() * 3 + 0 ); 
		
		
		//3. 원넓이
		int c = (int)(no1 * no1 * 3.14);
		
		//4. 삼각형
		int t = (int)(no1 * no1 / 2);
		
		//5. 사각형
		int r = (int)(no1 * no1);
		
		int result1 = no2  == 0 ? c : no1;
		int result2 = no2  == 1 ? t : no1;
		int result3 = no2  == 2 ? r : no1;
		
		//6. 출력
		System.out.println("no1 : " + no1 + " no2 : " + no2);
		System.out.println("resul1 : " + result1 + " result2 : " + result2 + " result3 : " + result3);
	}

}
