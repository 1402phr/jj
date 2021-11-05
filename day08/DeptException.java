package day08;
/*
  이 클래스는 superclass가 Exception임
  브라우저 눌러서 익셉션 검색하고 바꿀것
 */

public class DeptException extends Exception {
	public String toString() {
		return "없는 부서번호가 입력되었습니다";
				
		}
 }
