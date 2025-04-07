package classTest;

class A {
//	전역 변수(Global Variable)
//	클래스 영역에 선언한 변수.
//	새로운 new를 만나면 메모리 해제(생명 주기)
//	자동으로 초기화
	int data;
	
	void printData() {
//		지역 변수(Local Variable)
//		닫는 중괄호를 만나면 메모리 해제.
//		int data=0;
//		지역 변수는 꼭 초기화 하고 사용해야 함.
		System.out.println(this);
		System.out.println(this.data);
	}
}

public class ClassTest01 {
	public static void main(String[] args) {
	 A a1= new A();
	 A a2= new A();
	 a1.data = 100;
	 System.out.println(a1);
	 System.out.println(a2);
	}
}
