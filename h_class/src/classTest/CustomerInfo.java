package classTest;

public class CustomerInfo {
	int id;
	String name;
	String email;
	String password;
//	오버로딩
	public CustomerInfo(){;}
	public CustomerInfo(int id, String name, String email, String password) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
}
