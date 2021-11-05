package day02;

public class Ex02 {
	/*
	 54232원을 지불하려고 한다
	 우리나라 화폐단위별로 몇개씩 필요한지 계산해서 출력하시오
	 
	 화폐단위 ]
	 50000
	 10000
	 5000
	 1000
	 500
	 100
	 50
	 10
	 1
	 */
	public static void main(String[] args) {
		//작업순서
		//1. 5만원권 몇장?
		
		int no50000 = (int)(54232 / 50000);
		
		//2. 1만원권 몇장?
		
		int no10000 = (int)(54232 / 10000);
		
		//3. 5000원권 몇장?
		int no5000 = (int)(54232 / 5000);
		
		//4. 1000원권 몇장?
		int no1000 = (int)(54232 / 1000);
		
		//5. 500원 동전 몇개?
		int no500 = (int)(54232 / 500);
		
		//6. 100원 동전 몇개?
		int no100 = (int)(54232 / 100);
		
		//7. 50원 동전 몇개?
		int no50 = (int)(54232 / 50);
		
		//8. 10원 동전 몇개?
		int no10 = (int)(54232 / 10);
		
		//9. 1원 동전 몇개?
		int no1 = (int)(54232 / 1);
		
		//10. 출력할까..?
		System.out.println("54232원을 화폐단위별로 몇 장씩 필요한지 계산");
		System.out.println("5만원권은 " + no50000 + "장 필요하다");
		System.out.println("1만원권은 " + no10000 + "장 필요하다");
		System.out.println("5천원권은 " + no5000 + "장 필요하다");
		System.out.println("1천원권은 " + no1000 + "장 필요하다");
		System.out.println("5백원 동전은 " + no500 + "개 필요하다");
		System.out.println("1백원 동전은 " + no100 + "개 필요하다");
		System.out.println("5십원 동전은 " + no50 + "개 필요하다");
		System.out.println("1십원 동전은 " + no10 + "개 필요하다");
		System.out.println("1원 동전은 " + no1 + "개 필요하다");
	}
}
