package day11;

/*
 	Test02.java 파일을 읽어보자
 */
import java.io.*;
public class Test03 {
	//파일로 연결된 스트림을 준비
	FileInputStream fin = null;	//null로 초기화한 이유 : 오류나지 말라고. 뒤에가서 예이처리해줄거임
	public Test03() {
		try {
			fin = new FileInputStream("C:/Users/user/git/456/456/kingdom_me/src/day11/Test02.java");
			
			/*1. 한글자만 읽어보자
			int ch = fin.read();
			//1-2. 읽은 데이터를 문자로 변환
			char munja = (char)ch;
			//1-3. cnffur
			System.out.println("읽은 문자 : " + munja);
			*/
			/*2. 여러문자를 읽자
			byte[] buff = new byte[1024];
			//2-2. 데이터 읽기
			int len = fin.read(buff);
			//2-3. 문자열로 변환
			String result = new String(buff, 0, len);
			//2-4. 출력
			System.out.println("읽은 데이터 : \n" + result );
			*/
			//3. 파일 전체를 읽어오자
			byte[] buff = new byte[1024];
			while(true) {
			int len = fin.read(buff);
			//read()의 반환값은 읽어온 데이터가 없는 경우는 -1을 반환
			if(len == -1) {
			//읽어올 데이터가 없다 = 파일을 다 읽었다
				break;
			}
			//문자열 변환
			String result = new String(buff, 0, len);
			//출력
			System.out.println("Test02.java File ] \n" + result);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
