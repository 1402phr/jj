package day13;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Test05 {
	JFrame fr;
	JPanel pan, bPan;	//pan : 계속 색을 바꿈	> 병행처리
	JLabel lbl;		// 시간을 띄울것	> 병행처리
	JButton btn1, btn2;		// 버튼 2개
	ColorThr colorTrd;
	TimeThr tThread;
	public Test05() {
		fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//창 끄면 프로그램 종료되라는 의미
		
		//시간 스레드 뉴본 전위
		tThread = new TimeThr(this);
		
		//패널만들기
		pan = new JPanel();
		pan.setBackground(Color.ORANGE);
		bPan = new JPanel(new GridLayout(1, 2));
		
		//라벨 만들기
		lbl = new JLabel("2021년 11월 10일 13:10:25");	//시간을 적은 이유는 어떻게 나오는지 확인용
		lbl.setFont(new Font("D2coding", Font.BOLD, 20));
		
		//pan에 lbl 추가
		pan.add(lbl);
		
		//버튼만들기
		btn1 = new JButton("배경색 일시중지");
		btn2 = new JButton("시간 일시중지");
		
		
		//bPan에 버튼 추가
		bPan.add(btn1);
		bPan.add(btn2);
		
		//fr에 패널추가
		fr.add(pan, BorderLayout.CENTER);
		fr.add(bPan, BorderLayout.SOUTH);
		
		
		
		
		fr.setSize(450, 200);
		fr.setVisible(true);
		fr.setResizable(false);
		
		//스레드 프로그램 실행
		doThread();
		
		//버튼에 이벤트 추가
		btn1.addActionListener(new ColorEvt(this));
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//시간 일시정지 버튼이 클릭되면 bool변수 값을 변경
				tThread.setBool(!tThread.isBool());
			}
		});
		
	}

	public static void main(String[] args) {
		new Test05();	}
	
	public void doThread() {
		colorTrd = new ColorThr(this);	// new born 상태
		
		//runnable 전이
		colorTrd.start();
	}
}
