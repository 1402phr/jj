package day02;

import javax.swing.JOptionPane;

public class Ex11_extra {
	/*
	3 ~ 100 사이의 숫자를 입력하면 
	입력받은 숫자가 소수인지 판단하는 프로그램을 작성하세요.
 */

	public static void main(String[] args) {
		//1. 3~100 사이의 숫자를 입력하도록한다
				String sno = JOptionPane.showInputDialog("3~100 사이의 숫자를 입력하세요!");
				int dNo = Integer.parseInt(sno);
				
				/*
				//2. 그 숫자가 소수인지 확인한다(소수 = 약수가 1과 본인밖에 없는 수) > 소인수분해를 한다
				//일단 짝수는 소수가 아님
				if((dNo % 2) == 0) {
					JOptionPane.showMessageDialog (null, "입력한 숫자는 소수가 아닙니다!");
				}
				//3에서 2씩 더한 수(홀수)를 찾기 for(int i = 3 ; i < dNo ; i += 2); > 이게 소수인지 확인
				else { 
					
				}  > 1부터 입력된 숫자(dNo)보다 1작은 수까지 하나씩 가져와서 dNo를 나눠봄 > 나머지있으면 소수/없으면 안소수
				*/
				String str = "소수입니다."; //기본 설정을 소수로 해놓고 if조건으로 소수가 아닌 경우만 걸러냄(이렇게 하면 변수를 덜써도되니 좋음)
				for (int i = 3 ; i < dNo ; i ++) {
					int nam = (dNo % i);
					if(nam == 0) {
						str = "소수가 아닙니다!";
						break;
					} 
				}
				//결과창이 여러번 뜨는 문제 해결 > 반복문에서 창뜨는걸 빼오고 변수를 출력하는 것으로 함
				JOptionPane.showMessageDialog(null, "입력한 숫자는 " + str);
			}

	}

}
