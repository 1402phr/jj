package thread;

public class test04 {

	public test04() {
		Coding02 tmp = new Coding02();
		//이것은 아직 스레드가 아님
		
		//다시 스레드를 강제로 만들기
		Thread t1 = new Thread(tmp, "독자");
		Thread t2 = new Thread(tmp, "상아");
		
		//러너블 전위
		t1.start();
		t2.start();
		
		
	}

	public static void main(String[] args) {

	}

}
