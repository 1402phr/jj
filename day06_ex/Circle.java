package day06_ex;

public class Circle extends Figure {
	private int rad;
	private double arround, area;
	
	public Circle() {}
	public Circle(int rad) {
		this.rad = rad;
		setArround();
		getArea();
	}
		
	//함수 추가
	public void setArround() {
		arround = 2 * rad * 3.14;
	}
	
	//overriding
	public double getArea() {
		area = rad * rad * 3.14;
		return area;
		
	}
	
	public void toPrint() {
		System.out.printf("원		- 반지름 : %d, 둘레 : %f, 면적 : %f\n", rad, arround, area);
	}
}


