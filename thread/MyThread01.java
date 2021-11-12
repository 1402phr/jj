package thread;

public class MyThread01 extends Thread{
	//이 클래스 내부에서도 역시 생성자, 함수, 변수 사용이 가능하다
	
	public void run() {
	//이 프로그램에선 코딩을 1000개 만드는 작업을 할 예정이다
	for(int i = 0 ; i < 1000 ; i++) {
		System.out.println("시스템이 [ " + (i + 1) + " 번째] 코딩을 완료하였습니다");
	}
	}
	

}
