package exceptionTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		
//		try {
//			System.out.println(arData[5]); // 빌드 오류			
//		}
//		catch(Exception e){
//			e.printStackTrace();  // 예외 내용을 문자열로 출력.
//		}
		
//		사용자에게 정수를 입력받고 10 더해서 출력 만약 정수가 아니면 강제 종료
		Scanner number = new Scanner(System.in);
		int number1 = 0;
		
		System.out.println("정수를 입력하세요");
		
		try {
			number1 = number.nextInt();
			System.out.println(number1+10);
		}
		catch(InputMismatchException e) {
			System.out.println("예외");
		}
	}
}
