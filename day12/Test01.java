package day12;

/*
	예츠의 오이진의 방랑기를 파일에 저장하라
	
The Wanderings of Oisin and Other Poems

We rode in sorrow, with strong hounds three,
Bran, Sgeolan, and Lomair,
On a morning misty and mild and fair.
The mist-drops hung on the fragrant trees,
And in the blossoms hung the bees.
We rode in sadness above Lough Lean,
For our best were dead on Gavra's green.

- William Butler Yeats -
 */

import java.io.*;

import javax.swing.JOptionPane;
public class Test01 {

	public Test01() {
		//스트림 준비
		PrintStream ps = null;
		
		//스트림을 파일에 연결한다
		try {
			ps = new PrintStream("C:/Users/user/git/456/456/kingdom_me/src/day12/yeatd.txt");
			
			//스트림이 연결되면 바로 내용을 쓰면 됨
			//PrintStream은 필터스트림이지만 내부적으로 타겟 스트림을 만들어서 처리함
			ps.println("The Wanderings of Oisin and Other Poems");
			ps.println("");
			ps.println("We rode in sorrow, with strong hounds three,");
			ps.println("Bran, Sgeolan, and Lomair,");
			ps.println("On a morning misty and mild and fair.");
			ps.println("The mist-drops hung on the fragrant trees,");
			ps.println("And in the blossoms hung the bees.");
			ps.println("We rode in sadness above Lough Lean,");
			ps.println("For our best were dead on Gavra's green.");
			ps.println("");
			ps.println("- William Butler Yeats -");
			
			JOptionPane.showMessageDialog(null, "파일저장성공");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("파일저장실패");
		}finally {
			try {
				ps.close();
		//참고 : 스트림의 close()는 flush기능을 포함하고있다	> 따라서 사용하던 스트림을 닫게되면 자동으로 flush()가 호출된다
			}catch(Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
