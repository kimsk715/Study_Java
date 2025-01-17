package inputTest;

import java.util.Scanner;

public class InputTest02 {
	public static void main(String[] args) {
//		두 실수를 입력 한뒤 곱셈 결과 출력
		System.out.println("실수를 두 개 입력해주세요!"); // 변수에 저장해서 출력하자
		Scanner num = new Scanner(System.in);
		String num1 = null;
		String num2 = null;
		num1 = num.next();
		num2 = num.next();
		double result = Double.parseDouble(num1) * Double.parseDouble(num2);
		System.out.printf("곱셈 결과는 %.2f 입니다.", result ); // 여기도 값이니까 변수로 저장해서 출력
//		printf를 쓰지 않으려면 String.format을 통해 실수로 바꿔서 println으로 출력 가능.
	}
}
