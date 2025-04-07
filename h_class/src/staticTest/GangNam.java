package staticTest;

public class GangNam {
	public static void main(String[] args) {
		Company park =  new Company("park",0);
		Company kim =  new Company("kim",0);
		Company jung =  new Company("jung",0);
		
		park.income += 3000;
		kim.income -= 1000;
		jung.income = 0;
		Company.totalIncome = park.income + kim.income + jung.income;
		
		System.out.println(Company.totalIncome); // 모두가 똑같은 값에 접근할 때, Static 방식.
	}
}
