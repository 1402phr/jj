package thread;

public class CodingThread extends Thread {
	/*
	  하나의 프로그램을 이용하여 여러번 실행할 경우, 이것을 구분할 필요가 있다
	  	구분방법 )
	  		1. 변수 하나를 만들고 그 변수에 다른 값을 입력하여 구분하는 방법
	  		2. 스레드 자체에 이름을 부여하는 방법
	  		   이때는 상위 클래스인 Thread의 생성자 중, Thread(String name)을 이용하면 된다
	  		   즉, 상위 클래스의 기본생성자가 아닌 다른 생성자를 이용하면 스레드에 이름을 부여할 수 있다
	  		   		> super() : 상위 클래스의 생성자를 강제 호출
	  		   			1. 반드시 생성자 안에서만 사용 가능
	  		   			2. 반드시 생성자의 첫줄, 첫문장에서만 사용 가능
	 */
	
	public CodingThread() {}
	public CodingThread(String name) {
		super(name); 	// new 시킬때 입력되는 이름으로 스레드 이름을 붙일 것이다
	}
	
	
	public void run() {
	//2번 방법 사용
	// getName()을 이용해서 이름을 알아낼 수 있다
	//지금은 순서를 무시하고 병행처리되어 run이 2번 실행될것이다
	//어떤 스레드가 먼저 실행되는지 알아보자
	//currentThread()로 지금 실행중인 스레드를 알 수 있다
	for(int i = 0 ; i < 1000 ; i++) {
		Thread t = currentThread();
		String name = t.getName();
		
	//출력
	System.out.println((name.equals("독자")? "" : "\t\t)" + name + "씨가 코딩을 합니다"));
	}
	}
}