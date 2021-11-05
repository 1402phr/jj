package day09;

/*
 * 
 * 학생들의 과목점수를 정리할 예정이다

 * 점수는 랜덤하게 생성시킬 것
 * 큰 틀 : stud
 * 작은 틀 : 각 학생들의 점수와 를 담은 것
 * 
 */


import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
		Vector name = new Vector(5);
		name.add("제니");
		name.add("로제");
		name.add("리사");
		name.add("지수");
		name.add("둘리");
		
		TreeSet subj = new TreeSet();
		subj.add("1. java");
		subj.add("2. db");
		subj.add("3. web");
		subj.add("4. jsp");
		subj.add("5. spring");
		
		
		ArrayList java = new ArrayList(); // 각 학생들의 java 점수
			for(int i = 0 ; i < 5 ; i++) {
				java.add((int)(Math.random()*60)+40);
				}
		System.out.println("java : " + java);
			
		ArrayList db = new ArrayList(); //각 학생들의 db 점수
			for(int i = 0 ; i < 5 ; i++) {
			db.add((int)(Math.random()*60)+40);
			}
		System.out.println("db : " + db);
		
		// 각 학생들의 web 점수
		ArrayList web = new ArrayList();
			for(int i = 0 ; i < 5 ; i++) {
			web.add((int)(Math.random()*60)+40);
			}
		System.out.println("web : " + web);	
		
		// jsp 점수
		ArrayList jsp = new ArrayList();
		for(int i = 0 ; i < 5 ; i++) {
			jsp.add((int)(Math.random()*60)+40);
		}
		System.out.println("jsp : " + jsp);
		
		// spring 점수
		ArrayList spring = new ArrayList();
		for(int i = 0 ; i < 5 ; i++) {
			spring.add((int)(Math.random()*60)+40);
		}
		System.out.println("spring : " + spring);
		
		// 총점 
		ArrayList total = new ArrayList();
		for(int i = 0 ; i < 5 ; i++) {
		total.add((int)(java.get(i)) + (int)db.get(i) + (int)web.get(i) + (int)jsp.get(i) + (int)spring.get(i));
		}
		
		System.out.println("total : " + total);		
		
		// 평균		: 총점을 5로 나누면 됨
		ArrayList avg = new ArrayList();
		for(int i = 0 ; i < 5 ; i++) {
			avg.add((int)(java.get(i)) / 5 + (int)db.get(i) / 5 + (int)web.get(i) / 5 + (int)jsp.get(i) / 5 + (int)spring.get(i) / 5);
			}
		System.out.println("avg : " + avg);		
		// 제니학생의 이름, 점수 정보
		ArrayList je = new ArrayList();
		je.add(java.get(0));
		je.add(db.get(0));
		je.add(web.get(0));
		je.add(jsp.get(0));
		je.add(spring.get(0));
		je.add(total.get(0));
		je.add(avg.get(0));
		
		System.out.println("제니 : " + je);		
		
		// 로제 학생의 이름, 점수 정보
		ArrayList ro = new ArrayList();
		ro.add(java.get(1));
		ro.add(db.get(1));
		ro.add(web.get(1));
		ro.add(jsp.get(1));
		ro.add(spring.get(1));
		ro.add(total.get(1));
		ro.add(avg.get(1));
		
		System.out.println("로제 : " + ro);	

		// 리사 학생의 이름, 점수 정보
		ArrayList li = new ArrayList();
		li.add(java.get(2));
		li.add(db.get(2));
		li.add(web.get(2));
		li.add(jsp.get(2));
		li.add(spring.get(2));
		li.add(total.get(2));
		li.add(avg.get(2));
		
		System.out.println("리사 : " + li);	
		
		// 지수 학생의 이름, 점수 정보
		ArrayList ji = new ArrayList();
		ji.add(java.get(3));
		ji.add(db.get(3));
		ji.add(web.get(3));
		ji.add(jsp.get(3));
		ji.add(spring.get(3));
		ji.add(total.get(3));
		ji.add(avg.get(3));
		
		System.out.println("지수 : " + ji);	
		
		// 둘리 학생의 이름, 점수 정보
		ArrayList dr = new ArrayList();
		dr.add(java.get(4));
		dr.add(db.get(4));
		dr.add(web.get(4));
		dr.add(jsp.get(4));
		dr.add(spring.get(4));
		dr.add(total.get(4));
		dr.add(avg.get(4));
		
		System.out.println("둘리 : " + dr);	
		
		
		// 모든 학생들의 점수 정보
		ArrayList sall = new ArrayList();
		sall.add(je);
		sall.add(ro);
		sall.add(li);
		sall.add(ji);
		sall.add(dr);
		
		System.out.println("모두 : " + sall);	
		
		

	}

}
