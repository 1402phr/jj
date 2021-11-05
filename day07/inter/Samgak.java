package day07.inter;

public class Samgak implements Figure {
	//변수지정
	public int mit, nop;
	public double area;
	
	//생성자함수
	public Samgak() {}
	public Samgak(int mit, int nop) {
		this.mit = mit;
		this.nop = nop;
		setArea();
	}
	public void setArea() {
		area = mit * nop * 0.5;
	}
	
	@Override
	public void toPrint() {
		System.out.printf("삼각형		- 가로 : %d, 세로 : %d, 면적 : %f\n", mit, nop, area);
	}	


}
