package day03;

import javax.swing.JOptionPane;

public class Ex01 {
	/*
	  정수를 입력받아서 
	  가장 가까운 10의 배수와 입력한 수의 차를 출력하는 프로그램을 작성하시오
	 */

	public static void main(String[] args) {

		//작업순서
		//1. 정수를 입력받는다
		String sno = JOptionPane.showInputDialog("정수를 입력하세요!");
		int dNo = Integer.parseInt(sno);
		
		//2. 가장 가까운 10의 배수를 구한다 > 1의 자리에서 반올림 = (int)Math.round(변수/10.0)*10;
		//banolim = 반올림한 수
		int banolim = (int)Math.round(dNo/10.0)*10;
		int an = Math.abs(dNo - banolim);
		
		//3. 출력
		JOptionPane.showMessageDialog(null, "입력한 숫자 : " + dNo + "\n가장 가까운 10의 배수 : " + banolim + "\n두 값의 차 :" + an);
		
		
		
	}

}
