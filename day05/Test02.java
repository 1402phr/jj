package day05;

public class Test02 {
	void sagakCalc(int garo, int sero) {		//출력해주는 함수라 반환값 없음
		int myunjuk = garo * sero;
		
		System.out.printf("가로 : %3d\n세로 : %3d\n넓이 : %3d\n", garo, sero, myunjuk);
	}

	/*
	 가로, 세로를 입력하면 사각형의 넓이를 계산해서 
	 "가로 : XXX
	  세로 : XXX
	  넓이 : XXX
	  " 형태로 출력해주는 함수를 작성하고 실행하라			
	  단, 실행할때 입력할 데이터는 5~25사이의 정수를 랜덤하게 사용한다
	 */
	public Test02() {
		int width = (int)(Math.random()* 21 + 5);
		int height = (int)(Math.random()* 21 + 5);
		
		//사각형함수 호출
		sagakCalc(width, height);
	}

	public static void main(String[] args) {
		new Test02();

	}

}
