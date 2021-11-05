package day03;

import javax.swing.JOptionPane;

public class Ex06 {
	/*
	 컴퓨터와 사용자가 가위바위보 게임을 한다
	 컴퓨터는 랜덤하게 1~3사이의 숫자를 발생시켜 가위(1), 바위(2), 보(3)를 만들고
	 사용자는 키보드로 1~3 사이의 숫자를 입력할때, 누가 이겼는지 확인하는 프로그램을 작성하라
	  JOptionPane.showMessageDialog(null, "승리!");
		JOptionPane.showMessageDialog(null, "패배!");
		JOptionPane.showMessageDialog(null, "무승부!");

	 */

	public static void main(String[] args) {
		//1. 컴퓨터의 랜덤 숫자
		int cno = (int)(Math.random() * 3) + 1;
		
		//2. 사람은 키보드로 입력할거야
		String dNo = JOptionPane.showInputDialog("숫자를 입력하세요!\n가위는 1\n바위는 2\n보는 3");
		int hno = Integer.parseInt(dNo);
		
		//3. 누가 이겼는지 알아보기
		//1 : 2에 지고 3에 이긴다 / 2 : 1에 이기고 3에 진다 / 3 : 1에 지고 2에 이긴다 / 같은 수는 비긴다
		if(cno == hno) { JOptionPane.showMessageDialog(null, "무승부!");
		} else if(cno == 1) { hno == 2 ? JOptionPane.showMessageDialog(null, "승리!") : JOptionPane.showMessageDialog(null, "패배!");								
		} else if(cno == 2) { hno == 1 ? JOptionPane.showMessageDialog(null, "승리!") : JOptionPane.showMessageDialog(null, "패배!");
		} else if(cno == 3) { hno == 2 ? JOptionPane.showMessageDialog(null, "패배!") : JOptionPane.showMessageDialog(null, "승리!");
		}
		}
	}
