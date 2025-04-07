package exceptionTest;

import java.util.Scanner;

public class RPG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "닉네임 : ";
		String nickName = null;
		System.out.println(message);
		nickName = sc.next();
		if(nickName.contains("바보")) {
//			일부러 프로그램을 강제종료시킬 때에 사용하는 클래스.
//			throw new RuntimeException();
		}
		
		
		System.out.println(nickName + " 용사님");
	}
}
