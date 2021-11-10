package day12;

/*
 * ObjectInputStream으로 jenny 읽기
 */

import java.io.*;
import javax.swing.*;
public class Test08 {

	public Test08() {
	//스트림 준비
	FileInputStream fin = null;
	ObjectInputStream oin = null;
	
	try {
		fin = new FileInputStream("C:/Users/user/git/456/456/kingdom_me/src/day12/jenny.txt");
		oin = new ObjectInputStream(fin);
		
		//클래스를 통째로 읽는다
		Member jenny = (Member)oin.readObject();
		/*
		 ObjectInputStream는 객체데이터를 채울 때 Object타입으로 자동 형변환하여
		 처리한다
		 따라서, 읽을 때에는 원래 타입으로 강제 형변환이 필요하다
		 */
		String name = jenny.getName();
		String id = jenny.getId();
		String pw = jenny.getPw();
		String tel = jenny.getTel();
		String mail = jenny.getMail();
		int age = jenny.getAge();
		double height = jenny.getHeight();
		
		//출력 > 신장: %5.2f\n > %5.2f : %f는 실수, 5는 5자리 정수, 2는 소수점 2자리를 의미
		String str = String.format("이름 : %s\n아이디 : %s\n비밀번호 : %s\n전화번호 : %s\n메일 : %s\n나이 : %3d\n신장: %5.2f\n", 
								   name, id, pw, tel, mail, age, height);
		JOptionPane.showMessageDialog(null, str);
		
	}catch(Exception e) {
		
	}finally {
		try {
			
		}catch(Exception e) {
			
		}
	}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
