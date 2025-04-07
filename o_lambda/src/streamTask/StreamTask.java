package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTask {
	public static int minus10(int data) {
		return 10 - data;
	}

	public static int discount(int price) {
		return (int) (price * 0.7);
	}
	
	public static boolean checkEven(int data) {
		return data % 2 == 0;
	}
	
	public static boolean checkOdd(int data) {
		return data % 2 != 0;
	}
	
	
	public static int divide10(int data) {
		return data%10;
	}
	
	public static void main(String[] args) {
//		forEach
//		1 ~ 10까지 ArrayList에 담고 출력
//		Integer[] arData = new Integer[10];
//		ArrayList<Integer> datas = null;
//		
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//		}
//		
//		datas = new ArrayList<Integer>(Arrays.asList(arData));

//		ArrayList<Integer> datas = new ArrayList<Integer>();

//		IntStream.range(1, 11).forEach((data) -> {
//			datas.add(data);
//		});
//		IntStream.range(1, 11).forEach(datas::add);
//		
//		System.out.println(datas);

//		10 ~ 1까지 ArrayList에 담고 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		
//		IntStream.range(0, 10).forEach((data) -> {
//			datas.add(10 - data);
//		});
//		
//		System.out.println(datas);

//		10 ~ 1까지 ArrayList에 담고 짝수만 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		
//		IntStream.range(0, 10).forEach((data) -> {
//			datas.add(10 - data);
//		});
//		
//		datas.forEach((data) -> {
//			if(data % 2 == 0) {
//				System.out.println(data);
//			}
//		});

//		map
//		10 ~ 1까지 ArrayList에 담고 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(0, 10).map(StreamTask::minus10).forEach(datas::add);
//		
//		System.out.println(datas);

//		10 ~ 1까지 ArrayList에 담고 짝수만 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(0, 10).map(StreamTask::minus10).forEach(datas::add);
//		datas.stream().forEach((data) -> {
//			if(data % 2 == 0) {
//				System.out.println(data);
//			}
//		});

//		Product 클래스 선언해서 아래의 필드를 구성한다.
//		상품명, 가격, 재고
//		Product[] arProduct = { new Product("지우개", 800, 25), new Product("연필", 500, 11), new Product("칫솔", 1900, 5),
//				new Product("가위", 3000, 235) };
//
//		ArrayList<Product> products = new ArrayList<Product>(Arrays.asList(arProduct));

//		가격을 모두 30% 할인하여 출력한다.
//		products.stream().map((product) -> product.getPrice()).map(StreamTask::discount).forEach(System.out::println);

//		모든 재고를 10으로 변경한다.
//		products.stream().map((product) -> product.getStock()).map((stock) -> 10).forEach(System.out::println);
		
//		filter
//		10 ~ 1까지 ArrayList에 담고 짝수만 출력
//		IntStream.range(0, 10).map(StreamTask::minus10).filter(StreamTask::checkEven).forEach(System.out::println);
		
//		1 ~ 100까지 중 홀수만 ArrayList에 담고 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		
//		IntStream.range(1, 101).filter(StreamTask::checkOdd).forEach(datas::add);
//		System.out.println(datas.stream().filter(StreamTask::checkEven).collect(Collectors.toList()).size());
		
//		A ~ F까지 중 D제외하고 ArrayList에 담고 출력
//		5번 반복(0 ~ 4)
//		삼항 연산자를 사용해서 D부터 1씩 더 증가
//		forEach에서 (char)로 강제 형변환하여 출력
//		IntStream.range(0, 5)
//			.map((data) -> data > 2 ? data + 66 : data + 65)
//				.forEach((data) -> System.out.println((char)data));
		
//		심화 실습
//		5개의 문자열을 모두 소문자로 변경("Black", "WHITE", "reD", "yeLLow", "PINk")
//		toLowerCase()를 참조형으로 활용해보자!
		
//		"Apple", "banana", "Melon" 중 첫 번째 문자가 대문자인 문자열 출력
//		ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
//		datas.stream().filter((data) -> data.charAt(0) >= 'A').filter((data) -> data.charAt(0) <= 'Z').forEach(System.out::println);;
		
//		박정근 작품(Good~!)
//		datas.stream().filter((data) -> data.charAt(0) <= 'Z').forEach(System.out::println);
		
//		한글을 정수로 변경
//		입력 예) 일공이사
//		출력 예) 1024
//		인덱스로
		
		String transform = "공일이삼사오육칠팔구";
		System.out.println(transform);
		
		"일공이사".chars().map((data) -> transform.indexOf(data)).forEach(System.out::print);;
		
		System.out.println("\n========================");
//		정수를 한글로 변경
//		입력 예) 1024
//		출력 예) 일공이사
//		몫으로
		
		String Kor = "공일이삼사오육칠팔구";
		"1024".chars().forEach(System.out::print);
		System.out.println("\n========================");
		"1024".chars().map(number -> number-48).forEach(number -> System.out.print(Kor.charAt(number)));
		System.out.println("\n========================");
		"1024".chars().map(number -> number-48).forEach(System.out::print);
		System.out.println("\n========================");
//		1024를 1,0,2,4 로  분리
//		이거는 문자 1로 보고 푸는 문제.
		int number = 1024;



		
	}
}


















