package classTest;
//프로필 사진
//경로, 파일 이름, 파일 크기(KB), 대표 이미지(status)
public class Profile {
	

	String path;
	String fileName;
	int fileCap;
	boolean status; //체크는 t/f 로 구별 
	
	public Profile() {;}
	public Profile(String path, String fileName, int fileCap, boolean status) {
		this.path = path;
		this.fileName = fileName;
		this.fileCap = fileCap;
		this.status = status;
	}
	
}
