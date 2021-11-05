package day05;
/*
Ex03 문제와 같이 Samgak 형 클래스를 제작하고
삼각형 한개의 정보를 출력하세요.
*/

public class Ex04 {
	

	public static void main(String[] args) {
		//객체를 만들자
		Samgak s2 = new Samgak();
		
		//랜덤한 밑변과 높이를 만들자
		int mitt = (int)(Math.random() * 21) + 5;
		int nopp = (int)(Math.random() * 21) + 5;
		System.out.println("랜덤한 밑변 : " + mitt);
		System.out.println("랜덤한 높이 : " + nopp);
		
		//밑변과 높이를 입력
		s2.setMn(mitt,nopp);
		
		//넓이를 구하자
		s2.setA();
		
		//출력하자
		s2.toprintS();
		

	}

}
