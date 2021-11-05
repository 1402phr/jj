package day09;
/*
  이 클래스는 정렬기준이 없어서 정렬이 불가능하다
  따라서 TreeSet에는 기억시킬 수 없다
  가능하게 하려면 이 클래스가 서로 비교 가능한 클래스로 만들어져야한다
  그 기능을 하는 인터페이스가 Comparable 이고 이 인터페이스를 구현한 클래스는 비교가능한 클래스가 되어
  정렬가능한 타입으로 변경된다
 */

public class Stud2 implements Comparable{	
	private String name;
	private int java, db, web, jsp, spring, total;
	private double avg;
	
	public Stud2() {}
	public Stud2(String name, int java, int db, int web, int jsp, int spring) {
		this.name = name;
		this.java = java;
		this.db = db;
		this.web = web;
		this.jsp = jsp;
		this.spring = spring;
		getTotal();
		getAvg();
		}
	
	public Stud2(String name, int java, int db, int web, int jsp, int spring, int total, double avg) {
		this(name, java, db, web, jsp, spring);
		this.total = total;
		this.avg = avg;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
	}
	public int getWeb() {
		return web;
	}
	public void setWeb(int web) {
		this.web = web;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	public int getTotal() {
		return total;
	}
	public int getTotal(int total) {
		total = java + db + web + jsp + spring;
		return total;
	}

	public double getAvg() {
		avg = total / 5.0;
		return avg;
	}
	
	public void setAvg(double avg) {
		this.avg = avg;
	}
	@Override
	public int compareTo(Object o) {
		//이 함수가 정렬을 할 때 자동 호출되는 함수
		//할일
		//1. 입력된 데이터를 원래 형태로 강제 형변환
		Stud2 s = (Stud2) o;
		
		//2. 정렬기준이 되는 데이터를 사용해 반환값을 만든다	> 자바 점수로 정렬
		int result = java - s.getJava();
		
		//3. 반환
		return result;
	}

}
