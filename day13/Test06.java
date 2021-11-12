package day13;

/*
  스레드 2개가 동일한 변수 num에 접근하면 어떻게 되나요
 */
public class Test06 {
	int num;
	public Test06() {
		//아래 두 클래스를 뉴본
		SyncTest01 s1 = new SyncTest01(this);
		SyncTest02 s2 = new SyncTest02(this);
		
		//러너블 전위
		s1.start();
		s2.start();
		
	}

	public static void main(String[] args) {
		new Test06();
	}

}

class SyncTest01 extends Thread{
	Test06 main;
	public SyncTest01() {}
	public SyncTest01(Test06 main) {
		this.main = main;
	}
	@Override
	public void run() {
		for(int i = 0 ; i < 1000 ; i++) {
			int no = (int)(Math.random()*101);
			main.num = no;
			System.out.println(main.num + "을 기억했습니다");
		}
	}
	
}

class SyncTest02 extends Thread{
	Test06 main;
	public SyncTest02() {}
	public SyncTest02(Test06 main) {
		this.main = main;
	}
	@Override
	public void run() {
		for(int i = 0 ; i < 1000 ; i++) {
			int no = main.num;
			System.out.println("\t\t" + no + "를 읽었습니다");
		}
	}
	
}
	