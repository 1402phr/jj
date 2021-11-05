package day06;
/*
 학생의 java, db, js, jsp, spring 과목을 관리할 클래스(Stud)를 제작하세요.
총점과 평균도 원하면 볼 수 있어야 합니다.
 */

public class Stud {
	/*
	int studno, java, db, js, jsp, spring, total;
	double avg;
	String name;
	
	public Stud(int no) {studno = no;};
	
	void setData(int no, int j, int d, int script, int jp, int sp) {
		studno = no; java = j; db = d; js = script; jsp = jp; spring = sp;}

	void setTotal() {
		
	}
	*/
	public static String ex; 
	private int studno, java, db, js, jsp, spring, total;
	private double avg;
	private String name;
	private int sukcha = 1; //석차는 1부터 시작하니까 1로 지정. 다음 순위는 +1하면 되니까
	
	public Stud() {}
	//생성자 오버로딩
	public Stud(String name) {
	/*
	 this : 현재 실행중인 객체 자기 자신을 가리키는 예약어
	 */
		this.name = name;
	}
	public Stud(String name, int studno) {
		this.name = name;
		this.studno = studno;
	}
	
	public Stud(String name, int studno, int java, int db, int js, int jsp, int spring) {
		this(name, studno); //this 함수는 생성자 함수의 첫줄 첫 문장이어야한다
		this.java = java;
		this.db = db;
		this.js =js;
		this.jsp = jsp;
		this.spring = spring;
		setTotal();
		setAvg();
	}
	
	public void setTotal() {
		total = java + db + js + jsp + spring;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	public void setAvg() {
		avg = total / 5.0;
	}
	
	public void setSukcha(int s) {
		this.sukcha = s;
	}
	
	//출력함수 
	public void toPrint() {
		System.out.printf("[ %2d ]  %8s - %3d, %3d, %3d, %3d, %3d, %3d, %4.2f\n", studno, name, java, db, js, jsp, spring, total, avg);
	}
}

