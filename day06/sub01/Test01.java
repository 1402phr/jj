package day06.sub01;

import day06.*;
public class Test01 {

	public static void main(String[] args) {
		Data d1 = new Data();		//원래는 day06-Data와 패키지가 다르기 때문에 가져올 수 없음 / import day06.*; 를 적어줘서 가능한 것
		
//		int no1 = d1.num1; 		//접근지정자가 생략된 경우, 동일한 패키지에서만 사용가능
//		int no2 = d1.num2;		//Data 클래스를 상속받지도 같은 패키지에 있지도 않아서 사용 불가능
		int no3 = d1.num3;		//public이라 어디서든지 가능
//		int no4 = d1.num4; 		//
		
		no3 = 10;
//		d1.num3 = 10; 해줘야 num3이 10이됨
		
		System.out.println("d1.num3 : " + d1.num3);
		System.out.println("no3 : " + no3);
		
		/*
		 no3 = 10; 해도 출력하면 0이 나온다
		 no3에 10을 대입한것이지 num3에 대입한게 아니니까
		 */
		
		Stud s1 = new Stud();
		s1.ex = "중간고사";
		
		Stud s2 = new Stud();
		
		System.out.print(s2.ex);
		
//		this.num = 20; 	>이 함수가 static이라 this 사용 불가능
		
		
	}

}
