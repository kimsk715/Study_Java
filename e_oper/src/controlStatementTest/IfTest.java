package controlStatementTest;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		int num1=0, num2=0 ;
		String result="";
		Scanner num = new Scanner(System.in);
		
		num1 = num.nextInt();
		num2 = num.nextInt();
		
		boolean check1 = false, check2 = false;
		check1 = num1 > num2;
		check2 = num1 == num2;
		
		if(check1) {
			result = "더 큰 값 : " + num1;
		}
		else if(check2) {
			result = "두 수가 같다.";
		}
		else {
			result = "더 큰 값" + num2;
		}
		System.out.println(result);
	}
}
