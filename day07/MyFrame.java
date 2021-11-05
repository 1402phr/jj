package day07;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
	JPanel pan, btnPan;
	JButton btn1, btn2;
	
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		pan = new JPanel();	
		btnPan = new JPanel(new GridLayout(1, 2));
		btnPan.setPreferredSize(new Dimension(400, 30));
		
		pan.setPreferredSize(new Dimension(400, 670));
		pan.setBackground(Color.ORANGE);
		
		//버튼만들기
		btn1 = new JButton("색변경");
		btn2 = new JButton("닫 기");

		
		
		btn1.addActionListener(this);		//왜 여기 this를 넣으면 오류를 잡을 수 있나?
		
		btn2.addActionListener(this);
		
		
		btnPan.add(btn1);
		btnPan.add(btn2);
		
		add(pan, BorderLayout.CENTER);
		add(btnPan, BorderLayout.SOUTH);

		this.setSize(400, 700);		
		this.setVisible(true);		
			
	}

	public static void main(String[] args) {
		new MyFrame();
	}
	class MyEvent implements ActionListener { 
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		switch(str) {
		case "색변경":
			int red = (int)(Math.random()*256);
			 int green = (int)(Math.random()*256);
			 int blue = (int)(Math.random()*256);
			
			 Color c = new Color(red, green, blue);
			 pan.setBackground(c);
			 break;
			 
			 default: 
				 System.exit(0);
		}		 
		}


	}

}
