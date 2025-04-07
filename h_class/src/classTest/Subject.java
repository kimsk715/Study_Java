package classTest;
//	국,영,수 점수
//	과목명

public class Subject {
//	점수 3개 = 배열
//	과목명 = 배열
//	점수 + 과목명 = 클래스로 정의
	
	int grade;
	String subject;
	
	public Subject () {};
	Subject(int grade, String subject ){
		this.grade = grade;
		this.subject = subject;
	}
}
