package classTest;
// 하나의 public만 존재
class Animal {
	String name;
	int age;
	String feed;
	
	void sleep() {
		System.out.println(name + " 쿨쿨"); // this 생략가능
	}
	
	void introduce() {
		System.out.println(name + ", " + age + ", " + feed);
	}
	
// 	기본 생성자
//	Animal(){
//		System.out.println("기본 생성자 호출");
//	}
	Animal(String name, int age, String feed){
		this.name = name;
		this.age = age;
		this.feed = feed;
//		미리 알고 있는 값을 생성자에 전달함으로써 초기화.
	}
}



public class ClassTest02 {
	public static void main(String[] args) {
		Animal lion = new Animal("사자", 4, "사슴");
		
//		lion.name = "사자";
//		lion.age = 4;
//		lion.feed = "사슴";
		
		lion.sleep();
		lion.introduce();
	}
}
