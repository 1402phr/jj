package day04;

public class Test04 {
	/*
	  1~45 까지의 숫자 6개를 중복되지않게 만들어서 배열에 기억시키고 
	  오름차순으로 정렬하여 출력하라
	 */

	public static void main(String[] args) {
		
		int [] lotto = new int[6];
		
		loop:
		for(int i = 0 ; i < 6 ; i++) {
			int no = (int)(Math.random()*45) + 1;
		
		//중복검사
			for(int j = 0; j < i - 1 ; j++) {
				if(no == lotto[j]) {
					//중복된 경우
					i--;
					continue loop;
				}
			}
	
		lotto[i] = no;
		
		}
		for(int no : lotto) {
			System.out.print(no + " ");
		}
		System.out.println();
		
		/*
		  배열의 길이를 알아내는 방법 : 배열.length
		 */
		
		//오름차순 정렬
		for(int i = 0 ; i < lotto.length - 1 ; i++) {
			for(int j = i + 1 ; j < lotto.length ; j++ ) {
				//만약 i번째 데이터보다 작은 데이터가 있다면 위치를 바꿔준다
				if(lotto[i] > lotto[j]) {
					//i번째 방에 있는 데이터를 변수를 만들어서 기억시킴
					int tmp = lotto[i];
					lotto[i] = lotto[j]; //이제 i번째와 j번째방의 데이터는 같아졌다
					lotto[j] = tmp;
				}
			}
		}
		for(int no : lotto) {
			System.out.print(no + " ");
		}
		System.out.println();
		
	}

}
