package day03;

public class Ex02 {
	/*
	 정수 3개를 랜덤하게 발생시켜서 
	 3개의 숫자가 오름차순 정렬로 출력하는 프로그램을 만들라
	 단, 정수의 범위는 개인이 설정하도록 한다
	 */

	public static void main(String[] args) {
		//1. 정수 3개를 랜덤하게 발생시킴
		int no1 = (int)(Math.random() * 50);
		int no2 = (int)(Math.random() * 50);
		int no3 = (int)(Math.random() * 50);
		/*
		//2. 위에서 나온 정수를 오름차순으로 정렬시킨다
		int max = no1 > no2 ? no1 : ((no2>no3)? no2 : no3);
		int mid = no1 > no2 ? 								
		int min = no1 > no2 ? 
		//int mid = 
		//3. 출력한다
		System.out.println("no1 : " + no1 + "\nno2 : " + no2 + "\nno3 : " + no3 + "\nmax : " + max + "\nmid : " + mid + "\nmin 
		*/
		
		//2. 결과출력용 변수를 만든다
		int min, mid, max;
		min = mid = max = 0;
		
		//3. 순서를 검사해서 변수에 담는다
		if( no1 > no2 ) { //no1이  no2보다 큰 경우, 
			if(no1 > no3) {
				//이 부분을 실행할 경우는 이미 no1이 no2보다 크다는 것을 확인했고 
				//이 블럭에서는 no3보다도 no1이 크다고 나오므로 가장 큰 수는 no1
				max = no1;
				if( no2 > no3 ) {
					mid =no2;
				} else {
					min = no3;
				}				
			} else { //no1은 no2보다 크고 no3보다 작으므로 
				max = no3;
				mid = no1;
				min = no2;
			}
		}else {//no1이 no2보다 작은 경우
			max = no2;
			mid = no1;
			min = no3;
		}else { 
			if( no2 > no3 ) {
				max = no2;
				mid = no3;
				min = no1;
			}else {
				max = no3;
				mid = no2;
				min = no1;
			}
		}
		
	//4. 결과를 출력
	System.out.println("랜덤하게 발생한 세 수는 " + no1 + ", " + no2 + ", " + no3 + "이며 오름차순 정렬하면 " + min + mid + max + "이다.");
	}
