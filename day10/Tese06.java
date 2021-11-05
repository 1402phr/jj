package day10;
/*
  
 */

import java.util.*;
public class Tese06 {

	public Tese06() {
		ArrayList<? extends Figure> list = null;
		ArrayList<Semo> l1 = new ArrayList<Semo>();
		l1.add(new Semo(5, 10));
		l1.add(new Semo(5, 8));
		
		ArrayList<Nemo> l2 = new ArrayList<Nemo>();
		l2.add(new Nemo(2, 7));
		l2.add(new Nemo(3, 9));
		
		ArrayList<Won> l3 = new ArrayList<Won>();
		l3.add(new Won(10));
		l3.add(new Won(15));
		
		list = l1;
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i).getArea());
			System.out.println(((Semo)list.get(i)).getWidth());
		}
			System.out.println();
			
		list = l2;
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i).getArea());
			System.out.println(String.format("%7.2f", list.get(i).getArea()));	
		}
		System.out.println();
		
		list = l3;
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(String.format("넓 이 : %3d", list.get(i), getRad()));
			System.out.println(String.format("%7.2f", list.get(i).getArea()));	
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
	}

}

