package exceptionTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTask {
   public static void main(String[] args) {
//      5개의 정수만 입력받기
//      - 무한 입력 상태로 구현(5번 이상 입력 가능)
//      - q 입력 시 나가기
//      - 각 정수는 배열에 담기
//      - if문은 딱 한 번만 사용하기(q입력 시 나가기)
      
//      오류 상황
//      6번째 정수를 입력했을 때
//      정수가 아닌 다른 것을 입력했을 때
	   Scanner numbers = new Scanner(System.in);
	   int[] number5 = new int[5];
	   String errormessage1 = "정수가 5개를 초과했습니다.";
	   String errormessage2 = "정수가 아닙니다.";
	   
	   String tempNum = "";
	   while(true) {
	   try {
		   for(int i=0; i<10; i++) {
			   System.out.println((i+1) + " 번째 정수를 입력하세요");
			   tempNum = numbers.next();
			  int temp = Integer.parseInt(tempNum);
				   number5[i]= temp;
			   }
	   }
	   	
		   catch(ArrayIndexOutOfBoundsException e){
//			   e.printStackTrace();
			   System.out.println(errormessage1);
			   
		   }
	   		catch(NumberFormatException e) {
//	   			e.printStackTrace();
	   		 if(tempNum.equals("q")) {
				   System.out.println("나가");
			   }
			   else {
	   			System.out.println(errormessage2);
			   }
	   		}
	   		catch(Exception e) {
	   			System.out.println("다시");
	   		}
	   	
	   for(int j=0; j<number5.length; j++) {
		   System.out.println(number5[j]);
	   }	  
	   }
	   	
	   }
   }
