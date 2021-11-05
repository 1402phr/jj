package day02;

public class H02 {
	/*
	1 ~ 99 사이의 숫자를 2개 랜덤하게 발생시켜서
	그 숫자의 최대공약수를 구하는 프로그램을 작성하세요.
	
	최소공배수를 구하는 프로그램을 작성하세요.
 */
	public static void main(String[] args) {
		//작업순서
		//1. 숫자를 만들고
		int no1 = (int)(Math.random() * 98 ) + 1;
		int no2 = (int)(Math.random() * 98 ) + 1;
		
		int min = no1 < no2 ? no1 : no2 ;
		int max = min == no1 ? no2 : no1 ;
		
		int result = min;
		
		//2. 두 수 를 비교해서 작은 수를 찾는다
		for(int i = min; i > 1 ; i--) {
			//나누어지는지 검사한다
			if(min % i == 0 && max % i == 0 ) {
				result = i;
			//처음에 발생하는 이 숫자가 최대공약수이므로 다시 찾을 필요없음
				//따라서 반복문은 즉시 종료됨
				break;
				
			}
		}
		//4. 결과 출력
		System.out.println("랜덤하게 발생한 두 수" + min + ", " + max + " 의 최대 공약수는 " + result + "입니다. ");
				
	}

}
