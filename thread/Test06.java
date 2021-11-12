package thread;

import javax.swing.JOptionPane;

public class Test06 {

	public Test06() {
	//객체를 만들어주고 = 일반 클래스를 new 한 것과 같다
		SleepTrd01 tmp1 = new SleepTrd01();
		SleepTrd02 tmp2 = new SleepTrd02();
		
	//스레드로 만들어서
		Thread t1 = new Thread(tmp1);
		Thread t2 = new Thread(tmp2);
		
	//러너블 상태로 전위
	t1.start();
	t2.start();
	
	String str = "";
	while(true) {
		str = JOptionPane.showInputDialog("회차를 입력하세요!");
		if(str.equals("q")) {
			try{
				t1.suspend();
			}catch(Exception e) {}
		} else if(str.equals("x")) {
			break;
		} else {
			t1.resume();
		} 
	}
	JOptionPane.showMessageDialog(null, str);
	}

	public static void main(String[] args) {
		new Test06();
	}

}
