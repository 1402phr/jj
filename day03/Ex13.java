package day03;

import javax.swing.JOptionPane;

public class Ex13 {
	/*
	정수를 입력받아서
	0부터 입력받은 정수까지의 합을 계산해주는 프로그램을 작성하세요. > 반복문
 */

	public static void main(String[] args) {
		//1. 정수를 입력받는다
		String str = JOptionPane.showInputDialog("숫자를 입력하세요!");
		int no = Integer.parseInt(str);
		
		//2. 0부터 no까지의 합을 구한다
		for(int i = 0 ; i <= no ; i++) {
			if(i == no) {break;
			}
		}
		
	}

}
