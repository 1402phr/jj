package day04;

import java.util.Arrays;

public class Test08 {
	/*
	  다차원 배열
	  	배열을 다시 배열로 관리하는 것 @see Ex06 > 배열을 각각 만들어서 변수도 많고 어려움
	  											 > 식별자가 많다 = 헷갈릴 가능성이 높다
	  	형식 
	  		1. 이차원배열의 경우
	  			int[][] 변수이름 = new int[바깥쪽 관리할 배열개수][안쪽 배열이 관리할 데이터 개수];
	  			==>안쪽 배열의 길이가 모두 같은 형태로 만들어진다
	  			
	  		2. 안쪽 배열의 길이가 다른 경우
	  			int[][] 변수이름 = new int[관리할 배열개수][];
	  			==>안쪽 배열의 길이를 설정하지 않았기 때문에 아무거나 와도 상관무
	  	
	 */

	public static void main(String[] args) {
		//사각형 5개의 가로, 세로, 넓이를 하나의 배열로 관리하세요
		//단, 가로/세로의 길이는 랜덤하다
		
		//1. 전체 배열을 만든다
		int[][] sagak = new int[5][3]; //사각형 5개/데이터정보 3개(가로, 세로, 넓이)
				
		//2. 배열에 데이터를 채운다
		for(int i = 0; i < sagak.length ; i++ ) {
			int garo = (int)(Math.random() * 21 + 5);
			int sero = (int)(Math.random() * 21 + 5);
			
			sagak[i][0] = garo;
			sagak[i][1] = sero;
			sagak[i][2] = garo * sero;						
		}
		
		//3. 하나씩 꺼내서 데이터를 출력한다   > toString()은 정말 출력용이라 이걸로 연산 못함 
		for( int[] nemo : sagak) { //int[] nemo는 int 배열 nemo를 의미
			System.out.println(Arrays.toString(nemo));
		}
	}

}
