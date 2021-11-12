package thread;

public class YieldThread02 extends Thread {
	@Override
	public void run() {
		for(int i = 0 ; i < 1000 ; i++) {
			System.out.println("한수영이 글을 씁니다");
			//밤시간은 tls123에게 양보합시다 > 다른 프로그램에 양보
			//즉, 러너블 상태로 전이
			yield();
		}
	}
	
}