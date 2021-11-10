package day11;

/*
 	파일에 저장하는 프로그램을 작성하세요
 	단, Buffered 스트림을 사용할것
 */
import java.io.*;

import javax.swing.JOptionPane;
public class Test08 {

	public Test08() {
	//반드시 기본(타겟)스트림이 먼저 필요하다
	FileOutputStream fout = null;
	//보조(필터)스트림 연결
	BufferedOutputStream bout = null;
	
	try {
		fout = new FileOutputStream("C:/Users/user/git/456/456/kingdom_me/src/day11/버퍼드테스트01.txt");
		bout = new BufferedOutputStream(fout);
		
		//저장할 데이터를 만든다
		String str = "♥♥♥웹툰런칭 축하해♥♥♥ ";
		
		//바이트기반 스트림을 사용하기 때문에 바이트 배열이 필요함
		byte[] buff = str.getBytes();
		bout.write(buff);
		
		//주의 : 버퍼는 다 채우지 않으면 자동으로 꺼내지지않는다 > 아직 FileOutputStream에 전달 전임
		//따라서, 완료된 시점에서 버퍼를 비워주는 습관이 필요하다
		bout.flush(); 	//여기는 오토 플러시가 있는데 안되는데도 있으니까..
		
		JOptionPane.showMessageDialog(null, "축하해용");
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		try {
			bout.close();	// 보조 스트림 먼저 닫아줌
			fout.close();
		}catch(Exception e) {
			
		}
	}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
