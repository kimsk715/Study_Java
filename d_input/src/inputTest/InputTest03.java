package inputTest;

import java.util.Scanner;

public class InputTest03 {
	public static void main(String[] args) {
//		3개의 정수를 한 번에 입력받은 후 덧셈 결과 출력
//		nextInt 
		String inputMessage = "정수 3개를 입력해주세요 ex) 1 4 6"; //출력할 메시지
		System.out.println(inputMessage); // 메시지 출력
		int num1 = 0, num2=0 , num3=0, result=0; // 입력받을 값 3개와 덧셈 결과 정의
		Scanner num = new Scanner(System.in); // 스캔
//		scan.close를 통해 닫아야 버퍼가 사라짐.
		num1 = num.nextInt(); // 입력한 값 3개 각각 저장
		num2 = num.nextInt();
		num3 = num.nextInt();		
		result = num1 + num2 + num3 ; //덧셈 해주기
		System.out.println(result + "입니다." ); //덧셈 결과 출력		
	}
}


// 제대로 입력되는지 체크도 하자
