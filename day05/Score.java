package day05;

public class Score {
	//변수 선언
	int java;
	int db;
	int js;
	int jsp;
	int spring;
	int total;
	int avg;
	
	//java점수
	void setJava(int j1) {
			java = j1;
	}
	//db
	void setDb(int d) {
		db = d;
}
	//js
	void setJs(int j2) {
		js = j2;
}
	
	//jsp
	void setJsp(int j3) {
		jsp = j3;
}
	
	//spring
	void setSpring(int s) {
		spring = s;
}
	
	//total
	void setTotal(int t) {
		total = java + db+ js + jsp + spring;
}
	
	//avg
	void setAvg(int a) {
		avg = (int)(total / 5);
}
	//출력
	void toPrints() {
		System.out.printf("");
	}
	
	
	
}