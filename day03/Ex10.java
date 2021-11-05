package day03;

public class Ex10 {
	/*
	반장님과 제가 학교를 한바퀴 구경합니다.
	반장님은 정문에서 오른쪽으로 1.07m/s
	저는 정문에서 왼쪽으로 구경을 하는데	0.54m/s
	로 구경한다.
	
	반장님과 저는 몇초후 만나게 되는지 출력해주는 프로그램을 작성하세요. 
	 
	 학교 한바퀴는 5475m 라고 가정한다. 
	 
	 반복문으로 해결하세요. 
 */

	public static void main(String[] args) {
		//1. 두 사람의 위치값을 기억할 변수를 만든다
		//산을 오르는 사람과 내려가는 사람으로 생각허면 쉬움
		double banjang = 5475;
		double na = 0;
		int time = 0;
		
		//2. 매 초 두 사람의 위치를 비교해서 두 사람의 위치가 역전되는 순간 반복문을 멈춘다
		for(int i = 0 ;; i++) {
			banjang = 5475 - 1.07 * i;
			na = 0.54 * i;
			
			if(na >= banjang) {
				time = i;
				break;
			}
		
		}
	System.out.println( time + "초 후 " + na + "지점에서 반장과 만난다." );

}
	}
