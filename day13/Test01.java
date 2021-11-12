package day13;

import java.text.MessageFormat;

/*
  MessageFormat 예제
 */

public class Test01 {

	public Test01() {
		String msg = "Name: {0}\nTel: {1}\nAge: {2}\nBirth: {3}";
		//{}안에 번호가 바뀌면 바뀐 숫자대로 아래 배열의 순서에 맞춰 들어감
		
		//배열만들기
		Object[] args = {"제니", "010-1111-1111", 26, "1996-11-10"};
		String result = MessageFormat.format(msg, args);
		
		//출력
		System.out.println(result);
	}

	public static void main(String[] args) {
		new Test01();
	}

}
