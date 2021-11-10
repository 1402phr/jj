package day11;

/*
 	fileTest.txt 파일을 fileTest_copy1.txt로 복사해보자
 */

import java.io.*;

import javax.swing.JOptionPane;
public class Test07 {

	public Test07() {
	/*
	 복사는 읽어서 다른곳에 그대로 쓰는 것, 스트림을 2개 사용하면됨
	 (스트림은 단방향 : 읽는것1, 쓰는것1)
	 */
	//1. 스트림 준비
		FileInputStream fin = null;	//원본. 오류나면 안되니까 일단  null 초기화
		FileOutputStream fout = null;	//복사본. 오류나면 안되니까 일단  null 초기화
		
	//2. 파일을 읽어서 그대로 저장
		try {
		fin = new FileInputStream("C:/Users/user/git/456/456/kingdom_me/src/day11/fileTest.txt");
		fout = new FileOutputStream("C:/Users/user/git/456/456/kingdom_me/src/day11/fileTest_copy1.txt");
		//반복해서 처리하고 이때 읽어서 그대로 다른곳에 쓰면 됨
		byte[] buff = new byte[1024];
		while(true) {
			int len = fin.read(buff);
			if(len == -1) {
				//읽어올 데이터가 없으므로 반복을 종료시킨다
				break;
			}
			fout.write(buff, 0, len);
		}
		
		JOptionPane.showMessageDialog(null, "저장성공");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("파일복사 실패");
		}finally {
			try {
				fin.close();	// 먼저 만든 스트림을 닫아줌(기본-기본의 경우)
				fout.close();
			}catch(Exception e) {
				
			}
		}
		
	//3. 스트림 닫기
	}

	public static void main(String[] args) {
		new Test07();
	}

}
