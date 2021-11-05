package day05;
/*
Ex03 에서 만든 클래스에 사각형 5개를 관리하는 배열을 만들고
데이터를 채워서 출력하세요.
*/

public class Ex05 {

	public static void main(String[] args) {
		//배열만들기
		Sagak[] ssagak = new Sagak[5];
		
		//객체 채워주기
		for(int i = 0 ; i < 5 ; i++) {
			ssagak[i] = new Sagak();
		}
		//가로세로 입력
		for(int i = 0 ; i < ssagak.length ; i++) {
			int g = (int)(Math.random()*21)+5;
			int s = (int)(Math.random()*21)+5;
			ssagak[i].setL(g, s);
		////넓이 계산
			ssagak[i].setW();
			ssagak[i].toPrintsagak();
		}


	}


}

