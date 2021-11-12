package thread;

public class MyThread02 extends Thread {
	//이 스레드에서는 타루가 1000곡을 부른다
	public void run() {
		for(int i = 0 ; i < 1000 ; i++) {
			System.out.println("\t타루가 < " + ( i + 1) + " > 번째 곡을 부릅니다☆");
		}
	}
}
