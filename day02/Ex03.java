package day02;

public class Ex03 {
		/*
		 1년은 365.2426일이다
		 이 시간은 며칠, 몇시간, 몇분, 몇초인지를 계산해서 출력하는 프로그램을 작성하라
		 
		단, 0.5일은 12시간이다 > double을 제외하고는 2번과 같은 문제임
		 */
	//작업순서
	//1. 365.2426일은 며칠이지?
	//int nod = (int)(365.2426 / 1 );
	
	//2. 365.2426일은 몇시간이지? + 소수점 밑을 시간단위로 바꿔주기 + 0.5가 12시간임을 가지고서 하면 됨
	
	//int h = (int)(365.2426 * 24);
	//int noh = (int)(365.2426 / h);
	
	//3. 365.2426일은 몇분이지?
	//int nom = 
	
	//4. 365.2426일은 몇초지?
			
	//5. 출력하시오
	public static void main(String[] args) {
		double data = 365.2426;
		int year = (int)data;
		int tmp = (int)((data - year) * 24 * 3600);
		int hour = tmp / 3600;
		tmp %=3600; //  => tmp = tmp % 3600; 
		int min = tmp / 60;
		tmp %=60;
		int sec = tmp;
	}
}
