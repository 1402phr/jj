package day08;

public class Cf {
	public Cf() {
		System.out.println("10까지 합 : " + sum(10));
		System.out.println("10까지 곱 : " + factorial(10));
		System.out.println("1부터 100까지 합 : " + hap(1));
		
	}
	//n까지의 합을 구해주는 함수 : 자기자신을 다시 호출하는 함수 = 재귀 호출 함수
	//조건을 제대로 설정하지 않으면 무한 루프를 돌게된다
	public int sum(int no) {
		if(no == 0) {
			return 0;
		}
			return no + sum(no-1);
	}
	
	//n부터 100까지 합을 구하는 함수
	public int hap(int no) {
		if(no == 100) {
			return 100;
		}
		return no + hap(no+1);
	}
	
	//n! 계산 함수
	public int factorial(int no) {
		if(no == 1) {
			return 1;
		}
			return no * factorial(no -1);
	}
	
	
	public static void main(String[] args) {
		new Cf();
	}

}
