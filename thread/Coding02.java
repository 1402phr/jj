package thread;

public class Coding02 implements Runnable {

	public Coding02() {
	}

	@Override
	public void run() {
		for(int i = 0 ; i < 1000 ; i++) {
			String name = Thread.currentThread().getName();
			System.out.println((name.equals("상아")? "": "\t\t") + name + "씨가 스페인어 공부를 합니다");
		}
	}

}
