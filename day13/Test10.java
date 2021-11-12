package day13;

public class Test10 {

	public Test10() {
		Thr1001 t1 = new Thr1001();
		Thr1002 t2 = new Thr1002();
		
		t1.start();
		t2.start();
		
		//이제 메인은 t1 스레드가 종료되기 전까지는 실행되지 못하게 하고싶다
		//다른 스레드가 실행중일때, 특정 스레드의 실행을 막는것이 
		// join()	> 둘 사이에 조인하는 송실장님. 몸이 하나라 한번에 한 사람이 낸 사고밖에 수습하지 못한다
		
		try {
			t1.join();
			t2.join();
		/*
		  t1 스레드가 블럭되는 것이 아니고 
		  지금 실행중인 메인 프로세스(스레드 포함)가 중단되는 것
		  	> 지정한 스레드(t1)가 종료될때까지 중단된다
		 */
			
		}catch(Exception e) {}
		System.out.println("......사고진압 완료되었습니다");
	}

	public static void main(String[] args) {
		System.out.println("..무슨 일입니까");
		new Test10();
	}

}

class Thr1001 extends Thread {
	Test10 main;
	public Thr1001() {}
	public Thr1001(Test10 main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("송실장님이 도담 사육소장이 낸 사고를 해결합니다" + (i + 1));
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
	}
}

class Thr1002 extends Thread {
	Test10 main;
	public Thr1002() {}
	public Thr1002(Test10 main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("송실장님이 세성 길드장이 낸 사고를 해결합니다" + (i + 1));
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
	}
}	