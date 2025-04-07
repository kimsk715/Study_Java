package castingTest;

class Car {
	String brand;
	String color;
	int price;
	public Car() {;}
	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	void engineStart(){
		System.out.println("시동 켜기");
	}
	void engineStop(){
		System.out.println("시동 끄기");
	}
}

class SuperCar extends Car{
	String mode;
	
	@Override
	void engineStart() {
		// TODO Auto-generated method stub
		System.out.println("음성으로 시동켜기");
	}
	void openRoof() {
		System.out.println("뚜따");
	}
}
public class CastingTest01 {
	public static void main(String[] args) {
//		upcasting
		Car noOptionFerrari = new SuperCar();
//		downcasting
		SuperCar fullOptFerrari = (SuperCar) noOptionFerrari;
//		SuperCar brokenFerrari = (SuperCar)new Car(); 문법상 ok 지만, 구현할 수 없기 때문에 오류.
		System.out.println(noOptionFerrari instanceof Car);
		System.out.println(noOptionFerrari instanceof SuperCar);
//		Car Benz = new Car();
//		Benz.engineStart();
	}
}
