package day02;

public class Ex04 {
	/*
	 0~255 사이의 정수를 랜덤하게 발생시켜서 그 숫자의 아스키코드값으로 하나의 문자를 만들고
	 이 문자가 영문자인지 특수문자인지를 판별하는 프로그램을 작성하시오
	 
	 [보너스]숫자인지, 대문자인지, 소문자인지 아니면 특수문자인지
	 */
	public static void main(String[] args) {
		//작업순서
		//1. 랜덤 숫자
		int no1 = (int)(Math.random() * 256 + 0);
	
		//2. 아스키코드로 변환..? > char로 바꿔볼까
		char aski = (char)no1;
		
		//3. 그렇게 해서 나온 문자는 영문인가 특수문자인가 확인
		//65~90은 소문자 / 97~122는 대문자 / 나머지 특수문자
		
		System.out.print(no1);
		System.out.print(aski);
		
	}
}
