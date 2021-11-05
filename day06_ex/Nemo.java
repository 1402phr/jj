package day06_ex;

public class Nemo extends Figure{
	private int garo, sero;
	private double area;
	
	//생성자
	public Nemo() {}
	public Nemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
	}
	
	public double getArea() {
		area = garo * sero;
		return area;
	}
	
	public void toPrint() {
		System.out.printf("네모		- 가로 : %d, 세로 : %d, 면적 : %d\n", garo, sero, area);
	}
		

}
