package day08;

import javax.swing.*;

public class Test01 {
	public Test01(){
		abc();
		xyz();
	}
	
	void abc() {
		String sno = JOptionPane.showInputDialog("정수를 입력하세요");
		try {
			int no = Integer.parseInt(sno);		// (1)
			System.out.println("입력된 정수는" + "이고 그 제곱은 " + (no * no) + " 입니다."); 		// (2)
			} 
				//catch(Exception e) {}		넓은 범위의 예외변수클래스를 먼저 쓰면 오류
				catch(NumberFormatException e) {
//				System.out.println("*****선생님 도와주세요*****");  // (3) 
				System.out.println(e);		//오류출력
				e.printStackTrace();
//				return;
			} catch(Exception e) {
				System.out.println(e);
			}
			finally {
				System.out.println("######숙제끝#####");		// (4)
			}
		
		System.out.println("시스템종료");		// (5)
	}

	
	void xyz() throws NumberFormatException {
		String sno = JOptionPane.showInputDialog("정수를 입력하세요");
		int no = Integer.parseInt(sno);
		System.out.println("입력된 정수는" + "이고 그 제곱은 " + (no * no) + " 입니다."); 
		System.out.println("######숙제끝#####");
		System.out.println("시스템종료");
	}
			
		
		
	
//	오류발생시 실행순서 : (1) > (3) > (4) > 함수실행종료
//						: (3)에 return이 있어도 finally는 오류발생여부에 관계없이 마지막에 *무조건* 실행되는 함수임
	
	public static void main(String[] args) {
		new Test01();

	}

}
