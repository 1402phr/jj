package day12;

/*
  이미지 파일을 복사해서 복사된 이미지 파일을 만들라
  단, 문자기반 스트림으로 처리한다
  
  이때 이미지 파일은 기계어로 저장된 파일이므로 문자단위로 처리해서는 안된다
  
  이것은 문자단위로 처리하면 안되는 예시를 든 것
 */

import java.io.*;

import javax.swing.JOptionPane;
public class Test04 {

	public Test04() {
		//스트림 준비
		FileReader fr = null;
		FileWriter fw = null;
		try {
			/*fr = new FileReader("C:/Users/user/git/456/456/kingdom_me/src/day12/yeats_fw.txt");
			fw = new FileWriter("C:/Users/user/git/456/456/kingdom_me/src/day12/yeats_copy.txt");*/
			
			//파일에 연결
			fr = new FileReader("C:/Users/user/Pictures/Saved Pictures/webtoon.jpg");
			fw = new FileWriter("C:/Users/user/git/456/456/kingdom_me/src/day12/sajin.jpg");	
			
			//반복 횟수를 알 수 없으므로 문자배열을 준비
			char[] arr = new char[1024];
			while(true) {
				int len = fr.read(arr);
				if(len == -1) {
					//이 경우는 더이상 읽어올 데이터가 없는 경우
					break;
				}
				fw.write(arr, 0, len);
			}
			JOptionPane.showMessageDialog(null, "파일복사 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
				fr.close();
			}catch(Exception e) {
				
			}
		}
		
		
		//읽어서 바로 저장
		
		//완료 메시지 출력
		
		
	}

	public static void main(String[] args) {
		new Test04();
	}

}
