package classTest;

public class PrintProfile {
	Profile[] profile;
	public PrintProfile() {;}
	public PrintProfile(Profile[] profile) {
		this.profile = profile;
		}
	
	void printInfo(CustomerInfo customerInfo, Profile[] profile){
		for(int i=0; i<profile.length; i++) {
		if(profile[i].status) {
			System.out.println(customerInfo.id + " "+ customerInfo.email +" "+customerInfo.name);
			System.out.print(profile[i].fileName);
			}
		}
	}
}
