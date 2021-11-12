package thread;

public class Test03 {

	public Test03() {
		//new born 시키기
		CodingThread t1 = new CodingThread("독자");	
		CodingThread t2 = new CodingThread("중혁");
		
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test03();
	}

}
