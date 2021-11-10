package day11;

/*
 	파일에 친구의 정보를 저장하자
 	정보
 		이름		String 
 		나이		int	
 		신장		double
 		성별		char
 		전화번호	String
 		메일		String
 */

import java.io.*;
public class Test09 {

	public Test09() {
		//기본 스트림 준비
		FileOutputStream fout = null;
		//필터스트림 준비
		DataOutputStream dout = null;
		try{	
			//스트림 연결
			fout = new FileOutputStream("C:/Users/user/git/456/456/kingdom_me/src/day11/DataStreamTest01.txt");
			dout = new DataOutputStream(fout);
			
			//데이터 만들기
			String name = "제니";
			int age = 26;
			double height = 160.5;
			char gen = 'F';
			String tel = "010-1111-1111";
			String mail = "jenny@cnu.ac.kr";
			/*
			 DataInputStream/DataOutputStream은 자바의 데이터 타입을 자바의 데이터를 바이트로 변환하지않고도 
			 전송할 수 있다
			 */
			dout.writeUTF(name);
			dout.writeInt(age);
			dout.writeDouble(height);
			dout.writeChar(gen);
			dout.writeUTF(tel);
			dout.writeUTF(mail);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				dout.close();
				fout.close();
			}catch(Exception e){
				
			}
		}
	}

	public static void main(String[] args) {
		new Test09();
	}
//이렇게 하면 파일 저장은 되는데 내용은 깨짐 DataInputStream으로 읽어와야 제대로 볼 수있음
}
