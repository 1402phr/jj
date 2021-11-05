package day04;

import java.util.Arrays;

public class Test05 {
	/*
	  배열의 초기화 : 배열 메모리는 heap에 생겨야하므로 자동을 초기화된다
	  				  기본 데이터 타입 : 0, 0.0, false, (char)0
	  				  
	  				  경우에 따라서는 배열 메모리에 강제로 특정값을 입력해서 배열을 만들 필요도 생긴다
	  				  이때 이것을 "배열의 초기화"라고 한다
	  				  
	  				  형식1 : 데이터타입[] 변수이름 = {데이터1, 2, 3, ..., n};
	  				  형식2 : 데이터타입[] 변수이름 = new 데이터타입[]{데이터1, 2, 3, ..., n};
	  				  		  > 이때 만드는 배열의 길이는 데이터의 개수로 자동지정되므로 따로 지정할 필요없다
	  				  		  
	  Array 클래스 : 이 클래스는 배열은 아니고 배열을 다루는데 필요한 기능들을 모아놓은 클래스
	  				
	  				Arrays.toString() : 배열을 출력하기 위해서는 원칙적으로 하나씩 위치값을 입력하여 
	  									한개씩 데이터를 뽑아 출력해야한다
	  									그런데 배열을 그냥 출력하고 싶을 때도 그러면 불편하니까 
	  									배열이 가진 모든 데이터를 문자열로 변환시켜주는 함수이다
	  									(참고) 이 함수는 Object클래스가 가진 함수를 물려받아서 기능을 고쳐만든 함수
	  										   Object의 toString()는 
	  									(형식) Arrays.toString(배열)
	 */

	public static void main(String[] args) {
		String[] blackpink = {"제니", "로제", "리사", "지수"}; //배열 초기화 방법1
		
		blackpink = new String[] {"제니", "로제", "리사", "지수"};  //배열 초기화 방법2
		
		String arrData = Arrays.toString(blackpink);
		
		System.out.println(Arrays.toString(blackpink));
		System.out.println(arrData);
		

	}

}
