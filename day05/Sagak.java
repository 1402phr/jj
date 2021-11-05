package day05;

public class Sagak {
	//변수선언
	int garo;
	int sero;
	int w;
	
	//가로와 세로를 기억해주는 함수
	void setL(int g, int s) {
		garo = g;
		sero = s;
	}

	//사각형의 넓이를 구하는 함수
	void setW() {
		w = garo * sero;
	}
	
	//출력하는 함수
	void toPrintsagak() {
		System.out.printf("가로가 %d이고 세로가 %d, 넓이가 %d인 사각형\n", garo, sero, w);
	}

}