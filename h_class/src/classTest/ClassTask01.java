package classTest;
//	자동차 클래스 선언
//	브랜드, 색상, 가격
//	시동 켜기, 시동 끄기
//	각 메소드는 브랜드명을 활용하여, 아래와 같이 출력
//	브랜드 시동 켜짐, 꺼짐
//	초기화된 브랜드명을 "브랜드" 자리에 넣어서 출력


class Car{
	int id;
	String brand;
	String color;
	int price;
//	브랜드, 색상, 가격 필드 선언.
	
	void on() {
		System.out.println(brand + " 시동 켜짐");
	}
	
	void off() {
		System.out.println(brand + " 시동 꺼짐");
	}
	
//	Alt + shift + s,o
//	초기화할 필드 선택 후 엔터!
//	기본 생성자
//	반드시 기본 생성자를 선언. 무. 조. 건
	Car(){}
	
	Car(String brand, String color,	int price){
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
}

// 	2147483647
//	인트 최대

public class ClassTask01 {
	public static void main(String[] args) {
		Car mycar = new Car("벤츠","검은색", 1000000000);
		Car yourcar = new Car("Kia", "Red", 1020940);
		Car blankcar = new Car();
		
		mycar.on();
		mycar.off();
		yourcar.on();
		yourcar.off();
	}
}
