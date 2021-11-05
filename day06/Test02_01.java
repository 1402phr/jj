package day06;

public class Test02_01 extends Test02 {
	int no = 100;
	
	public static void main(String[] args) {
		Test02_01 t1 = new Test02_01();
		t1.abc();
		System.out.println("t1.no : " + t1.no);
		
		Test02 t2 = new Test02_01();		// 같은 인스턴스를 가지고 있으니까 이것도 가능함
		t2.abc();
		System.out.println("t2.no : " + t2.no);
		
		Test02 t3 = new Test02_02();
		t3.abc();
	}
	
	public void abc() {
		System.out.println("***** 여기는 Test02_01 클래스 *****");
	}

}
/* t1.abc();
   System.out.println(t1.no);
	 >여기까지는 Test02에서 만든 함수가 실행되어서 "### 이 클래스는 Test02 클래스 ###" 가 출력됨
	
	public void abc() {
		System.out.println("***** 여기는 Test02_01 클래스");
			> 이렇게 하면 재정의되어서 "***** 여기는 Test02_01 클래스" 가 출력됨
			
	근데 상위 클래스의 변수는 어지간하면 수정하지 마세용....
	변수는 레퍼런스/ 함수는 인스턴스를 다름 = 함수는 일단 오버라이딩 되면 그걸로만 읽음 
*/ 