package day01;

public class Test05 {
	public static void main(String[] args) {
		/*
		 * 변수 만드는 형식
		   	
		   	[접근지정자] [속성] 데이터타입 변수이름; >변수선언
		   	변수이름 = 데이터; > 변수 초기화
		   	[접근지정자] [속성] 데이터타입 변수이름 = 데이터; > 선언과 초기화를 동시에
		 */ 
boolean bool1; //변수선언
bool1 = true; //변수 초기화

char ch = 'A'; //선언과 초기화 동시에  > 지금 변수에 노란줄이 가는 이유는 이 변수가 사용중이 아님을 알려주는 것

int no1 = 123;
//int no1 = 456; 지금 no1 = 123이라고 변수를 선언했기때문에 같은 이름은 못씀 / 같은 이름으로 선언은 불가능하고 데이터 변경만 가능함
//char no1 = 'A'; 이렇게 데이터 종류를 바꿔도 이름이 같으면 오류임

double num1 = 3.14; // 실수눈 기본적으로 double 타입을 사용

System.out.printf("boolean : %b\n문자 : %c\n정수 : %d\n실수 : %f", bool1, ch, no1, num1);
	}
}

