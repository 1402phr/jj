package day10;

public class Semo implements Figure {
	private int mit, nop;
	private double area;


	public Semo() {
		
	}

	public Semo(int mit, int nop) {
		this.mit = mit;
		this.nop = nop;
		setArea();
	}

	public int getMit() {
		return mit;
	}

	public void setMit(int mit) {
		this.mit = mit;
	}

	public int getNop() {
		return nop;
	}

	public void setNop(int nop) {
		this.nop = nop;
	}

	public void setArea(double area) {
		this.area = area;
	}
	public void setArea() {
		area = mit * nop * 0.5;
	}

	@Override
	public double getArea() {
		return area;
	}
	

}
