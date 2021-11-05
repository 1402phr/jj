package day03;

import javax.swing.JOptionPane;

public class Ex09 {
	/*
	 숫자 형식의 문자열을 입력한 후, 각 자리수들의 합을 구하는 프로그램을 작성하시오
	 단, 문자열 전체를 정수로 전환하여 계산하는 방법은 사용하지 말라
	 
			문자열의 길이를 알려주는 함수 : 문자열.length()
	 		특정 위치의 문자를 반환해주는 함수 : 문자열.charAt(위치값)
	 		문자열의 특정문자의 위치값을 반환해주는 함수 : 문자열.indexOf(문자)
	 */

	public static void main(String[] args) {
		//1. 숫자형식의 문자열을 입력한다
		String sno = JOptionPane.showInputDialog("숫자를 입력하세요!");
		//int dNo = Integer.parseInt(sno); > 단, 문자열 전체를 정수로 전환하여 계산하는 방법은 사용하지 말라
		
		//2. 각 자리수의 합을 구한다 > 근데 내가 몇자리를 입력할줄 알고?
		System.out.println(sno.length());
		System.out.println(sno.charAt(1));
	}

}
