package day09;

import java.util.*;
public class Test03 {
	public Test03() {
		TreeSet tSet = new TreeSet();
		
		Stud s1 = new Stud("제니", 80, 100, 95, 85, 80);
		Stud s2 = new Stud("로제", 75, 90, 80, 80, 95);
		System.out.println(s1.getTotal());
		System.out.println(s1.getAvg());
		tSet.add(1);
		tSet.add(2);
		System.out.println(tSet);
		
		TreeSet ts1 = new TreeSet(new Comparator() {
			
			//무명 내부 클래스
			@Override
			public int compare(Object o1, Object o2) {
				//이 경우는 Stud 클래스를 어떻게 정렬할지 정하는 함수
				//강제 형변환
				Stud s1 = (Stud) o1;
				Stud s2 = (Stud) o2;
				
				//리턴값의 의미 : 음수값을 갖는 경우는 위치를 바꾸지않고 양수값인경우는 위치를 바꾼다(오름차순)
				//실제 반환값의 대소가 중요한게 아니라 아래 계산에서 값이 양수인지 음수인지가 중요함
				//만들 정렬 기준은 총점 기준 
				return s1.getTotal() - s2.getTotal();
				
			}
		});
		
		ts1.add(s1);
		ts1.add(s2);
		
		//출력
		Iterator itor = ts1.iterator();
		while(itor.hasNext()) {
			Stud s = (Stud) itor.next();
			System.out.println(s.getTotal() + " : " + s.getTotal());
		}
		}
	

	public static void main(String[] args) {
		new Test03();
	}

}
