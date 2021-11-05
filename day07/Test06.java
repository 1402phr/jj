package day07;

public class Test06 {
	class InnerCls {
		int no = 10;
		void abc() {
			xyz();
			System.out.println("여기는 내부클래스");
		}
	}
	public static void main(String[] args) {
		Test06 t1 = new Test06();		//바깥 클래스가 객체화되어 메모리에 올라가야 내부클래스도 new 할 수 있음
		Test06.InnerCls cls = t1.new InnerCls();
//		InnerCls cls = t1.new InnerCls();		> 이렇게 해도됨
		System.out.println("cls.no : " + cls.no);
		cls.abc();
	}

		void xyz() {
			InnerCls c2 = new InnerCls(); 	// > 전역변수와 같은 위치에 있어서 클래스 어디서든 부를 수 있음
		}
		
}
