package day06;

public class Won extends Shap {
	private int rad;
	private double arround, area;
	
	public Won() {}
	public Won(int rad) {
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
		System.out.println("원");
	}
}
