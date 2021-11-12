package day13;

//이 클래스는 Test05에 대한 스레드 프로그램 클래스로 3초마다 랜덤하게 컬러를 만들어서 
//Test05의 멤버 pan에 적용시키는 작업을 한다

import java.awt.*;
import javax.swing.*;
public class ColorThr extends Thread {

	Test05 main;
	private boolean isStart = true;
	private boolean bool = false;
	
	public ColorThr() {}
	public ColorThr(Test05 main) {
		this.main = main;
	}

	public void run() {
		while(isStart) {	// 무한반복
			//만약 필요에 의해 이 함수의 실행을 종료해야한다면 
			//stop대신 isStart 변수 데이터를 변경해서 
			//자연스러운 종료를 유도한다
			
			//이 명령을 반복해도 괜찮은지 먼저 확인하도록 처리
			if(bool) { //이경우는 색변경을 멈춤
//				this.suspend();
			}else {
			int red = (int)(Math.random()*256);
			int green = (int)(Math.random()*256);
			int blue = (int)(Math.random()*256);
			Color tmp = new Color(red, green, blue);
			main.pan.setBackground(tmp);
			}
			//1초마다 색변경
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
	}
		
	public boolean isStart() {
		return isStart;
	}
	public void setStart(boolean isStart) {
		this.isStart = isStart;
	}
	public Test05 getMain() {
		return main;
	}
	public void setMain(Test05 main) {
		this.main = main;
	}
	public boolean isBool() {
		return bool;
	}
	public void setBool(boolean bool) {
		this.bool = bool;
	}
	
}
