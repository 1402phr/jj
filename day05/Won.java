package day05;

public class Won {

	//변수선언. 객체가 되는 순간 자동초기화가 된다
	int rad;		//0으로 초기화
	double arround, area;		//각 0.0으로 초기화
	final double PI = 3.14;
	
	//반지름을 기억해주는 기능의 함수
	void setRad(int r) {
		//반지름 변수에 입력받은 데이터를 대입
			rad = r;
//생략가능  return;
	}
	
	//둘레를 계산해서 대입해주는 함수
	void setArround() {
		//둘레 계산해서 대입
		arround = 2 *rad * PI;
		
	}
	
	//면적 계산해서 대입해주는 함수
	void setArea() {
		area = rad * rad * PI;
	}
	
	//원의 정보를 출력하는 기능의 함수
	void toPrint() {
		System.out.printf("반지름이 %3d이고 둘레가 %7.2f, 넓이가 %7.2f인 원\n", rad, arround, area);
	}
	
	public static void main(String[] args) {
		new Won();

	}

}
