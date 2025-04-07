package exceptionTest;
// 사용자 예외는 발생시키는 순간 try ~ catch로 잡아서 처리해야 함.
//

// RuntimeException을 사용하면,
// 사용자 예외는 발생시키는 순간 try ~ catch를 강제하지 않음.
public class NicknameException extends Exception {
	public NicknameException() {;}
	
	public NicknameException(String message){
		super(message);
	}
}
