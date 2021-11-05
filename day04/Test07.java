package day04;

import java.util.Arrays;

public class Test07 {
	/*
	  String 배열
	  	String은 기본타입이 아니라 클래스(reference type)
	  		String str1 = "Hong"; 
	  	은 기본형 변수처럼 리터럴의 주소값을 기억하지만 
	  		String str2 = new String("Hong");
	  	는 heap에 만들어진 인스턴스(heap에 만들어지는 그거)를 기억하고 그 인스턴스가 데이터의 주소를 기억하게된다
	  	
	  레퍼런스 변수란? : 주소를 기억하는 변수
	  					 하지만 프로그램 상에서 실제 사용되는 것은 주소가 필요없다
	  					 따라서 주소변수는 위치만을 알려줄 뿐이고 핵심은 데이터가 들어갈 메모리(실제 데이터)가 더 중요하다
	  
	  String 배열 만들기 
	  		String[] 변수이름; //변수선언
	  		변수이름 = new String[데이터크기];
	  		변수이름[위치0] = "데이터1";
	  		변수이름[위치1] = "데이터2";
	  		변수이름[위치2] = "데이터3";
	  		...처럼 데이터 공간까지 만들어야함
	  		
	  		String계열도 초기화가 가능하다 : String[] 변수이름 = {데이터1, 2, 3, ..., n};
	  		
	  		String은 필요에 따라서 char[]로 변환해서 사용가능(문자열은 문자로 이루어졌으니까) : 문자열.toCharArray()
	  		
	  참고	문자열 자체를 변경(수정)하는 함수는 없음 > 그래서 잘라던지 해서 가공하는것	
	  		String에서 자주 사용하는 명령
	  		1. charAt(위치값) - 문자열중 특정 위치의 문자를 반환
	  		2. indexOf(문자) - 문자열중 특정 문자의 위치를 반환 
	  		3. substring(시작위치[ , 종료위치]) - 문자열중 일부를 꺼내줌
	  				오라클 : substr(문자열데이터, 시작위치, 데이터개수)
	  		4. equals() - 문자열 데이터 자체를 비교하는 함수
	  		
	 */

	public static void main(String[] args) {
		String[] str = new String[5];
		System.out.println(Arrays.toString(str)); //null만 5개 출력됨. 들어간 데이터가 없기때문
		
		//문자열을 문자배열로
		String str1 = "abcdefg";
		char[] chArr = str1.toCharArray();
		System.out.println(Arrays.toString(chArr));
		
		String sdata = "0123456789";
		String part = sdata.substring(5, 7); //종료위치의 데이터는 포함되지 않음
		System.out.println(part); 
		
		
	}

}
