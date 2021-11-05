package day07;

public class Test05 {
	public static class TopClass {		//여기가 static이어야함
		public static void toPrint() {		//여기도 static이어야함
			System.out.println("여기는 내부 클래스");
		}
	}
	public static void main(String[] args) {
		Test05.TopClass.toPrint();
		
	}

}
