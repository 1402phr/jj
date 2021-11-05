package day01;
/*
 * 상수 연습용
 * @author 나
 * @since 2021/10/25
 * @version v.1.0
 * @see
 * 		작업이력 ]
 * 				2021.10.28 - 클래스 제작 - 담당자 : 나
 */
public class Test09 {
	public static void main(String[] args) {
		/* 3.14를 기억할 변수 PI를 만들어서 원의 반지름이 5인 원의 넓이를 계산하라
		 * 공식 : 반지름 * 반지름 * 3.14
		 */
		/*final double PI ;
		 PI = 3.14;
		함수 안에서는 이렇게 선언과 초기화를 따로해도 되는데 class 블럭에서 이러면 다른 변수는 선언+초기화만 가능하고 선언만 하는건 못함
		final double PI;에서 이미 PI에 0.0을 대입시키기 때문에 final double PI2;를 선언하면 얘도 0으로 선언되어서 안되는 것
		*/
		final double PI = 3.14;
		int r = 5;
		double area = r * r * PI;
		System.out.println("반지름이 " + r + " 인 원의 넓이는 " + area + " 입니다.");

			}
}
