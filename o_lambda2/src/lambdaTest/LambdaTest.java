package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
		
//		람다 인터페이스에 구현된 클래스의 필드 주소값이 들어감.
//		따라서 람다 인터페이스에 구현된 자식 클래스가 들어갔기 때문에 upcasting
		LambdaInter lambdaInter = (number) -> number % 10 == 0; // 이름이 없는 익명 메소드가 들어간 람다식.
		System.out.println(lambdaInter.checkMultipleof10(97));
		
	}
}
