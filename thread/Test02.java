package thread;

/*
  러너블 인터페이스를 구현한 스레드 프로그램을 실행시키자
  (ThreadProc01, 02)
 */
public class Test02 {

	public Test02() {
		ThreadProc01 tmp1 = new ThreadProc01();	
		ThreadProc02 tmp2 = new ThreadProc02();	
		//아직 new born 상태가 아님
		
		//new born 상태로 만들기
		Thread t1 = new Thread(tmp1);
		Thread t2 = new Thread(tmp2);
		//이제 new born 상태임
		
		//러너블 시키기
		t1.start();
		t2.start();
		
	}

	public static void main(String[] args) {
		new Test02();
	}

}
