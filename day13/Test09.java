package day13;
/*
 arraylist 하나를 준비해서 이곳에 데이터를 넣고 빼는 작업을 할 예정이다
 1번 스레드는 데이터를 입력하고 2번 스레드는 가지고 간다
 
 규칙 : 5개의 데이터가 입력되면 입력을 멈춰야한다
 */
import java.util.*;
public class Test09 {

	ArrayList<Integer> list = new ArrayList<Integer>();
	public Test09() {
		Thr0901 t1 = new Thr0901(this);
		Thr0902 t2 = new Thr0902(this);
		
		t1.start();
		t2.start();
	}
	//데이터를 입력하는 함수
	synchronized void makeCookie(int num) {
		if(list.size() == 5) {
			//5개가 입력되면 멈춰야한다
			try {
				System.out.println("유진군, 계속 먹으면 현제가 도련님께 혼난다네");
				wait();
			}catch(Exception e) {}
		}
	//데이터를 하나 추가
		list.add(num);
		System.out.println(num + "개 과자를 넣어두었으니 몰래 먹게");
		System.out.println("엑, 이 인간" + num + "개나 넣어놨잖아? 준걸 버릴 수 도 없고.. ㅎ.....");
		
	//이제 숫자를 꺼내도 된다
		notify();	//가장 먼저 블럭되었던 스레드가 작업을 재진행
	}
	
	//데이터를 꺼내는 함수
	synchronized void getCookie() {
		if(list.size() == 0) {
			//이 경우 꺼낼 데이터가 없으므로 작업을 해서는 안됨 > 스스로 블럭
			try {
				System.out.println();
				wait();
			}catch(Exception e) {}
		}
		//사용할 데이터를 꺼낸다
		int no = list.get(0);
		
		//꺼낸 데이터는 삭제한다 > 먹으면 사라짐
		list.remove(0);
		System.out.println("\t아, " + no + "번째 과자 맛있네");
		System.out.println("\t" + list.size() + "개 남기고 다 먹었군, 현제 뿌듯하다네^^");
		
		//이제 list에는 최소한 데이터를 작업할 공간 하나는 확보가능하다
		//이제 데이터를 채우는 작업을 재개해도됨
		notify();
	}
	public static void main(String[] args) {
		new Test09();
	}

}

class Thr0901 extends Thread {
	Test09 main;
	public Thr0901() {}
	public Thr0901(Test09 main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 50 ; i++) {
			int no = (int)(Math.random()*101);
			main.makeCookie(no);
			
			int sec = (int)(Math.random()*1501 + 500);
			try {
				Thread.sleep(sec);

			}catch(Exception e) {}
		}
		}
	}

class Thr0902 extends Thread {
	Test09 main;
	public Thr0902() {}
	public Thr0902(Test09 main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 50 ; i++) {
			int no = (int)(Math.random()*101);
			main.getCookie();
			
			int sec = (int)(Math.random()*1501 + 500);
			try {
				Thread.sleep(sec);

			}catch(Exception e) {}
		}
	}
}