package day05;

public class Test01 {
	/*
	 정수를 입력하면 정수를 문자열로 변환시켜서 반환해주는 함수를 만들어서 실행하라
	 단, 함수 이름은 add로 한다
	 */
	
	/*
	 	함수를 제작하는 위치는 클래스블럭 하위이기만 하면 된다(위치 상관x)
	 	함수는 반드시 클래스블럭 하위에 위치해야한다 > 위치는 상관없지만 함수 안에서는 함수못만듦
	 	생성자함수는 클래스 이름을 그대로 사용
	 */
	public Test01() {	//생성자를 정의 . 클래스인 Test01을 개체화시킴 	
		add(123);		//함수 정상 실행됨. 그저 반환값을 사용하지않을 뿐
		String str = add(123);
		System.out.println(add(123));
		
	}
	String add(int no) {
		String str = no + "";	//숫자+문자 = 문자..
		return str;
		//위에 2줄을 1줄로 > return no + "";
	}

	public static void main(String[] args) {
		new Test01();		//위에 생성자 정의를 안해도 오류는 안남(자바가 자동으로 개체화 시킴. 
	}						//단, add(123); String str = add(123); System.out.println(add(123)); 만큼의 내용은 적용 안됨

}
