package day07.abst;

public class Won extends Figure {
	//변수설정
	public int rad;
	public double arround, area;
	
	//생성자함수
	public Won() {}
	public Won(int rad) {
		this.rad = rad;
		setArea();
		setArround();
	}
	public void setArround() {
		arround = rad * 2 * 3.14;
	}
	public void setArea() {
		area = rad * rad * 3.14;
	}

	@Override
	public void toPrint() {
		System.out.printf("원		- 반지름 : %d, 둘레 : %f, 면적 : %f\n", rad, arround, area);
	}

}
