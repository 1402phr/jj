package day02;

import javax.swing.*;
public class Test03 {
	/*
	 * 정수를 입력받아서 짝수인지 홀수인지를 출력해주는 프로그램을 작성하시오 > 이건 콘솔이 아니라 다른 팝업이 뜨는거
	 */
	public static void main(String[] args) {
		//작업순서
		//1. 입력창을 띄워서 먼저 입력받고
		String str = JOptionPane.showInputDialog("***정수를 입력하세요!***");
		
		//2. 문자열을 정수로 변경하고
		/*참고
		 * 정수 형태의 문자열을 정수로 바꾸는 방법
		  		int 변수이름 = Integer.parseInt(문자열)
		 */
		int inNo = Integer.parseInt(str);
		
		//3. 짝수인지 홀수인지 판별하고 
		String strNo = inNo % 2 ==0 ? "짝수" : "홀수";
		
		
		//4. 결과를 출력한다
		JOptionPane.showMessageDialog(null, "입력한 숫자 [" + inNo + "]는 [ " + strNo + " ] 입니다.");
	}
}
