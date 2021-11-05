package day04;

public class Ex05 {
	/*
	 int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};를 준비하고 
	 79456원을 준비된 화폐로 계산할 때 각 화폐단위가 몇 개씩 필요한지 기억하는 배열을 만들고
	 출력하는 프로그램을 작성하시오
	 
	 */

	public static void main(String[] args) {
		/*
		//1. 배열을 준비
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
		
		//2. 79456원을 계산하자
		int total = 79456;
		for(int don : coin) {
			for(don = )
		}
		*/
		// 필요한 변수를 만들고
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
		int[] cnt = new int[coin.length]; //단위당 몇장이 필요한지 담는 배열
		
		int total = 79456;
		int tmp = total;
		
		//반복해서 화폐 꺼내서 계산하고 기록하기를 반복함
		for(int i = 0 ; i < coin.length - 1 ; i++ ) { // i < coin.length - 1 이므로 10원 단위까지 나눔
			//화폐단위 개수만큼 반복해서 화폐를 꺼내옴
		cnt[i] = tmp / coin[i]; //필요한 개수를 기억
		//지불한 금액은 빼서 다시 기억시켜야함 > tmp
		tmp = tmp % coin[i]; //  i < coin.length - 1 이므로 10원 단위까지 나눴으므로 결국 tmp= 나누지 않은 1원단위 값인 6이됨
		}
		cnt[coin.length - 1] = tmp;
		
		for(int i = 0 ; i < coin.length ; i++) {
			System.out.printf("%6d : %d장\n", coin[i], cnt[i]);
			
	   //왼쪽 정렬 System.out.printf("%-6d : %d장\n", coin[i], cnt[i]); 
		}
		

	}

}
