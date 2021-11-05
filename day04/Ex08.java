package day04;

import java.util.Arrays;

public class Ex08 {
	/*
	1. 5명의 학생들의 국어, 영어, 수학 의 점수를 관리할 배열을 만들고
	2. 점수를 랜덤하게 입력하고
	3. 각 학생들의 총점을 입력하고
	4. 총점이 높은 사람순으로 정렬해서 수정하고
	5. 출력하세요.
	
	+각 과목별 총점을 입력하세요
	
	국어 | 영어 | 수학 | 총점
1
2
3
4
5	
 */

	public static void main(String[] args) {
		/*
		//1. 학생 5명의 3과목성적+총점을 관리할 배열을 만들자
		String[][] student = new String[5][4];
		
		//2.데이터를 채우자
		for(int i = 0; i < student.length ; i++ ) {
			int korean = (int)(Math.random() * 101);
			int english = (int)(Math.random() * 101);
			int math = (int)(Math.random() * 101);
			int total = (int)(Math.random() * 301);
			
			sagak[i][0] = garo;
			sagak[i][1] = sero;
			sagak[i][2] = garo * sero;	
			*/
		//1. 학생 5명의 과목 점수를 관리할 배열
		int [][] studScore = new int[6][4];
		
		//2. 세 과목의 점수를 관릴할 배열
		int[][] subScore = new int[4][6];
		
		//3.학생배열 채점 = 점수 입력(랜덤점수) / studScore.length - 1 : 총점은 
		for(int i = 0 ; i < studScore.length - 1 ; i++) {
			//학생을 순차적으로 뽑고 
			
			//ㄱㅘ목점수를 순차적으로 만들어 입력한다
			for(int j = 0 ; j < studScore[i].length - 1 ; j++) {
				//점수 만들기
				int score = (int)(Math.random()*41+60);
				studScore[i][j] = score;				
			}
		}
		//학생별 총점을 구한다
		for(int i = 0 ; i < studScore.length - 1 ; i++) {
			//해당 학생의 각 과목을 순차적으로 꺼내서 마지막 방에 누적시킨다
			int sum = 0;
			for(int j = 0 ; j < studScore[i].length - 1 ; j++) {
				//꺼낸 과목을 누적시키자
				sum = sum + studScore[i][j];				
			}
			
			studScore[i][studScore[i].length - 1] = sum;
			
		}
		//과목별 총점을 계산해서 입력한다
		
		//먼저 과목을 뽑고 
		for(int j = 0 ; j < studScore[0].length ; j++) {
			//나중에 학생을 뽑는다
			for(int i = 0 ; i < studScore.length - 1; i++) {
				studScore[studScore.length - 1][j] = studScore[studScore.length - 1][j] + 
													 studScore[i][j];
			}
		}
		
			for(int[] s1 : studScore) {
				System.out.println(Arrays.toString(s1));
				
			}
	}

}
