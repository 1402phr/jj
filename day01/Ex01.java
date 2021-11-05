package day01;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * 1. 자신의 이름 첫번째 글자를 기억할 변수를 만들고 
		 * 그 문자가 가지는 코드값에 5를 더한 정수데이터를 기억할 변수를 만들고 
		 * 그 숫자가 어떤 문자로 만들어지는지 변수에 기억시켜서 출력하라
		 */
		
		char a = 'p';
		int no1 = 'p' + 5;
		System.out.printf("정답 : %c", no1) ; //이렇게 하면 u 나옴.. 근데 변수 a를 안사용하잖어
		
		char ch = 'P';
		int no2 = ch + 5;
		char ch1 = (char)no2;
		System.out.println("내이름 첫글자 : " + ch );
		System.out.println("첫글자에 5를 더한 정수값 : " + no2);
		System.out.println("결과 정수에 문자를 변환한 문자 : " + ch1);
	}

}

