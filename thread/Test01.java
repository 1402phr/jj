package thread;


/*
  스레드 프로그램을 실행하라
 */

public class Test01 {

	public Test01() {
		/*
		 	1. 스레드 프로그램은 반드시 new born 상태로 만들어야 한다
		 	   new born 상태란, 실행가능한 프로그램을 만든다는 의미 > new 시킨다는 뜻
		 */
		//2개의 스레드 프로그램이 new born 상태가 되었다
		MyThread01 t1 = new MyThread01();
		MyThread02 t2 = new MyThread02();
	
		//스레드 프로그램이 실행되려면 반드시 러너블 상태로 전위시켜야한다 = start() 호출
		t1.start();
		t2.start();
		
		//실행시키면 t1과 t2가 운영체제가 정한 우선순위에 따라 실행됨(1이라고 먼저 실행되지 않음)
	}

	public static void main(String[] args) {
		new Test01();
		System.out.println("프로그램 종료");
	}

}
