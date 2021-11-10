package day12;

/*
  Test02에서 저장한 파이를 읽어보자
 */

import java.io.*;
public class Test03 {

	public Test03() {
		FileReader fr = null;
		
		try {
			fr = new FileReader("C:/Users/user/git/456/456/kingdom_me/src/day12/yeats_fw.txt");
			
			/*1. 한글자만 읽어오자
			int ch = fr.read();
			System.out.println("읽어온 문자 : " + (char)ch);
			*/
			/*2. 여러문자 읽기 @java.lang - String
			char[] chArr = new char[32];
			int len = fr.read(chArr);
			System.out.println(new String(chArr, 0, len));
			*/
			/*3. 한행만 읽어오기	(한 행을 읽어오려면 \r\n 나올때까지 반복문)
			char[] chArr = new char[32];
			loop:
			while(true) {
				int len = fr.read(chArr);
				for(int i = 0 ; i < len ; i++) {
					if(chArr[i] == '\r') {
						len = i;
						System.out.print(new String(chArr, 0, len));
						break loop;
					}
				}
				System.out.print(new String(chArr, 0, len));
			}	*/ 
			//전체를 불러오는 경우 len=-1될때까지 반복문
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			}catch(Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
