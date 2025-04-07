package m_interface;

public class Puppy implements Animal{

	@Override
	public void showHands() {
		// TODO Auto-generated method stub
		System.out.println("멍!");
	}

	@Override
	public void sitDown() {
		// TODO Auto-generated method stub
		System.out.println("멍!");
	}

	@Override
	public void poop() {
		// TODO Auto-generated method stub
		System.out.println("멍?");
	}

	@Override
	public void waitNow() {
		// TODO Auto-generated method stub
		System.out.println("멍!");
	}
	
	public static void main(String[] args) {
		Puppy puppy = new Puppy();
		puppy.waitNow();
	}
}
