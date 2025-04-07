package k_bank;
// 입금 시 수수료 30%
public class Kookmin extends Bank{
	@Override
	public void deposit(int money) {
		money *= 0.7;
		super.deposit(money);
		
	}
}
