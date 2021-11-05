package day10;

/*
 	dooly.txt 파일을 읽고 Map에 담아 출력하라 
 */

import java.io.*;		// 파일 읽어오기위함
import java.util.*;		// 컬렉션 사용하기 위함
public class Test01 {
	Properties prop = new Properties();
	//외부파일과 연결할 예정
	//이 작업은 IO쪽 수업에서 자세히 다룰 예정
	FileInputStream fin = null; 	
	// 파일을 읽을 때 쓰는 클래스
	//왜 null인가? : 오류날 소지가 많아서(파일 이름과 위치가 정확해야함) 예외처리가 필요하기 때문에 
	//null로 초기화해놓고 try블럭에서 
	public Test01() {
		try {	
			fin = new FileInputStream("C:/Users/user/git/456/456/kingdom_me/src/day10/dool2.txt");
			/*
			  경로는 절대경로와 상대경로 모두 사용 가능한데 
			  지금 처리는 프로젝트를 기준으로 한 상대경로
			  맨앞에 / 붙이면 절대경로가 되므로 그러면 안됨 > 맨앞에 / 붙이는건 유닉스 규칙
			  절대경로를 쓰고 싶으면 파일검색기에서 붙복해오세요
			 */
			//이제 파일 내용을 properties가 읽게 한다
			prop.load(fin);
			//이순간 파일의 내용을 읽어서 Map에 담는다
		} catch(Exception e) {
			e.printStackTrace(); 
		}
		
		//이제 Map이 완성되었으니 맵을 읽어서 내용을 출력하자
		Set keys = prop.keySet();
		
		//키값들을 알아냈으니 데이터를 꺼내 출력하자
		ArrayList list = new ArrayList(keys);
		
		//맵에 있는 데이터를 꺼낼 준비가 되었으니 출력하자
		for(int i = 0 ; i < list.size() ; i++) {
			String key = (String)list.get(i);
			String value = (String)prop.get(key);
			
			System.out.println(key + " : " + value);	//이러면 깨짐 > cmd 열어서 인코딩
		}
	
	}

	public static void main(String[] args) {
		new Test01();
	}

}
