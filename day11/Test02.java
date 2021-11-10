package day11;

/*
 	 키보드를 이용하여 문자를 입력받아보자

 	 
 	 키보드 역시 자주 사용하는 외부장치이기 때문에 이미 스트림을 준비한 변수가 존재한다
 	 그 변수가 System.in 이다
 	 
 */

import java.io.*;
import java.util.*; 	//배열기능도 이거 임포트 (java.util.arrays;)
public class Test02 {

	public Test02() {
		System.out.println("문자열을 입력하세요 : ");
		
		int ch = 0;
		try { 
			/*1. 한글자 읽어오기
			ch = System.in.read();	//read() : 한글자만 읽어오는 함수
			 //1-2. 출력
			char munja = (char) ch;
			System.out.println("입력한 문자 : " + munja);
			System.out.println("반환 데이터 : " + ch);
			*/
			/*2. 여러글자 읽어오기
			//읽은 데이터를 기얽할 변수를 만든다
			byte[] buff = new byte[256];
			//이때 기억시킬 데이터의 개수는 숫자에 따라 변할 것이고 
			//이 숫자의 의미는 한번에 처리할 문자의 개수를 의미한다
			int len = System.in.read(buff);
			//읽은 결과를 문자로 변환하여 출력
			String result = new String(buff, 0 , len);	//String(byte[] bytes, int offset, int length)함수 = int read(byte[] b, int off, int len) 함수
			System.out.println("입력문장 : " + result);
			*/
			//3. 주로 네트워크에서 많이 사용하는 방법
			byte[] buff = new byte[256];
			//3-1. 준비된 배열에 A를 채운다
			Arrays.fill(buff, (byte)'A');	// fill(byte[] a, byte val) : 배열 a를 val로 채우는 함수(java.lang - String)
			//3-2. 데이터를 읽어와 배열에 채운다
			int len = System.in.read(buff, 10, 100);// 배열 buff에 11번째 방부터 읽을 것이고 읽을 데이터의 개수는 최데 100개인데 이 결과를 변수 len에 기억시킴
			String result = new String(buff, 0, len + 10);
			
			//3-3. 출력
			System.out.println("입력한 문장 : " + result);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
