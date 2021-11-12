package day13;

import java.util.Calendar;
import java.text.*;
public class TimeThr extends Thread {

	Test05 main;
	private boolean bool, isStart;
	public TimeThr() {}
	public TimeThr(Test05 main) {
		this.main = main;
		isStart = true;
	}
	 
	public void run() {
		while(isStart) {
			if(!bool) {
				//시간 데이터를 문자열로
				Calendar cal = Calendar.getInstance();
				
				//날짜 표시형식 만들기
				SimpleDateFormat form = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
				String sdate = form.format(cal.getTime());
				System.out.println(sdate);
				main.lbl.setText(sdate);
				
				//Test05.lbl의 텍스트를 변경해줌
				
			}
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
		
	}
	public boolean isBool() {
		return bool;
	}
	public void setBool(boolean bool) {
		this.bool = bool;
	}
	public boolean isStart() {
		return isStart;
	}
	public void setStart(boolean isStart) {
		this.isStart = isStart;
	}
	
}