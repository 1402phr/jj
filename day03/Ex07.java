package day03;

import javax.swing.JOptionPane;

public class Ex07 {
	/*
	 컴퓨터가 랜덤하게 두자리 정수를 만들어서 그 숫자를 사용자가 맞추는 게임을 만들어라
	 
	 옵션 ]
	       1. 10회 이내에 맞추지 못하면 게임은 종료되도록 한다 > ..?
	       2. 맞출때까지 계속 도전 가능하도록 한다 > 반복문 쓰면 될듯?
	       3. 입력한 숫자보다 큰 수인지 작은 수인지를 알려줄 수 있도록한다 > 조건 넣으면 되려나
	 */

	public static void main(String[] args) {
		//1. 컴퓨터가 만드는 랜덤한 두자리 정수
		int cno = (int)(Math.random()*90)+10;
		
		//2. 사용자가 숫자를 입력하도록 한다
		String dNo = JOptionPane.showInputDialog("숫자를 입력하세요!\n*단, 두자리 정수만 입력 가능합니다*");
		int hno = Integer.parseInt(dNo);
		
		//3. 두 수를 비교하여 동일한지 확인한다
		if( cno == hno ) {
			JOptionPane.showMessageDialog(null, "정답!");
		}else if( cno != hno ) {
			JOptionPane.showMessageDialog(null, "오답!");
		}
		

	}

}
