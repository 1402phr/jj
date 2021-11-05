package day04;

import java.util.Arrays;

public class Test06 {
	/*
	  배열의 복사
	  	
	  	방법 1 : 얕은 복사 > 주소만 복사함
	  					   > 데이터를 공유하기 때문에 한쪽에서 수정하면 다른 쪽도 수정됨
	  					   >지역변수와 같이 그 변수가 만들어진 영역(지역, 블럭) 내에서만 활동하므로
	  					   	다른 지역에서 heap영역의 데이터를 사용할 목적으로 많이 사용됨
	  			 
	  			 방법 : int[] no1 =new int[5];
	  			 		...데이터를 기억시킴
	  			 		int[] no2 = no1;    > no2를 만들때 따로 new 시킬 필요 없음(이미 no1만들때 new해서 heap에 올라가있음)
	  			 							> new 시켜도 no2 = no1라고 대입시키는 동시에 no2에 new시켜서 heap에 올라간 주소와는 
	  			 							  연결이 끊김 = 다시 이 주소를 찾을 방법이 없음 > 가비지 컬렉터 작동
 	  			 		
	  	방법 2 : 깊은 복사 > 데이터까지 모두 복사
	  					   > 데이터가 복사되었다는 것은 heap의 다른 곳에 데이터가 한번 더 존재한다는 의미
	  					     따라서 데이터의 주소가 달라지게되고 복사된 데이터는 독립적으로 사용된다
	  					     
	  			 방법 : System.arrayCopy(1, 2, 3, 4, 5);
	  			 		1 : 원본데이터의 주소
	  			 		2 : 원본데이터에서 복사를 시작할 위치 (내용을 중간부터 복사할 수 있음)
	  			 		3 : 복사받을 배열의 주소
	  			 		4 : 복사받을 주소의 시작위치 (복사한 내용을 넣을 위치를 설정가능)
	  			 		5 : 복사받을 데이터의 개수
	  			 		
	  배열의 단점 
	  	1. 한번 배열의 크기를 설정하면 변경불가
	  	2. 같은 타입의 데이터만 관리할 수 있다 >주소는 heap타입에 의해서 결정되고 heap타입이 다르면 사용할 수 없다(호환불가)
	  	
	 */

	public static void main(String[] args) {
		int no = 10;
		double no1 = no; //이건 됨. double이 int보다 크니까
		
		int[] num1 = {1, 2, 3, 4, 5};
//		double[] num2 = num1;  // 이거 오류남 double이 int보다 커서 들어갈것 같지만 배열에서는 안됨(heap타입이 달라서 안되는 것)
		
		//얕은 복사
		int[] num2 =num1; 
		
		//num1, num2 출력
		System.out.println("# num1 : " + Arrays.toString(num1));
		System.out.println("# num2 : " + Arrays.toString(num2));
		
		//num1의 두번째 데이터를 30으로 변경
		num1[2] = 30;
		System.out.println("# num1 : " + Arrays.toString(num1));
		System.out.println("# num2 : " + Arrays.toString(num2)); //얕은 복사는 데이터를 공유해서 같이 바뀜
		
		//깊은 복사 : 배열 num1을 배열 numcopy의 4번째 자리부터 복사
		int[] numcopy = new int[10];
		System.arraycopy(num1, 0, numcopy, 4, num1.length);
		
		//numcopy의 6번째 데이터를 300으로 수정
		numcopy[5] = 300;
		
		//비교출력
		System.out.println("# num1 : " + Arrays.toString(num1));
		System.out.println("# numcopy : " + Arrays.toString(numcopy));
		
	}

}
