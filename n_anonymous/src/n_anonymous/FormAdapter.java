package n_anonymous;

public abstract class FormAdapter implements Form{
	public void sell(String order){;}

//	판매 방식은 지점의 상태에 따라 다름.
//	sell은 구현해서 강제성 소멸.
//	판매 목록은 반드시 필요하므로 넘김.
}
