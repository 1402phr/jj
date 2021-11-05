package day10;

import java.io.*;
import java.util.*;
public class Test03 {
	/*
	  Properties를 이용하여 사용하던 Map데이터를 그 데이터를 파일에 저장하라
	 */
	
	//이 클래스 안에서는 Properties 변수를 계속 사용해야하므로 전역변수로 만든다
	Properties prop = new Properties();
	
	public Test03() {
		//준비된 데이터를 채운다
		prop.put("name", "제니");
		prop.put("tel", "010-1111-1111");
		prop.put("age", "24");	//문자열데이터로 넣어야함
		prop.put("mail", "jenny@cnu.ac.kr");
		
		/*
		  Properties는 위에서 알 수 있다시피 Map처럼 다루고 데이터 사용 또한 Map의 방식을 따른다
		  사용하다가 이 데이터를 파일로 저장할 시점이 되면 
		 */
		FileOutputStream fout = null;	// 경로를 못찾는 경우는 예외가 발생하므로 일단 null로 초기화
		try {	fout = new FileOutputStream("src/day10/result.properties");	//이 작업은 파일이 없는 경우는 생성도 해준다
				prop.store(fout, "Properties파일 저장 예제"); 	//실제 저장시키는 명령
				System.out.println("파일저장 성공");
		} catch(Exception e) {
				 System.out.println("저장실패");
				 e.printStackTrace();
			 }
		}
		
	public static void main(String[] args) {
		new Test03();
		
	}

}
