package lambdaTask;
@FunctionalInterface
public interface OperCheck {
// 문자열(수식)을 받아서 연산자들을 추출한 뒤 리턴하는 메소드
	public String[] getOpers(String expression);
}
