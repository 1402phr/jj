package day07.inter;

public class Ex {

	public static void main(String[] args) {
		//배열생성
		Figure[] figure = new Figure[10];
		
		//랜덤하게 발생하는 숫자(0, 1, 2)
		for(int i = 0 ; i < 10 ; i++) {
		int no = (int)(Math.random()*2);
						
		//0의 경우
		if(no == 0) {figure[i] = new Won((int)(Math.random() * 21) + 5);} 
		//1의 경우
		else if(no == 1) {figure[i] = new Samgak((int)(Math.random() * 21) + 5, (int)(Math.random() * 21) + 5);}
		//2의 경우
		else if(no == 2) {figure[i] = new Sagak((int)(Math.random() * 21) + 5, (int)(Math.random() * 21) + 5);}
				}
		
		for(Figure f : figure) {
			f.toPrint();
		}

	}

}
