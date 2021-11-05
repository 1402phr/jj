package day02;

import javax.swing.JOptionPane;

public class Test08 {
	/*
	 나이를 입력받아서 해당 나이가
	 유년기 / 10대 / 20대 / 30대 / 장년층 중 어느곳에 속하는지 판별하는 
	 프로그램을 작성하라
	 단, 40대 이상은 모두 장년층으로 본다
	 */
	public static void main(String[] args) {
		/*
		String sno = JOptionPane.showInputDialog("나이를 입력하세요!");
		int age = Integer.parseInt(sno);
		
		//판별하기와 결과값 변수
		String result = "";
		if(age < 10) {
			result = "유년기";
		} else if(age < 20) {
			result = "10대";
		} else if(age < 30) {
			result = "20대";
		} else if(age < 40) {
			result = "30대";
	    } else {
	    	result = "장년층";
		}
		//결과출력
		JOptionPane.showMessageDialog(null, "입력한 나이 " + age + " 는 " + result + " 입니다.");	
		*/
		String sno = JOptionPane.showInputDialog("나이를 입력하세요!");
		int age = Integer.parseInt(sno);
		String result = "";
		int tmp = age / 10;
		switch(tmp) {
			case 0: 
				result = "유년기";
				break;
			case 1: 
				result = "10대";
				break;
			case 2: 
				result = "20대";	
				break;
			case 3: 
				result = "30대";
				break;
			default: 
				result = "장년층";
		}
		JOptionPane.showMessageDialog(null, "입력한 나이 " + age + " 는 " + result + " 입니다!");
		}
	}

