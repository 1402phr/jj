package day05;
/*
학생의 java, db, js, jsp, spring 과목을 관리할 클래스를 제작하세요.
총점과 평균도 원하면 볼 수 있어야 합니다.

5명의 학생들의 점수를 관리할 배열을 만들고
정보를 출력해주세요.

학생번호도 입력하게 해서
학생번호를 입력하면 배열에서 해당학생의 정보를 꺼내서 보여주는 프로그램을 작성하세요.
*/

public class Ex07 {
	int stdno, java, db, js, jsp, spring, total;	//0으로 초기화
	double avg;		//0.0으로 초기화
	String name;	//null로 초기화
	
	public Ex07() {}
	//생성자 오버로딩
	public Ex07(String irum) {name = irum;}
	public Ex07(String irum, int no) {name = irum; stdno = no;}
	public Ex07(String irum, int no, int j, int d, int script, int jp, int sp ) {setName(irum); setData(no, j, d, script, jp, sp);}
	public Ex07(String irum, int no, int j, int d, int script) {this(irum);}
	
	void setData(int no, int j, int d, int script, int jp, int sp, int t) {
		stdno = no;
		java = j;
		db = d;
		js = script;
		jsp = jp;
		spring = sp;
		total = t;
		
	}
	void setName(String irum) {
		name = irum;
	}
	
	void setData(String irum, int no, int j, int d, int script, int jp, int sp, int t) {
		setName(irum);
		setData(no, j, d, script, jp, sp, t);
		
	}
	
	void setData(String irum, int no, int j, int d) {
		setName(irum);
		setData(no, j, d);
	}
	
	void setData(int no, int j, int d, int script, int jp, int sp) {
		setData(no, j, d, script, jp, sp);
		
	}
	
	/*
	 String irum, int no, int j, int d, int script, int jp, int sp, int t
	 String irum, int no, int d, int j, int script, int jp, int sp, int t
	 	>타입의 순서가 모두 동일하므로 같다
	 	
	 String irum, int no, int j, int d, int script, int jp, int sp, int t
	 int no, String irum, int j, int d, int script, int jp, int sp, int t
	 	>타입의 순서가 다르므로 다르다
	 	
	 String irum, int no, int j, int d, int script, int jp, int sp, int t
	 String irum, int no, int j, int d, int script
	 	>개수가 다르므로 다르다
	 */
	
	public static void main(String[] args) {
		new Ex07(); 
		//이 함수는 실행해도 아무것도 안드는 것임. 당연함. 만들기만 하고 안에 안넣었잖아
		new Ex07("김종국");
		new Ex07("제니", 1);

	}

}
