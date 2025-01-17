package controlStatementTest;

import java.util.Scanner;

public class IfTask {
   public static void main(String[] args) {
	   
      
      String title = "Q. 당신이 좋아하는 색을 선택하세요.";
      String menu = "1.빨간색\n2.노란색\n3.검은색\n4.흰색";
      System.out.println(title);
      System.out.println(menu);
      int choice = 0;
      String redMessage = "불같고 열정적이고 적극적이다.";
      String yellowMessage = "발랄하고 밝고 귀엽고 개성있고 착하다.";
      String blackMessage = "묵묵하고 든든하고 냉철하고 멋지다.";
      String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
      String errorMessage = "잘못 입력하셨습니다.";
      String resultMessage = null;
      Scanner sc = new Scanner(System.in);
      choice = sc.nextInt();
      
      boolean check1 = choice == 1;
      boolean check2 = choice == 2;
      boolean check3 = choice == 3;
      boolean check4 = choice == 4;
      
      if(check1) {
    	  resultMessage = redMessage;
      }
      else if(check2) {
    	  resultMessage = yellowMessage;
    	  }
      else if(check3) {
    	  resultMessage = blackMessage;
      }
      else if(check4) {
    	  resultMessage = whiteMessage;
      }
      else {
    	  resultMessage = errorMessage;
      }
   System.out.println(resultMessage);
   }
}
