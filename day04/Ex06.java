package day04;

public class Ex06 {
	/*
	반지름, 둘레, 넓이를 기억할 배열을 5개의 데이터를 저장할 크기로 만들고
	반지름을 랜덤하게 5 ~ 25 사이의 숫자로 추출해서 기억시키고
	둘레, 넓이의 배열에 각 반지름에 해당하는 값을 입력하세요.
	그리고 출력하세요.
	단, 반지름은 정수이고 둘레와 넓이는 double타입으로 한다
 */

	public static void main(String[] args) {
		int[] rad = new int[5];
		double[] arround = new double[5];
		double[] area = new double[5];
		
		//반지름을 만들어서 기억
		for(int i = 0 ; i < rad.length ; i++) {
			rad[i] = (int)(Math.random()*21) + 5;
			//arround[i] = 2 * rad[i] * 3.14;
			//area[i] = rad[i] * rad[i] * 3.14;
		}
		
		//둘레
		for(int i = 0 ; i < arround.length ; i++) {
			arround[i] = 2 * rad[i] * 3.14;
		}
		
		//면적
		for(int i = 0 ; i < area.length ; i++) {
			area[i] = rad[i] * rad[i] * 3.14;
		}
		
		//출력
		for(int i = 0 ; i < rad.length ; i++) {
			System.out.printf("%-7s : %2d,  %-7s : %7.2f,  %-7s : %7.2f\n", "radius", rad[i], "arround", arround[i], "area", area[i] );
		}
	}

}
