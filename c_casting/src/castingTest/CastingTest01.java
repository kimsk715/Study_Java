package castingTest;

public class CastingTest01 {
	public static void main(String[] args) {
//		자동 형변환
		System.out.println( 5/2 ); // 2 
		System.out.println( 5/2.0); //2.5

		System.out.println( (double)5/2);
		System.out.println((int)2.8 + 5); // 실수의 가수부가 삭제됨

		double num1 = 8.43, num2 = 2.59;
		System.out.println((int)8.43+(int)2.59);
	}
}
