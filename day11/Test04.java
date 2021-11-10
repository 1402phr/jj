package day11;

/*
 	파일을 만들어서 저장하는 프로그램을 작성해보자
 */

import java.io.*;

import javax.swing.*;
public class Test04 {

	
	public Test04() {
		//파일로 저장하기 위해서는 파일에 연결된 스트림이 필요하다
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("C:/Users/user/git/456/456/kingdom_me/src/day11/fileTest.txt");
			//이때 파일은 존재하지 않아도 경로는 존재해야한다 > 파일이 없는 경우는자동으로 만들어줌
			/*1. 한글자 입력하고 저장
			fout.write('0');
			*/
			
			//2. 여러글자 저장
			String str = "웹툰런칭" + "\r\n" + "축하해용♥";
			//문자열을 바이트 단위로 변환
			byte[] buff = str.getBytes();
//			fout.write(buff);
			
			//일부만 저장하는 방법
			//먼저 위치값찾기
			int idx = str.indexOf("웹툰") + 1;
			fout.write(buff, idx, buff.length - idx);
			
			JOptionPane.showMessageDialog(null, "파일저장 성공");
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			//외부장치와 연결된 경우, 해당 외부장치의 사용이 끝나면 닫아주는 것이 원칙이다
			try {
				fout.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
