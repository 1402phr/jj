package day04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test03 {
	/*
	 heap 영역
	 	특징 
	 		1. 반드시 주소를 알아야 사용할 수 있다
	 		2. 8가지 영역중에서 크기가 가장 크고 확장도 가능하다(자바가 객체지향언어이기 때문)
	 		   부족한 경우, 스스로 다른 영역을 빼앗아서 heap영역으로 사용할 수 있다
	 		   자바는 많은 양의 데이터가 필요하다면 그것을 heap에 기억하도록 되어있다(메모리가 넉넉하면 heap먼저 만든다)
	 		3. 원칙적으로 한번 만들어지면 그 프로그램이 종료될때까지 없어지지 않는다 
	 		   대신 가비지 컬렉터가 heap용량을 조절해줌..
	 		4. heap영역에 만들어지는 변수는 자동초기화 된다
	 */
	
	/*
	  Q. 5개의 숫자를 입력받아서 해당숫자만큼 문자데이터를 기억할 수 있는 배열을 만들고 
	  	 배열에 랜덤하게 해당 개수만큼 문자를 만들어서 기억시키고 출력하세요
	  	 
	  Q. 숫자를 입력받아서 해당숫자만큼 문자데이터를 기억할 수 있는 배열을 만들고 
	  	 배열에 랜덤하게 해당 개수만큼 문자를 만들어서 기억시키고 출력하세요	 
	 */

	public static void main(String[] args) {
		/*1. 숫자 5개를 입력받는다
		String sno = JOptionPane.showInputDialog("숫자 5개를 입력하세요!");
		int dNo = Integer.parseInt(sno);

		//2. 입력받은 숫자를 기억할 배열을 만든다
		int[] noArray = new int[5];
		*/
		
		//1. 
		char[] chArray = new char[5];
		for(i = 0 ; i < 5 ; i++) {
			chArr[i] = [cnt];
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열개수 : ");
		int cnt = sc.nextInt();
		sc.close();
		
		char[] chArr = new char[cnt];
		
		for(i = 0 ; i < cnt ; i++) {
			chArr[i] = (char)(Math.random())
		}
	}

}
