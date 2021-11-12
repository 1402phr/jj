package thread;

public class Test05 {

	public Test05() {
		//뉴본상태
		YieldThread01 t1 = new YieldThread01();
		YieldThread02 t2 = new YieldThread02();
	
		//러너블 전위
		t1.start();
		t2.start();
		
	}

	public static void main(String[] args) {
		new Test05();		
	}

}
