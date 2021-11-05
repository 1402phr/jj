package day07.cP;

/**
 * 이 클래스는 닫기버튼 이벤트 처리용 클래스
 * @author
 * @since
 * @version v.1.0
 * @see
 * 		day07.cP.ColorFr
 * 		java.awt.event.ActionListener
 * 
 * 		작업이력 ]
 * 				2021.11.02 - 클래스작성	- 담당자 : 나
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CloseBtn implements ActionListener {
	//ColorFr 객체의 주소를 기억할 준비를 한다 = 변수를 만든다
	ColorFr main;
	
	//이 클래스가 객테가 되는 순간, ColorFr 객체의 주소를 전달받아 기억해놓는다
	public CloseBtn() {}
	public CloseBtn(ColorFr main) {
		this.main = main;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
