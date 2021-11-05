package day07.cP;
/**
 * 이 클래스는 색상변경버튼 이벤트 처리용 클래스
 * @author
 * @since
 * @version v.1.0
 * @see
 * 		day07.cP.ColorFr
 * 		java.awt.event.ActionListener
 * 		java.awt.Color
 * 
 * 		작업이력 ]
 * 				2021.11.02 - 클래스작성	- 담당자 : 나
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnEvt implements ActionListener {
	//ColorFr 객체의 주소를 기억할 준비를 한다 = 변수를 만든다
	ColorFr main;
	
	//이 클래스가 객테가 되는 순간, ColorFr 객체의 주소를 전달받아 기억해놓는다
	public BtnEvt() {}
	public BtnEvt(ColorFr main) {
		this.main = main;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int red = (int)(Math.random()*256);
		int green = (int)(Math.random()*256);
		int blue = (int)(Math.random()*256);
		
		Color c = new Color(red, green, blue);
		main.pan.setBackground(c);
	}

}
