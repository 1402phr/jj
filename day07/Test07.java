package day07;

public class Test07 {
	
	public Test07() {
		toPrint("우지윤", "안지영");
		toPrint("제니", "로제", "리사", "지수");
		//여기에 배열넣어도 무방함
	}

	public static void main(String[] args) {
		new Test07();
	}
	
	public void toPrint(String ... name) {
		//이때 name변수는 자동적으로 배열변수가 된다
		
		for(String s : name) {
			System.out.println(s);
		}
	}
}
