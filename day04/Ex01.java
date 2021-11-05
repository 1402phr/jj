package day04;

public class Ex01 {
	/*
	  1~45 까지의 정수를 기억할 수 있는 배열을 만들고 
	  서로 다른 정수 6개를 기억시켜서 출력하세요
	  .2중 for문. 중복된 숫자인지 검사해서 중복되었을 경우 그 회자를 다시 반복하도록 해야함
	 */
	public static void main(String[] args) {
		//1. 기억할 배열을 만들자
		int[] lotto = new int[6];
		
		//2-1. 숫자 만들기
		loop:
		for(int i = 0 ; i < 6 ; i++) {
			int no = (int)(Math.random()*45) + 1;
			
			//2-2. 숫자 중복검사  /j < i 인 이유는 현재 실행회차 바로 전까지의 회차 결과와  
			for(int j = 0 ; j < i ; j++) {
				if(no == lotto[j]) {
					//2-3. 중복시 해당회차 다시 진행
					i--;
					continue loop;
				}
			}
			
		//2-4. 중복이 아닐시에는 해당회차를 기억시킴
		lotto[i] = no;
		}
		
		//3. 출력
		System.out.print("|");
		for(int no : lotto) {
			System.out.print(no + "|");
			
			
							}
		
		
	}

}
