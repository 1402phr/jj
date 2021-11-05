package day06_ex;


/*
  Figure클래스를 상속받은 
  Nemo, Semo, Circle 클래스를 만들고 
  필요한 함수는 재정의하고 랜덤하게 숫자를 발생시켜서 
  0이면 Circle
  1이면 Semo
  2이면 Nemo
  가 기억되도록 하나의 변수에 10개를 기억시켜서 	=배열을 만드시오
  다음의 형태로 출력하는 프로그램을 작성하라
  
  네모		- 가로 : xxx, 세로 : xxx, 면적 : xxx
  원		- 반지름 : xxx, 둘레 : xxx, 면적 : xxx
  세모		- 밑변 : xxx, 높이 : xxx, 면적 : xxx
  
  단, 필요한 데이터는 그 클래스가 객체가 되는 순간 기억되도록 작성하시오 =생성자에서 초기화하시오
 */

public class Ex01 {

	public static void main(String[] args) {
		
		//배열만들기
		Figure[] figure = new Figure[10];
		
		//랜덤하게 발생하는 숫자(0, 1, 2)
		for(int i = 0 ; i < 10 ; i++) {
			int no = (int)(Math.random()*2);
				
			//0의 경우
			if(no == 0) {
				figure[i] = new Circle((int)(Math.random() * 21) + 5);
			} 
			//1의 경우
			else if(no == 1) {
				figure[i] = new Semo((int)(Math.random() * 21) + 5, (int)(Math.random() * 21) + 5);				
			}
			//2의 경우
			else if(no == 2) {
				figure[i] = new Nemo((int)(Math.random() * 21) + 5, (int)(Math.random() * 21) + 5);				
			}
		}
		
		//출력
		for(Figure f : figure) {
			f.toPrint();
		}

	}

}
