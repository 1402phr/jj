package day10;


import java.util.*;
public class Test02 {
	public Test02() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("제니");
		names.add("로제");
		names.add("둘리");
		
		ArrayList<Integer> ages = new ArrayList<Integer>();
		ages.add(24);
		ages.add(24);
		ages.add(1);
		
		for(int i = 0 ; i < names.size(); i++) {
			String form = String.format("%-6s : %2d", names.get(i), ages.get(i));
			System.out.println(form);
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
