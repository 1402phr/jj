package day02;

public class Ex01 {
	/*
	 * 랜덤한 정수(5~25)를 반지름으로 하는 원의 넓이, 둘레를 계산하여
	 * 출력하는 프로그램을 작성하라
	 
	 +보너스 : 삼각형, 사각형
	 */
	public static void main(String[] args) {
	//작업 순서
    //1. 랜덤한 정수를 만들자
		int r = (int)(Math.random() * 21 + 5);
		
		
	//2. 원의 넓이와 둘레를 구하자 : 원넓이 = 반지름*반지름*3.14/ 둘레 2*반지름*3.14
		int p = (int)(r * r * 3.14);
		int l = (int)(2 * r * 3.14);
		
    //3. 출력하자
		System.out.println("반지름의 길이는 " + r + " 입니다.");
		System.out.println("원의 넓이는 " + p + " 입니다.\n"  + "그리고 원의 둘레는" + l + "입니다." );
	
		
	}
}
