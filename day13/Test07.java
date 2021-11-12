package day13;

public class Test07 {
	int[] num = new int[5];
	
	public Test07() {
		Mthr07_01 t1 = new Mthr07_01(this);
		Mthr07_02 t2 = new Mthr07_02(this);
		
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test07();
	}

}

class Mthr07_01 extends Thread {
	Test07 main;
	public Mthr07_01() {}
	public Mthr07_01(Test07 main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		/*
		  이 스레드는 배열변수에 데이터를 기억시키는 역할이다
		  이 스레드가 5개의 데이터를 완성하기 전까지는 
		  다른 스레드의 접근을 막을 것이다 (= 타 스레드의 배열 사용을 막을 것이다)
		 */
	System.out.println("☆☆☆☆☆데이터☆기억☆시작☆☆☆☆☆");
	
	synchronized(main.num){
		for(int i = 0 ; i < 5 ; i++) {
			int no = (int)(Math.random()*101);
			main.num[i] = no;
			System.out.println("☆☆☆☆☆" + no + "를☆기억했습니다☆☆☆☆☆");
			
			//쉬는 시간을 0.5~2초 사이로 랜덤 설정
			int sec = (int)(Math.random()*(2000-500+1)+500);
			try {
				Thread.sleep(sec);
			}catch(Exception e) {}
		}
		System.out.println("☆☆☆☆☆데이터☆저장☆완료☆☆☆☆☆");
	}
	}
}

//Test07의 데이터를 읽어오는 스레드
class Mthr07_02 extends Thread {
	Test07 main;
	public Mthr07_02() {}
	public Mthr07_02(Test07 main) {
		this.main = main;
	}
	@Override
	public void run() {
		/*
		 이 스레드는 배열변수의 데이터를 꺼내서 사용하느 역할이다
		 */
		System.out.println("\t★★★★★데이터★읽기★시작★★★★★");
		
		synchronized(main.num){
			for(int i = 0 ; i < 5 ; i++) {
				//데이터 꺼내오기
				int no = main.num[i];
				
				//출력
				System.out.println("★★★★★\t" + no + "를★읽었습니다★★★★★");
				
				//쉬는 시간을 0.5~2초 사이로 랜덤 설정
				int sec = (int)(Math.random()*(2000-500+1)+500);
				try {
					Thread.sleep(sec);
				}catch(Exception e) {}
			}
			System.out.println("☆☆☆☆☆데이터☆저장☆완료☆☆☆☆☆");
			}
		}
}
