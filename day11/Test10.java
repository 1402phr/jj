package day11;

/*
  Test09에서 작성한 파일을 읽어보자
 */

import java.io.*;
public class Test10 {

	public Test10() {
	//1. 스트림 준비
	FileInputStream fin = null;
	DataInputStream din = null;
	
	try {
		//2. 스트림 연결
		fin = new FileInputStream("C:/Users/user/git/456/456/kingdom_me/src/day11/DataStreamTest01.txt");
		din = new DataInputStream(fin);
		/*
		 파일 저장시에 이름, 나이, 신장, 성별, 전화번호, 메일 순서대로 
		 저장했으므로 읽을때도 이 순서가 지켜져야한다
		 순서 틀리면 오류남
		 */
		String name = din.readUTF();
		int age = din.readInt();
		double height = din.readDouble();
		char gen = din.readChar();
		String tel = din.readUTF();
		String mail = din.readUTF();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + height);
		System.out.println("성별 : " + gen);
		System.out.println("전화 : " + tel);
		System.out.println("메일 : " + mail);
	}catch(Exception e) {
		e.printStackTrace();
		
	}finally {
		try {
			din.close();
			fin.close();
		}catch(Exception e) {
			
		}
	}
	}

	public static void main(String[] args) {
		new Test10();
	}

}
