package day01;

public class Test07 {
	public static void main(String[] args) {
	/*
	 * 강제 형변환
	 */
//float no1 = 3.14; >지금 3.14는 더블타입(실수의 기본 타입 > 오류)
float no1 = (float)3.14; //강제 형변환 > 오류x
//int no2 = 3.14 * 100; 3.14 * 100은 실수의 기본타입인 더블이라 int에 못넣음
int no2 = (int)(3.14 * 100);
int no3 = (int)3.14 * 100; 
System.out.println("no3 : "+ no3); //int는 소수점 버림함

String str = "abcd" + 10; //abcd10 >자동변환
System.out.println("abcd" + 10);



	}	
}

