package day04;

import javax.swing.JOptionPane;

public class Lotto {
	/*
	로또는 한게임에 1000원을 지불해야하고 6개의 1 ~ 45 사이의 번호로 구성된다.
	로또 한장에는 다섯게임이 들어간다.
	
	금액을 입력하면
	그 금액에 해당하는 로또게임을 만들어주는 프로그램을 작성하세요.
	
	한 게임당 오름차순으로 정렬되서 출력되게 하세요.
 */

	public static void main(String[] args) {
		
		//게임의 실행순서 : 금액을 입력 > 번호가 나옴(단, 오름차순
		/*만들어야 하는 배열 
		  1. 로또 한장 > 5게임이 들어간다
		  2. 한 게임 > 6번호가 들어간다
		  3. 번호 6개 > 랜덤
			*/					
		//1. 금액을 입력하게 하자
		String no = JOptionPane.showInputDialog("금액을 입력하세요!");
		int don = Integer.parseInt(no);
		
		//2. 로또 배열을 만들자 > 1장 5게임 6숫자
		int[][] jang = new int[5][6];
		
		//3. 

	}

}
