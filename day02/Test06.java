package day02;

import javax.swing.JOptionPane;

public class Test06 {
	/*
	 	조건제어문 : if
						조건에 맞는 경우에만 실행하는 제어문
	 */
	public static void main(String[] args) {
		/*
		 숫자를 입력받아서 짝수인지 홀수인지를 판별하는 프로그램을 작성하라
		 */
		String sno = JOptionPane.showInputDialog("정수를 입력하세요.");
		int no = Integer.parseInt(sno);
		
		String result = "홀수입니다.";
		//String result = "홀수입니다."; 처럼 미리 조건에 맞지 않는 결과를 만들고 해도 됨
		if(no % 2 == 0) {
			result = "짝수입니다.";
			
			/*
			 String result = "";
			 if(no % 2 == 0) { result = "짝수입니다."; }
			 if(no % 2 == 1) { result = "홀수입니다."; }
			 여기 주석처럼 만들면 조건에 맞는 경우와 맞지 않는 경우를 모두 처리하는 것
			 */
		}
		
		JOptionPane.showMessageDialog(null, "입력받은 숫자 " + no + "는 " + result);
		
		
	}
}
