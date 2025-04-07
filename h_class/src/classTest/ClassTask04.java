package classTest;
//	회원
//	아이디, 이름, 이메일, 비밀번호

//	프로필 사진
//	경로, 파일 이름, 파일 크기(KB), 대표 이미지(status)

//	화면
//	회면 1명당 2개의 프로필 사진
//	회원의 정보를 출력할 때, 대표 이미지만 출력
public class ClassTask04 {
	public static void main(String[] args) {
		
		CustomerInfo han = new CustomerInfo(1, "한동석", "tedhan@gmail.com", "abcd");
		Profile[] arProfile = {
				new Profile("C\1", "han01",10 , false),
				new Profile("C\2", "han02",15 , true)
				}; 
		PrintProfile kim = new PrintProfile(arProfile);
		kim.printInfo(han,arProfile);
	}
}
