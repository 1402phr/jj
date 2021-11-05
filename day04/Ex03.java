package day04;

public class Ex03 {
	/*
	  'A' 부터 'J'까지의 문자를랜덤하게 100개 발생시킨 후
	  각각의 문자가 몇개씩 만들어졌는지 그래프 형태로 출력하시오 
	 
	 그래프 : *표 찍기 
	 
	 출현 횟수를 기억시킬 정수 배열을 만든다(여기선 10개)
	 출현한 알파벳의 위치찾기 ex. C : 'C'-'A'
	 */

	public static void main(String[] args) {
		//1. 배열을 만든다
		int[] cnt = new int[10];
		
		//2. 숫자를 넣는다
		for(int i = 0 ; i < 100 ; i++) {
			char ch = (char)(Math.random() * ('J' - 'A' + 1) +'A');
		
		//3. 같은 문자가 나왔는지 확인해서 중복이라면 카운트를 올린다
			cnt[ch = 'A'] = cnt[ch - 'A'] + 1;
		}
		//4. 출력
		for(int i = 0 ; i < cnt.length ; i++) {
		//제목 출력
			System.out.print((char)('A' + i) + " : ");
			for(int j = 0 ; j < cnt[i] ; j++) {
				System.out.print("■");
				}
	//줄바꿈
			System.out.println();

	}

}
}
