package abstractTest;

public abstract class Electronics {
//	무조건 재정의 해야 됨.
	abstract public void on();
	abstract public void off();
	
//	골라서 재정의
	public void printProduct() {
		System.out.println("전자제품");
	}
	
//	재정의 불가능.
	public final void sos(){
		System.out.println("긴급 전화");
	}	
}
