package day12;

/*
  콘솔에 입력한 데이터를 data.txt 파일에 누적되게 저장시키는
  프로그램을 작성하세요  
 */

import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class Ex01 {
	JFrame fr;
	JButton sBtn, oBtn;
	JTextArea area;
	JScrollPane pan;
	JPanel bPan;
	public Ex01() {
		//창만들기
		fr = new JFrame("*** SClass ***");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//내용을 담을 패널 만들기
		bPan = new JPanel(new GridLayout(1, 2));
		
		//버튼만들기
		sBtn = new JButton("저장하기");
		oBtn = new JButton("불러오기");
		bPan.add(oBtn);
		bPan.add(sBtn);
		
		//클릭 이벤트 추가
		BtnEvt evt = new BtnEvt(this);
		oBtn.addActionListener(evt);
		sBtn.addActionListener(evt);
		
		//텍스트 공간
		area = new JTextArea();
		area.setPreferredSize(new Dimension(500, 570));
		
		area.setFont(new Font("D2coding", Font.PLAIN, 16));
		
		//스크롤 패널 만들기
		pan = new JScrollPane(area);
		
		fr.add(pan, BorderLayout.CENTER);
		fr.add(bPan, BorderLayout.SOUTH);
		
		fr.setSize(500, 600);
		fr.setVisible(true);
		fr.setResizable(false);
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
