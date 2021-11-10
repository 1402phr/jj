package day12;

/*
 	char단위로 파일에 데이터를 저장하는 프로그램을 작성하라
 	
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
public class Test02 {

	public Test02() {
		//문자단위 스트림 준비
		FileWriter fw = null;
		
		try {
			//스트림을 파일에 연결
			fw = new FileWriter("C:/Users/user/git/456/456/kingdom_me/src/day12/yeats_fw.txt");
			
			/*1. 한글자만 입력해보기 @see - java.io - writer
			char ch = 'Y';
			fw.write(ch);
			JOptionPane.showMessageDialog(null, "저장성공");
			*/
			/*2. 한줄 입력하기
			String str = "The Wanderings of Oisin and Other Poems";
			fw.write(str);
			JOptionPane.showMessageDialog(null, "저장성공");
			*/
			//3. 시 한 수 입력
			StringBuffer buff = new StringBuffer("The Wanderings of Oisin and Other Poems");
			buff.append("\r\n");
			buff.append("We rode in sorrow, with strong hounds three,"); 
			buff.append("\r\n");
			buff.append("Bran, Sgeolan, and Lomair,"); 
			buff.append("\r\n");
			buff.append("On a morning misty and mild and fair."); 
			buff.append("\r\n");
			buff.append("The mist-drops hung on the fragrant trees,"); 
			buff.append("\r\n");
			buff.append("And in the blossoms hung the bees."); 
			buff.append("\r\n");
			buff.append("We rode in sadness above Lough Lean,"); 
			buff.append("\r\n");
			buff.append("For our best were dead on Gavra's green.");
			buff.append("\r\n");
			buff.append("- William Butler Yeats -");
			fw.write(buff.toString());
		 JOptionPane.showMessageDialog(null, "저장성공");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(Exception e) {
				
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		new Test02();
	}

}
