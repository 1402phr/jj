package day06_ex;

public class Semo extends Figure{
	private int mit, nop;
	private double area;
	
	//생성자
		public Semo() {}
		public Semo(int mit, int nop) {
			this.mit = mit;
			this.nop = nop;
			getArea();		//이걸 안해서 세모 면적이 오류난것, 사각, 서클 클래스에도 킽에 이걸 안넣었는데 넣는게 좋겠다..
		}
		
	//overriding
		public double getArea() {
			area = mit * nop * 0.5;
			return area;
		}
	
	//출력함수
		public void toPrint() {
			System.out.printf("세모		- 밑변 : %d, 높이 : %d, 면적 : %f\n", mit, nop, area);
		}

}
