package day03;

import javax.swing.JOptionPane;

public class Ex05 {
	/*
	  용도와 사용량을 입력하면 전기요금을 계산해주는 프로그램을 작성하라
	  
	  단, 전기요금은 아래와 같다
	  		
	  		종류		코드		기본요금		사용요금
	  		가정용		1			3800			245
	  		산업용		2			2400			157
	  		교육용		3			2900			169
	  		상업용		4			3200			174
	  	
	 */

	public static void main(String[] args) {
		//1. 용도를 입력하도록 한다
		String sno1 = JOptionPane.showInputDialog("코드를 입력하세요!\n가정용은 1\n산업용은 2\n교육용은 3\n상업용은 4");
		int dNo1 = Integer.parseInt(sno1);
		
		//2. 사용량을 입력하도록 한다
		String sno2 = JOptionPane.showInputDialog("사용량을 입력하세요!");
		int dNo2 = Integer.parseInt(sno2);
		
		//계산된 사용량 = an
		
		//3. 계산   > 실행문 안쪽에 계산만 하고 끝나는게 아니라 그걸 쓸 수 있도록 변수를 주던지 뭐던지 해야함
		if(dNo1 == 1) { JOptionPane.showMessageDialog (null, "사용량은 " + (dNo2 * 245 + 3800));
					  }else if(dNo1 == 2) {
						  JOptionPane.showMessageDialog (null, "사용량은 " + (dNo2 * 157 + 2400));
					  }else if(dNo1 == 3) {
						  JOptionPane.showMessageDialog (null, "사용량은 " + (dNo2 * 169 + 2900));
					  }else if(dNo1 == 4) {
						  JOptionPane.showMessageDialog (null, "사용량은 " + (dNo2 * 174 + 3200)); 
					  }else {
						  JOptionPane.showMessageDialog(null, "올바르지 않은 코드 입력입니다!");
					  }
		

	}

}
