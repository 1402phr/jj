package day07;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test01 extends JFrame {
	JFrame fr;		//이게 있으면 아래처럼 쓰면되고 없으면 //로 지운것처럼 쓰기
	JPanel pan, btnPan;
	JButton btn1, btn2;
	
	public Test01() {
		fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//JFrame은 창만 띄운다(안에 내용x)
		pan = new JPanel();		//이게 안에 내용 채우는 것
		btnPan = new JPanel(new GridLayout(1, 2));
		btnPan.setPreferredSize(new Dimension(400, 30));
		
		pan.setPreferredSize(new Dimension(400, 670));
		pan.setBackground(Color.ORANGE);
		
		//버튼만들기
		btn1 = new JButton("색변경");
		btn2 = new JButton("닫 기");
							
		btn1.addActionListener(new ActionListener() {		//원칙대로라면 클래스를 새로 만들어서 new시켜 써야하지만 이 코드는 짧으니 
															//그냥 이렇게 바로 쓰고싶을 때 쓰는 문법 : 색변경 버튼에 기능을 줌
//															 ActionListener는 액션이 주어지는지만 확인하는 감시자 역할 = 이거 무명내부클래스
			@Override	
//			> actionPerformed를 재정의 안해서 오류났는데 얘가 추상함수라 그럼 > 원래 몸체가 없는 actionPerformed를 재정의해서 사용
//			> 이걸 어노테이션이라 부름
			public void actionPerformed(ActionEvent e) {	
				int red = (int)(Math.random()*256);
				int green = (int)(Math.random()*256);
				int blue = (int)(Math.random()*256);
				
				Color c = new Color(red, green, blue);
				pan.setBackground(c);
			}
		});
		
		btn2.addActionListener(new ActionListener() {		//닫기 버튼에 기능을 줌		

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		
		
		btnPan.add(btn1);
		btnPan.add(btn2);
		fr.add(pan, BorderLayout.CENTER);
		fr.add(btnPan, BorderLayout.SOUTH);
//		this.add(pan, BorderLayout.CENTER);		//BorderLayout : 화면을 나눠서 배치함
//		this.add(btnPan, BorderLayout.SOUTH);
		
		fr.setSize(400, 700);
		fr.setVisible(true);
//		this.setSize(400, 700);		//화면의 초기 사이즈
//		this.setVisible(true);		//기본값이 false라 이거 안하면 안보임
		
	}

	public static void main(String[] args) {
		new Test01();
//		new Test01(); new 한번 더 하면 창이 2개 뜸, x누르면 창 2개가 한번에 닫힘
	}

}
