package day13;

//ColorThr에 접근해서 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorEvt implements ActionListener {
	Test05 main;
	ColorThr t;
	public ColorEvt() {}
	public ColorEvt(Test05 main) {
		this.main = main;
		this.t = main.colorTrd;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		boolean tmp = t.isBool();
//		System.out.println(tmp);
		t.setBool(!t.isBool());
//		if(tmp) {
//			t.setBool(false);
//		} else {
//			t.setBool(true);
//		}
	}

}
