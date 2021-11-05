package day03;

public class Ex03 {
	/*
	 게시판에 게시물을 게시하려고 한다
	 게시판 한 페이지에는 15개의 게시물이 들어간다
	 게시물의 개수를 랜덤한 정수개 발생시켜서 몇 페이지가 필요한지 출력해주는 프로그램을 작성하라
	 단, 게시물 0개도 1페이지는 필요로 한다 
	 */

	public static void main(String[] args) {
		//1. 랜덤한 게시물의 개수를 만든다
		int no = (int)(Math.random() * 100);
		
		//2.필요한 페이지의 수는 ? > 게시물 0개와 15개의 페이지 수 는 같다
		// p : 15개 꽉찬 페이지는 몇개 나오는지
		//나머지 : 있으면 +1 해줘야함
		//...조건 p = 0인 경우   /
		//										아니면 p+1이 페이지수  
		int baesu = (int)(no / 15);
		int na = (int)(no % 15);
		int an =  (na != 0) ? (baesu + 1) : (
											  (no == 0) ? 1 : baesu);											
				
		//3.출력한다
		System.out.println("게시글의 수 :" + no + "\n15로 나눈 값 : " + baesu + "\n나머지  : " + na + "\n필요한 페이지 수 : " + an);

	}

}
