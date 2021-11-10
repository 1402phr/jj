package day12;

/*
  친구 정보를 파일로 저장해보자
  단, Member 클래스를 이용할 것
 */

import java.io.*;

import javax.swing.JOptionPane;
public class Test07 {

	public Test07() {
		//스트림 준비
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		
		try {
			//스트림 연결
			fout = new FileOutputStream("C:/Users/user/git/456/456/kingdom_me/src/day12/jenny.txt");
			oout = new ObjectOutputStream(fout);
			
			//데이터 준비
			Member jenny = new Member("제니", "jenny", "12345", "010-1111-1111", "jenny@cnu.ac.kr", 26, 165.5);	
//데이터가 채워졌는지 확인 System.out.println(jenny);
			//데이터를 쓴다 > jenny.txt 파일이 만들어지지만 보면 깨짐 > ObjectInputStream으로 읽어야함
			oout.writeObject(jenny);
			/*
			 이처럼 클래스 전체를 입출력하는 행위를 직렬화라고 한다
			 이때 사용되는 클래스는 직렬화 가능한 클래스여야한다(Serializable 인터페이스를 구현한 클래스)
			 */
			
			JOptionPane.showMessageDialog(null, "친구추가완료");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oout.close();
				fout.close();
			}catch(Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}
