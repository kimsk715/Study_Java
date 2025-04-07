package inhTest;

class A {
	String name;
	public A() {
		System.out.println("부모 생성자 호출");
	}
}

class B extends A{
	public B() {
		super(); // 부모의 필드, this는 자식의 필드.
		System.out.println("자식 생성자 호출");
	}
}

public class InhTest01 {
	public static void main(String[] args) {
		B b = new B();
		b.name = "B클래스";
		System.out.println(b.name);
	}
}
