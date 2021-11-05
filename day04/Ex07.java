package day04;

import java.util.Arrays;

public class Ex07 {
	/*
	Test09에서 만든 배열을 
	하나의 배열로 깊은 복사를 해서 만드세요.
	단, System.arraycopy() 를 사용해서 만드세요.
 */

	public static void main(String[] args) {
		//1. 깊은 복사를 받을 배열을 만든다
		String[][] copy = new String[1][];
		
		String[][] idol = new String[3][]; 
		String[] blackpink = {"제니", "로제", "리사", "지수"};
		String[] sachoon = {"안지영", "우지윤"};
		String[] minye = {"김형은", "심진화", "장경희"};
		
		idol[0] = blackpink;
		idol[1] = sachoon;
		idol[2] = minye;
		
		System.arraycopy(idol, 0, copy, 0, idol.length);
		System.out.println("copy : " + Arrays.toString(copy));

	}

}
