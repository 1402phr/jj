package day11;
/*
 	1. day11 패키지에 폴더 하나를 강제로 만들어보자
 	2. 계츨화된 폴더를 만들어보자
 	3. 만들어진 폴더 하나를 삭제하자
 	4. fileTest 파일을 fileTest_new로 이름을 변경하자
 */

import java.io.*;

import javax.swing.JOptionPane;
public class Test05 {

	public Test05() {
	/*1. 만들고 싶은 폴더(없어도 상관무) 파일로 만들자
		File f1 = new File("C:/Users/user/git/456/456/kingdom_me/src/day11/folderTest");
		boolean bool = f1.mkdir();
		String str = "";
		if(bool) {
			str = "폴더만들기 성공";
		} else {
			str = "폴더만들기 실패";
			
		}
		JOptionPane.showMessageDialog(null, str);
	*/
	/*2. 계층화된 폴더 만들기
	//day11 패키지에 folderTest/folder01/folder02/folder03
	File f2 = new File("C:\\Users\\user\\git\\456\\456\\kingdom_me\\src\\day11\\folderTest\\folder01\\folder02\\folder03");
	boolean bool = f2.mkdirs();
	String str = "";
	if(bool) {
		str = "폴더만들기 성공";
	} else {
		str = "폴더만들기 실패";
		
	}
	JOptionPane.showMessageDialog(null, str);
	*/
	/*3. 
		File f2 = new File("C:\\Users\\user\\git\\456\\456\\kingdom_me\\src\\day11\\folderTest\\folder01\\folder02\\folder03");
		if(!f2.exists()) {
		boolean bool = f2.mkdirs();
		String str = "";
		if(bool) {
			str = "폴더만들기 성공";
		} else {
			str = "폴더만들기 실패";
			
		}
		JOptionPane.showMessageDialog(null, str);
	} else {
		f2.delete();
		
		System.out.println("폴더삭제 성공");
	}*/
	//4. renameTo()
	//File객체 2개를 만든다
	File oldF = new File("C:/Users/user/git/456/456/kingdom_me/src/day11/folderTest/fileTest");
	File newF = new File("C:/Users/user/git/456/456/kingdom_me/src/day11/folderTest/fileTest_new");
	
		
	}
	public static void main(String[] args) {
		new Test05();
	}

}
