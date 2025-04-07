package streamTask;
import streamTask.DBConnecter;
import streamTask.Product;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import streamTask.DBConnecter;
import streamTask.Product;
public class StreamTask {
	
	public int minus10(int data) {
		   return 10-data;
	   }
	public boolean checkEven(int data) {
		return data%2==0;
	}
	public boolean checkOdd(int data) {
		return data%2!=0;
	}
	public static void main(String[] args) {
	   
//      1 ~ 10까지 ArrayList에 담고 출력
//      Integer[] arData = new Integer[10];
//      ArrayList<Integer> datas = null;
//      
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1;
//      }
//      
//      datas = new ArrayList<Integer>(Arrays.asList(arData));
      
//      ArrayList<Integer> datas = new ArrayList<Integer>();
      
//      IntStream.range(1, 11).forEach((data) -> {
//         datas.add(data);
//      });
//      IntStream.range(1, 11).forEach(datas::add);
//      
//      System.out.println(datas);
      
//      10 ~ 1까지 ArrayList에 담고 출력
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      
//      IntStream.range(0, 10).forEach((data) -> {
//         datas.add(10 - data);
//      });
//      
//      System.out.println(datas);
      
//      10 ~ 1까지 ArrayList에 담고 짝수만 출력
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      
//      IntStream.range(0, 10).forEach((data) -> {
//         datas.add(10 - data);
//      });
//      
//      datas.forEach((data) -> {
//         if(data % 2 == 0) {
//            System.out.println(data);
//         }
//      });
	   
	   
//	   10~1 까지 담고 출력
//	   ArrayList<Integer> numbers = new ArrayList<Integer>();
//	   IntStream.range(0, 10).forEach((data) ->{
//		  numbers.add(10-data);
//	   });
//	   
//	   numbers.stream().map(data -> data).forEach(System.out::println);
//	   
	   StreamTask streamTask = new StreamTask();
////	   10~1까지 담고 짝수만 출력
//	   ArrayList<Integer> numbers = new ArrayList<Integer>();
//	   IntStream.range(0, 10).map((data) -> streamTask::minus10).
//	  
//	   
//	   numbers.stream().map(num -> {
//	        if (num % 2 == 0) {
//	            return num;
//	        } else {
//	            return "";
//	        }
//	    }).forEach(System.out::println);
	   
//     Product 클래스 선언해서 아래의 필드를 구성한다.
//     상품명, 가격, 재고
//     가격을 모두 30% 할인하여 출력한다.
//     모든 재고를 10으로 변경한다.
	   
	   Product product = new Product();
	   Market market = new Market();
	   product.setName("마우스");
	   product.setPrice(500);
	   product.setStack(12);
	   market.add(product);
	   
	   product = new Product();
	   product.setName("키보드");
	   product.setPrice(1000);
	   product.setStack(7);
	   market.add(product);
	   
	   for(Product newproduct: DBConnecter.products) {
		   System.out.println(newproduct);
	   }
	   DBConnecter.products.stream().map((products) -> products.getPrice()).map((Price) -> (int)(0.7*Price)).forEach(System.out::println);
	   DBConnecter.products.stream().map((products) -> products.getStack()).map((Stack) -> 10).forEach(System.out::println);
	   
//	   10~1까지 담고 짝수 출력
//	   ArrayList<Integer> numbers = new ArrayList<Integer>();
//	   IntStream.rangeClosed(1,10).forEach(numbers::add);
//	   
//	   numbers.stream().map(streamTask::minus10).filter(streamTask::checkEven).forEach(System.out::println);
	   
//	   1~100까지 홀수만 담고 출력
//	   ArrayList<Integer> numbers = new ArrayList<Integer>();
//	   IntStream.rangeClosed(1, 100).forEach(data ->{
//		   if(data%2 !=0) {
//			   numbers.add(data);
//		   }
//	   });
//	   System.out.println(numbers);
	   
	   ArrayList<Integer> numbers = new ArrayList<Integer>();
	   IntStream.rangeClosed(1, 100).filter(streamTask::checkOdd).forEach(numbers::add);
	   System.out.println(numbers);
	   
//	   A B C E F 출력
//	   
	   ArrayList<Character> chars = new ArrayList<Character>();
	   IntStream.rangeClosed('A', 'E').map(data -> (data>'C') ? (data+1) : data).forEach((data) -> chars.add((char)data));
	   System.out.println(chars);
	   
//	   신고 기능에 쓸 수 있음.
//     심화 실습
//     5개의 문자열을 모두 소문자로 변경("Black", "WHITE", "reD", "yeLLow", "PINk")
//     toLowerCase()를 참조형으로 활용해보자!
	   String[] words = {"Black", "WHITE", "reD", "yeLLow", "PINk"};
	   ArrayList<String> datas = new ArrayList<String>(Arrays.asList(words));
	   datas.stream().map(data -> data.toLowerCase()).forEach(System.out::println);
	   
	   
//     "Apple", "banana", "Melon" 중 첫 번째 문자가 대문자인 문자열 출력
	   String[] words2 = {"Apple", "banana", "Melon"};
	   ArrayList<String> datas2 = new ArrayList<String>(Arrays.asList(words2));
	   datas2.stream().filter((data)-> data.charAt(0) >= 'A').filter((data)-> data.charAt(0) <= 'Z').forEach(System.out::println);
	   
//     한글을 정수로 변경
//     입력 예) 일공이사
//     출력 예) 1024
//     인덱스
     
//     정수를 한글로 변경
//     입력 예) 1024
//     출력 예) 일공이사
//	   나머지
	}
}






















