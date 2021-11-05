package day07.abst;

public class Sagak extends Figure {
	//변수 설정
	public int garo, sero, area;
	
	//생성자
	public Sagak() {}
	public Sagak(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();	
	}
	public void setArea() {
		area = garo * sero;
	}
	@Override
	public void toPrint() {
		System.out.printf("사각형		- 가로 : %d, 세로 : %d, 면적 : %d\n", garo, sero, area);
	}


}
