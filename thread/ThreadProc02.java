package thread;

public class ThreadProc02 implements Runnable {

	@Override
	public void run() {
		for(int i = 0 ; i < 1000 ; i++) {
			System.out.println("\t★타루가 춤을 춥니다★");
		}
	}

}
