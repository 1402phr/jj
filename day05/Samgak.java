package day05;

public class Samgak {
	//변수설정
	int mit;
	int nop;
	int area;
	
	//밑변과 높이 기억 함수

	void setMn(int m, int n) {
		mit = m;
		nop = n;
	}
	
	
	//넓이 기억함수
	void setA() {
		area = (int)(mit * nop * 0.5);
	}
	
	//출력 함수
	void toprintS() {
		System.out.printf("밑변이 %d이고 높이가 %d, 넓이가 %d인 삼각형\n", mit, nop, area);
	}
	
}