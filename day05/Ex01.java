package day05;

public class Ex01 {
	/*
	  반지름(5~25) 하나를 랜덤하게 입력하면 
	  원의 넓이와 둘레를 계산해서 출력해주는 프로그램을 작성하라
	  
	  단, 넓이와 둘레 계산은 각각의 함수에서 처리하는 것으로 한다 = 넓이함수, 둘레함수를 각각 만들것
	 */
	
	void sagakCalc(int rad) {
		int area = (int)(rad * rad * 3.14);
		int arround = (int)(2 * rad * 3.14);
		
		System.out.printf("반지름 : %3d\n넓이 : %3d\n둘레 : %3d\n", rad, area, arround);
	}
	
	public Ex01() {
		int ban = (int)(Math.random()*21)+5;
		ban = rad;
	}
		
		//함수 : 넓이, 둘레
		
		//목적 : 출력
		//System.out.printf("반지름 : %3d\n넓이 : %3d\n둘레 : %3d\n", 반지름, 넓이, 둘레);
	
	public static void main(String[] args) {
		new Ex01();

	}

}



/*void fwidth(int ban) {
int width = (int)(ban * ban * 3.14);	//넓이를 구하는 함수
System.out.printf("원의 넓이는 %d이다\n", width);
}
void fround(int ban) {
int round = (int)(2 *ban * 3.14);
}
void answer(int width, int round) {

}
*/
