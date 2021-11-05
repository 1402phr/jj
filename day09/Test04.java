package day09;

import java.util.*;
public class Test04 {
	
	public Test04() {
		
	Stud s1 = new Stud("제니", 80, 100, 95, 85, 80);
	Stud s2 = new Stud("로제", 75, 90, 80, 80, 95);
	
	//TreeSet 만들기
	TreeSet set = new TreeSet();
	
	//데이터채우기
	set.add(s1);
	set.add(s2);
	
	//꺼내서 출력
	Vector vec = new Vector(set);
	for(Object o : vec) {
		Stud2 s = (Stud2) o;
		System.out.println(s.getName() + " - " + s.getJava());
	}
	} 
	
	public static void main(String[] args) {
		new Test04();
		}

}
