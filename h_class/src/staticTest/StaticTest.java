package staticTest;

class Data{
	int data;
//	생성자가 아닌 컴파일러가 메모리에 할당.
//	즉, 생성자 호출에 영향을 받지 않음.
//	클래스당 단 1개만 만들어지므로, 모든 객체가 공유할 수 있음.
//	모든 객체가 공유해야 하는 필드가 있다면, static.
	static int dataS;
	public Data(int data) {
	this.data = data;
	}
	public Data() {;}
	
	void increase() {
		System.out.println(++data);
	}
	
	void increaseS() {
		System.out.println(++dataS);
	}
	
}

public class StaticTest {
	public static void main(String[] args) {
		Data data = new Data();
		data.increase();
	      data.increase();
	      data.increase();
	      data.increase();
	      data.increase();
	      
	      data = new Data();
	      
	      data.increase();
	      data.increase();
	      data.increase();
	      data.increase();
	      data.increase();
	      
	      System.out.println("====================");
	      
	      data.increaseS();
	      data.increaseS();
	      data.increaseS();
	      data.increaseS();
	      data.increaseS();
	      
	      data = new Data();
	      
	      data.increaseS();
	      data.increaseS();
	      data.increaseS();
	      data.increaseS();
	      data.increaseS();

	}
	
	
		
}
