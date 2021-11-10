package day12;

/*
 	yeats_copy.txt 파일을 문자기반 보조스트림을 이용하여 읽어보자
 */

import java.io.*;
public class Test05 {

	public Test05() {
	//스트림 준비
	FileReader fr = null;
	BufferedReader br = null;
	
	try {
		//파일에 연결
		fr = new FileReader("C:/Users/user/git/456/456/kingdom_me/src/day12/yeats_copy.txt");
		br = new BufferedReader(fr);
		
		//반복횟수를 알 수 없음
		String result = "";
		while(true) {
		//BufferedReader는 버퍼 + 편의기능을 가지고 있어서 배열없이 바로 읽을 수 있다
			String str = br.readLine();
			/*주의사항 : readLine()은 줄바꿈 기호를 만나면 읽는것을 멈춘다
			  			 (줄바꿈 기호를 안꺼냄 > 원본처럼 줄바꿈이 안되어있음 > 줄바꿈 기호를 추가할 필요
			*/
			if(str == null) {
				//꺼내올 데이터가 없는 경우
				break;
			}
				result = result + str + "\r\n";
				System.out.println(result);
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		try {
			br.close();
			fr.close();
		}catch(Exception e) {
			
		}
	}
		
		
	//읽어서 데이터 만들기
		
	//출력
	}

	public static void main(String[] args) {
		new Test05();
	}

}
