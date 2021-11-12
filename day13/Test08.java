package day13;

public class Test08 {

	public Test08() {
		//아래 스레드 뉴본  > 제형애 + 선생님 스킬 덕분에 손발이 잘맞는구나아... 아아 이것이 함수(스킬)의 동기화..!
		Thr0801 t1 = new Thr0801(this, "유진");
		Thr0802 t2 = new Thr0802(this, "유현");
		
		//러너블
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test08();
	}
	synchronized void abc() {
		//이 함수를 호출한 스레드의 이름을 알아낸다
		String name = Thread.currentThread().getName();
		System.out.println("☆" + name + "☆스레드가☆abc()☆사용시작☆");
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {}
		System.out.println("☆" + name + "☆스레드가☆abc()☆사용종료☆");
	}
	
	synchronized void xyz() {
		//이 함수를 호출한 스레드의 이름을 알아낸다
		String name = Thread.currentThread().getName();
		System.out.println("★" + name + "★스레드가★xyz()★사용시작★");
		
		//원래 이 밑에서 필요한 작업을 하는데 지금은 생략하고 그냥 3초동안 재움
		try {
			Thread.sleep(3000);
		}catch(Exception e) {}
		System.out.println("★" + name + "★스레드가★xyz()★사용종료★");
		}
		
	}


class Thr0801 extends Thread {
	Test08 main;
	public Thr0801() {}
	public Thr0801(Test08 main, String name) {
		super(name);
		this.main = main;
	}
	
	@Override
	public void run() {
		main.abc();
		main.xyz();
	}
}

class Thr0802 extends Thread {
	Test08 main;
	public Thr0802() {}
	public Thr0802(Test08 main, String name) {
		super(name);
		this.main = main;
	}
	
	@Override
	public void run() {
		main.abc();
		main.xyz();
	}
}