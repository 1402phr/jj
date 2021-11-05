package day06;

public class Student {
	/*
	  이 클래스는 학생 한명의 데이터를 기억할 용도의 클래스
	  이런 클래스를 VO(Value Object) 클래스라고 부른다
	  = DTO(Data Transfer Object) 클래스
	  
	  여기서는 생성자 함수 따로 안만듦
	 */
	private int studno, java, db, js, jsp, spring, total;
	private double avg;
	private String name;
	public int getStudno() {
		return studno;
	}
	public void setStudno(int studno) {
		this.studno = studno;
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
	public int getJs() {
		return js;
	}
	public void setJs(int js) {
		this.js = js;
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
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 private는 다른 데서 못쓰므로 get함수 또는 set함수를 만들어야한다
	 왼쪽 상단 source - generate getters and setters
	 */

}
