package day05;
/*
 	사각형의 정보를 기억할 별도의 클래스 sagak 을 만들어라
 	가로세로를 랜덤하게 입력해서 출력하는 기능을 가지는 클래스를 이곳에 제작하라 
 	
 	+변수 가로세로를 한번에 처리해보기
 */

public class Ex03 {

	public static void main(String[] args) {
		//1. 객체를 만들자
		Sagak s1 = new Sagak();
		
		//2. 랜덤한 가로세로를 만들자 
		int garo = (int)(Math.random() * 21) + 5;
		int sero = (int)(Math.random() * 21) + 5;
		System.out.println("랜덤한 가로 : " + garo);
		System.out.println("랜덤한 세로 : " + sero);
		
		//3. 가로와 세로를 입력하자
			s1.setL(garo, sero);
		//4. 넓이를 입력하자
			s1.setW();
		//5. 출력하자
			s1.toPrintsagak();
		
	}

}
