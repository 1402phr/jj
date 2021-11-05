package day10;

import java.util.*;

import javax.swing.JOptionPane;
public class Test04 {
	/*
	  프로그램에 관련된 정보를 컬렉션을 이용하여 출력하자
	 */

	public Test04() {
		Properties prop = System.getProperties();
		//System.getProperties() : 프로그램에 관련된 정보를 Map의 형태로 만들어주는 함수
		
		//먼저 어떤 키값으로 데이터들이 기억되어있는지 알기위해 키값만 추출
		Enumeration en = prop.keys();
		
		//순차적으로 키값을 꺼내서 저장된 데이터를 출력 
		StringBuffer buff = new StringBuffer();
		while(en.hasMoreElements()) {		//while(en.hasMoreElements()) en에 데이터가 남아있으면 반복할테니까 있는거 다 꺼내란 소리
			
			//1. 키값 꺼내기
			String key = (String)en.nextElement();
			buff.append(key + " :\n ");
			
			//2. 키값을 가지고 데이터 꺼내기
			String value = (String)prop.get(key);
			buff.append(value + " :\n\n");
			//3. 출력
//			System.out.println(key + " : " + value);
		}
		System.out.println(buff.toString());
		JOptionPane.showInternalMessageDialog(null, buff.toString());
		
	}

	public static void main(String[] args) {
		new Test04();
	}

}
