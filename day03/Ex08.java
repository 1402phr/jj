package day03;

public class Ex08 {
	/*
	정수 5자리 숫자를 랜덤하게 발생한 후
	각자리의 수를 합한 결과를 출력해주는 프로그램을 작성하세요.
 */

	public static void main(String[] args) {
		//1. 5자리 정수를 랜덤하게 발생시킴
		//int no = (int)(Math.random() * 90000) + 10000;
		int no1 = (int)(Math.random() * 9) + 1;
		int no2 = (int)(Math.random() * 10);
		int no3 = (int)(Math.random() * 10);
		int no4 = (int)(Math.random() * 10);
		int no5 = (int)(Math.random() * 10);
		System.out.println("발생한 5자리 정수는 " + no1 + no2 + no3 + no4 + no5 + "입니다.");
		
		
		//2. 각자리의 수를 합한 결과를 출력
		System.out.println("각자리의 수를 합한 결과는 " + (no1 + no2 + no3 + no4 + no5) + "입니다.");
	}

}
