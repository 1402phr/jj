package day09;

/*
Ex02 에서 만들어진 데이터를 
Map으로 관리하세요.		> 맵으로 관리한다는 것은 (키, 내용)의 형태로 저장하는것
키 = 이름
내용 = 점수

학생의 모든내용이 들어있는 것 : sall
sall을 맵에 넣는데 이름과 점수로 분리하면 될듯
*/


import java.util.*;
import javax.swing.*;
public class Ex03 {
	HashMap studMap = new HashMap();
	
	public Ex03() {
		//
		ArrayList<String> names = new ArrayList<String>();
		names.add("제니");
		names.add("로제");
		names.add("리사");
		names.add("지수");
		names.add("둘리");
		
		ArrayList<String> subName = new ArrayList<String>();
		subName.add("java");
		subName.add("db");
		subName.add("web");
		subName.add("jsp");
		subName.add("spring");
		
		HashMap map = new HashMap();	
		ArrayList subj = null;		//처음에 null로 초기화한 이유는?
		for(int i = 0 ; i < subName.size(); i++) {
			subj = new ArrayList();		// 무엇을 반복? subName.size()와 동일한 크기의 ArrayList를 만든다?
			for(int j= 0 ; j < names.size() ; j++) {
				int score = (int)(Math.random()*41+60);
				subj.add(score);		//subj에 각 학생의 점수정보를 넣는다
			}
			map.put(subName.get(i), subj);		//결국 map에 들어간 것은 과목이름, 학생들의 과목별 점수정보
		}
		
		HashMap sMap = null;
		for(int i = 0 ; i < names.size(); i++) {
			sMap = new HashMap();		//이것도 위처럼 names.size()와 크기가 동일한 HashMap을 만든다?
			sMap.put("name", names.get(i));		// name이랑 names.get(i)랑 다른 부분?  / "name" = key & names.get(i) = value
			for(int j = 0 ; j < subName.size(); j++) {
				sMap.put(subName.get(j), ((ArrayList)map.get(subName.get(j))).get(i));
			}
			studMap.put(names.get(i), sMap);
		}
		
		//총점평균 계산
		for(int i = 0 ; i < names.size(); i++) {
			String name = (String)((HashMap)studMap.get(names.get(i))).get("name");
			int t = 0;
			for(int j = 0 ; j < subName.size(); j++) {
				int no = (int)((HashMap)studMap.get(name)).get(subName.get(j));
				t += no;
			}
			((HashMap)studMap.get(names.get(i))).put("total", t);
			((HashMap)studMap.get(names.get(i))).put("avg", t / 0.5);
		}
		//출력
		exec();
	}
		//전체결과 출력용 함수
		public void toPrint() {
		Set nameSet = studMap.keySet();		
		Iterator<String> itor = nameSet.iterator();
		while(itor.hasNext()) {
			String student = itor.next();
			HashMap resultMap = (HashMap)studMap.get(student);
			Set subjKey = resultMap.keySet();
			Iterator<String> subjIt = subjKey.iterator();
			String subjName = subjIt.next();
			StringBuffer buff = new StringBuffer();
			while(subjIt.hasNext()) {
				subjName = subjIt.next();
				buff.append(subjName + " : " + resultMap.get(subjName) + "\n");
//				System.out.println(subjName + " : " + resultMap.get(subjName));
			}
			int result = JOptionPane.showConfirmDialog(null, subjName + " : " + resultMap.get(subjName));
			System.out.println(result);
			}
		}
		//한사람 데이터 출력용 함수
		public void toPrint(String name) {
			HashMap resultMap = (HashMap)studMap.get(name);
			Set subjKey = resultMap.keySet();
			Iterator<String> subjIt = subjKey.iterator();
			while(subjIt.hasNext()) {
				String subjName = subjIt.next();
				System.out.println(subjName + " : " + resultMap.get(subjName));
			}
			System.out.println();
		}
		
		//한사람의 과목점수 조회
		public void toPrint(String name, String subj) {
			HashMap resultMap = (HashMap)studMap.get(name);
			System.out.println("name : " + name);
			System.out.println(subj + " : " + resultMap.get(subj));
			System.out.println();
		}
		public void exec() {
			//학생들 이름을 모두 출력
			Set<String> set = studMap.keySet();
			Iterator<String> itor = set.iterator();
			
			
			while(true) {
			System.out.println("다음 학생 중 조회할 학생을 입력하세요! \n종료는 q를 입력하세요!");
			System.out.print(" | ");
			while(itor.hasNext()) {
				System.out.print(itor.next());
				System.out.print(" | ");
			}
			System.out.println();
			
			System.out.print("학생이름 : ");
			Scanner sc = new Scanner(System.in);
			
			//메시지 출력
			String name = sc.nextLine();
			if(name.equals("q"))
			break;
			
			boolean bool = true;
			while(bool) {
			System.out.println("\t모든 정보는 a\n\t과목점수는 s\n\t총점은 t\n\t평균은 a\n\t이전단계는 p\n\t종료는 q\n을 입력하세요");
			String str = sc.nextLine();
			
			switch(str)	{
			case "p":
				bool = false;
				break;
			case "q":
				System.out.println("프로그램을 종료합니다");
				return;
			case "a":
				toPrint(name);
				break;
			case "t":
				toPrint(name, "total");
				break;
			case "v":
				toPrint(name, "avg");
				break;
			case "s":
				System.out.print("조회과목 입력 : ");
				String sub = sc.nextLine();
				toPrint(name, sub);
				break;
			}
				
		}
			
	}
}
	public static void main(String[] args) {
		new Ex03();
	}

}