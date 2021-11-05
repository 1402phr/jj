package day04;

public class Test09 {
	/*
	  아이돌 3그룹을 배열로 관리하라
	 */

	public static void main(String[] args) {
		String[][] idol = new String[3][]; //배열안의 배열에 들어갈 데이터 길이는 미정. 단, 타입은 모두 String이다
		String[] blackpink = {"제니", "로제", "리사", "지수"};
		String[] sachoon = {"안지영", "우지윤"};
		String[] minye = {"김형은", "심진화", "장경희"};
		
		idol[0] = blackpink;
		idol[1] = sachoon;
		idol[2] = minye;
		
		//출력 > for(꺼내올 데이터 타입 : 배열) > 여기서 꺼내올 데이터 타입 자체가 스트링 배열임 
		for(String[] one : idol) {
			for(String hana : one) {
				System.out.print(hana + " | ");
			}
			System.out.println(); //줄바꿈
 		}

	}

}
