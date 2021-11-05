package day05;

public class Test04 {
	/*
	 	Won 클래스를 이용하여 원의 정보를 5개 관리하는 배열을 만들고 
	 	랜덤하게 반지름을 입력해서 다른 정보들도 출력하시오
	 */

	public static void main(String[] args) {
		//배열만들기
		Won[] circle = new Won[5]; //Won객체 5개를 관리할 공간 생성
		
		//Won 객체 채워주기
		for(int i = 0 ; i < 5 ; i++) {
			circle[i] = new Won();
		}
		//반지름 입력
		for(int i = 0 ; i < circle.length ; i++) {
			int r = (int)(Math.random()*21)+5;
			circle[i].setRad(r);
			//circle[i].setArround();
			//circle[i].setArea();		>아래처럼 따로 안쓰고 한번에 써도 됨, 아래는 향상된 for문
		}
		//둘레와 넓이 계산
		for(Won w : circle) {
			w.setArround();
			w.setArea();
		}
		//일단 출력해본다
		for(Won w : circle) {
			//출력함수 호출
			w.toPrint();
		}
				}

}