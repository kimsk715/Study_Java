package k_bank;
// 잔액 검사 시, 잔고 반토막.
// 어떤 은행인지 필터링하기 위한 객체 3개짜리 배열
//	Bank 타입의 3행짜리 배열을 이용하여 사용자가 선택 은행.
public class Shinhan extends Bank{
	@Override
	public int showBalance() {
		setMoney(getMoney()/2);
//		private이므로 메소드로 간접 접근.
		return super.showBalance();
	}
}
