package day02; //여기 만원권 값이 이상해.. 0장 나와야하는데 5장나옴.....

public class Ex02_a {
	public static void main(String[] args) {
		int total = 54232;
		int oman = total / 50000;
		int tmp = total % 50000;
		int man = total / 10000;
		tmp %= 10000;
		int ochun = tmp / 5000;
		tmp %= 5000;
	    int chun = tmp / 1000;
	    tmp %= 1000;
	    int obaek = tmp / 500;
	    tmp %= 500;
	    int baek = tmp / 100;
	    tmp %= 100;
	    int osip = tmp / 50;
	    tmp %= 50;
	    int sip = tmp / 10;
	    int il = tmp % 10;
	    
	    System.out.println("지불할 금액 " + total + "에 필요한 지폐는");
	    System.out.println("\t오만원권 " + oman + " 장");
	    System.out.println("\t만원권" + man + " 장");
	    System.out.println("\t오천원권" + ochun + " 장");
	    System.out.println("\t천원권" + chun + " 장");
	    System.out.println("\t오백원권 " + obaek + " 장" );
	    System.out.println("\t백원권 " + baek + " 장" );
	    System.out.println("\t오십원권 " + osip + " 장" );
	    System.out.println("\t십원권 " + sip + " 장" );
	    System.out.println("\t일원권 " + il + " 장" );
	    
	    /* > 아래처럼 하면 줄까지 맞춰서 나옴
	    System.out.printf("지불할 금액 %6d 에 필요한 지폐는", total);
	    System.out.printf("\t%-10s %2d 장\n", "오만원권", oman);
	    System.out.printf("\t%-11s %2d 장\n", "만원권", man);
	    System.out.printf("\t%-10s %2d 장\n", "오천원권", ochun);
	    System.out.printf("\t%-11s %2d 장\n", "천원권", chun);
	    System.out.printf("\t%-10s %2d 장\n", "오백원권", obaek);
	    System.out.printf("\t%-11s %2d 장\n", "백원권", baek );
	    System.out.printf("\t%-10s %2d 장\n", "오십원권", osip);
	    System.out.printf("\t%-11s %2d 장\n", "십원권", baek);
	    System.out.printf("\t%-11s %2d 장\n", "일원권", il);	    
	     */
	    
	}

}
