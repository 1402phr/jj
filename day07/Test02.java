package day07;


import day06.*;
public class Test02 {

	public static void main(String[] args) {
		Sagak s1 = new Sagak(10, 5);
		Won w1 = new Won(7);
		
		String msg = (s1 instanceof Shap) ? "Shap 타입입니다." : "Shap 타입이 아닙니다.";
		String msg1 = (w1 instanceof Shap) ? "Shap 타입입니다." : "Shap 타입이 아닙니다.";
//		String msg2 = (w1 instanceof Sagak) ? "Shap 타입입니다." : "Shap 타입이 아닙니다.";  > 원 클래스와 사각 클래스느 형제관계라 이런건 못씀
		
		System.out.println("s1은 " + msg);

	}

}
