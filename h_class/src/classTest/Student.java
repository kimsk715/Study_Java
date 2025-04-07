package classTest;
//	학생 번호
//	과목들
//	총점

public class Student {
	Long id;
	Subject[] arSubject;
	int total;
	double average;
	
	public Student(Long id, Subject[] arSubject, int total, double average) {
		this.id = id;
		this.arSubject = arSubject;
		
		if(arSubject != null) {
			for(int i=0; i < arSubject.length; i++) {
				this.total += arSubject[i].grade;
			}
			this.average = (double)this.total / arSubject.length;
			this.average = Double.parseDouble(String.format("%.2f", this.average));
		}
	}
}
