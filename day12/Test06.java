package day12;


/*
  yeats_copy.txt파일을 바이트 기반 기반 스트림과 문자기반 보조 스트림을 사용해서 읽어라
  
  InputStreamReader를 사용해서 처리하라
 */

import java.io.*;
public class Test06 {

	public Test06() {
	//스트림 준비
		FileInputStream fin  = null;	//바이트기반 타겟스트림	> 외부장치에 연결하는건 반드시 바이트기반 스트림!!
		InputStreamReader isr = null;	//바이트기반과 문자기반 스트림 연결 스트림
		BufferedReader br = null;		//문자기반 필터스트림
		
		try {
			fin = new FileInputStream("C:/Users/user/git/456/456/kingdom_me/src/day12/yeats_copy.txt");
			isr = new InputStreamReader(fin);
			br = new BufferedReader(isr);
			
			//행 단위로 몇번 작업해야하는지 모르므로 반복처리
			while(true) {
				String str = br.readLine();
				if(str == null) {
					break;
				}
				System.out.println(str);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {	
				br.close();
				isr.close();
				fin.close();
			}catch(Exception e) {
				
			}
		}
	
	
	}

	public static void main(String[] args) {
		new Test06();
	}

}
