package day02;

/**
 * 이 클래스는 입력된 문자 'M' 또는 'F'를 "남자", 또는 "여자"라는 한글로 변한 출력해주는
 * 기능의 클래스
 * @author user
 * @since 2021/10/26
 * @version v.1.0
 * @see 
 * 			java.util.Scanner
 * 
 * 			작업이력 ]
 * 				2021.10.26 - 클래스 제작 - 담당자 : 나
 *
 */
import java.util.Scanner;
//import java.util.*;
public class Test02 {
	public static void main(String[] args) {
		//작업순서가 생각이 안날경우 먼저 한줄 주석으로 순서를 나열하고 진행하면 됨
		 
		 // 작업 순서
		 //1. 입력받을 준비를 하고 V여기 밑에 system.in은 장치에 연결한다는 의미인데 
		//열어둔 상태로 있으면 자원관리 측면에서 안좋음 > 다 썼으면 닫아주자
		//sc.close(); 를 넣어줬더니 sc밑에 노란줄이 사라짐
		Scanner sc = new Scanner(System.in);
		
		 // 2. 메시지를 출력하고
		System.out.println("성별을 'M' 또는 'F'로 입력하세요! : ");
		
		//3. 데이터를 꺼내서
		sc.close(); 
		String str = sc.nextLine();
		
		 //4. 꺼낸 데이터를 비교해서 분기처리를 한다
		/*
		 * 3항 비교 연산자
		 형식 ] 
		 		변수 = (조건식) ? (조건식이 참일 경우의 반환값) : (조건식이 거짓일 경우의 반환값);
		 */
		String msg =  (str.equals('M')) ? ("입력한 성별은 남자") : ("입력한 성별은 여자");
		String gen =  (str.equals('M')) ? ("남자") : ("여자");
		
		//5. 마지막을 결과를 출력
		System.out.println("입력한 문자는 " + str + "이고 \n" + msg);
		System.out.println("입력한 문자는 " + str + "이고 \n" + "한글 성별은 " + gen + "입니다.");
	}

}
