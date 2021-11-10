package day11;

/*
  day11 폴더의 파일 목록을 알아내자
 */
import java.io.*;
public class Test06 {

	public Test06() {
		//1. 목록을 알고싶은 폴더를 파일 객체로 만든다
		File f = new File("C:/Users/user/git/456/456/kingdom_me/src/day11");
		/*2. 목록 꺼내오기 = list()로 꺼내는 방법 = 이름만 나옴
		String[] fArr = f.list();
		//3. 출력
		for(String s : fArr) {
			System.out.println(s);
			}
		*/
		/*2-1. 목록 꺼내오기 = listFiles()로 꺼내는 방법 = 정보까지 다 나옴
		File[] fArr = f.listFiles();
		for(int i = 0 ; i < fArr.length ; i++) {
			File fileInfo = fArr[i];
			String fname = fileInfo.getName();
			long len = fileInfo.length();
			String folder = fileInfo.getParent();
			System.out.println("폴더 : " + folder);
			System.out.println("파일이름 : " + fname);
			System.out.println("파일길이 : " + len + "byte");
			System.out.println("-------------------------------------------------------");
			System.out.println();
		}	*/
		//확장자가 txt인 파일만 골라서 출력해보자
		//무명 내부 클래스를 사용
		String[] fArr = f.list(new FilenameFilter() {
				/*
				 이 함수는 자동 호출 함수로 목록을 구하는 파일을 하나씩 발견할때마다 이 함수가 호출된다
				 이때 반환값이 true인 경우는 결과에 포함시키고 false의 경우는 제외시킨다
				 확장자 알아내기 : 파일이름.endsWith("확장자명")
				 */
	
			@Override	//FilenameFilter()가 인터페이스
			public boolean accept(File dir, String name) {
				if(name.endsWith("txt")) {
					return true;
				}
				return false;
			}
		});
		//출력
		for(int i = 0 ; i < fArr.length ; i++) {
			String fileName = fArr[i];
			System.out.println((i+1) + " . " + fileName);
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
