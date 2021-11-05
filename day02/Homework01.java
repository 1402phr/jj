package day02;
//힌트 : 3중 for문
public class Homework01 {
	public static void main(String[] args) {
		/*
		 1. 구구단을 아래 형식으로 콘솔화면에 출력하라
		 		2 x 1 = 2 		3 X 1 = 3		4 X 1 = 4		5 X 1 = 5
		 		2 x 2 = 4		3 x 2 = 6		4 x 2 = 8		5 x 2 = 10
		 		...
		 		6 X 1 = 6		7 X 1 = 7		8 X 1 = 8		9 X 1 = 9
		 		...
		 		6 X 9 = 54		7 X 9 = 63		8 X 9 =	72 		9 X 9 = 81
		 		
		 		
		
		 */
		/*
		int[] noArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		for(int num : noArray) {
			System.out.println(num + " x " + num + " = " + num * num);
		}
		*/
		for(int i = 1 ; i < 10 ; i++) {
			System.out.println( i + " X " + i + " = " + i*i);
		}
	}
	
}
