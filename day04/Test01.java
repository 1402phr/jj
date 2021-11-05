package day04;

import java.util.Arrays;

public class Test01 {
	/*
	  배열 : 한가지 타입의 데이터 여러개를 하나로 관리하도록 만들어진 것
	  		 (주의) 배열을 만들 때에는 반드시 관리할 데이터의 타입과 개수가 결정되어야한다
	  		 (형식) 1. 데이터타입[] 변수;                   > 변수 선언
	  		 		   변수 = new 데이터 타입[데이터개수];  > 기억할 데이터들의 공간만 확보한 상태
	  		 		
	  		 		*관리할 배열의 데이터가 미리 준비된 경우
	  		 		2. 데이터타입[] 변수 = {데이터 1, 2, 3, ..., n }; 
	  		 		
	  		 (배열에 데이터 입력 방법)
	  		 :배열은 여러개의 데이터를 관리하는 것이므로 위치값(index)를 사용하여
	  		  해당 위치의 데이터를관리한다
	  		  
	  		 : 배열변수[위치값] = 데이터;    > 데이터 기억시키기
	  		 
	  		 : 꺼낸데이터의타입 변수이름 = 배열변수[위치값];    > 데이터를 꺼내서 사용
	 */
	
//	1~6까지의 정수 정보를 관리할 데이터를 만드세요

	public static void main(String[] args) {
		int[] noArray;
		noArray = new int[6];
		
		//출력
		for(int no : noArray) {
			System.out.print(no + " | ");
		}
		
		//1~6까지 입력
		for(int i = 0; i < 6 ; i++) {
			noArray[i] = i + 1;
		}
		System.out.println(Arrays.toString(noArray));
		//확인하는 용도 말고는 배열을 콘솔에 출력하지 마세요
		//Arrays.라는 클래스 안에 있는 noArray를 지칭하기 위해씀 
		//toString() : 문자열로 바꿔주는 함수
		//System.out.println(noArray); >이건 각 데이터의 위치값을 반환하여 [I@15327b79 가 나옴..
		
		
		//같은 코드이지만 위 아래 출력결과가 다르다 > 아래서는 데이터가 들어갓으니까
		for(int no : noArray) {
			System.out.print(no + " | ");
		}
	}

}
