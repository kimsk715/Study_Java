package abstractTest;

public class Refrigerator extends Electronics {

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("버튼 위로 올려서 전원 켜기");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("버튼 아래로 올려서 전원 끄기");
	}

}
