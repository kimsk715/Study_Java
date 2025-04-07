package classTest;
//	카테고리
//	대 안에 중, 중 안에 소
	
//	광고회사
//	카테고리 목록(배열), 가격
//	판매하기
//	광고주가 신청한 광고 카테고리와 광고 회사의 카테고리가 일치하면 판매

//	광고주
//	회사명, 잔고
public class ClassTask05 {
	public static void main(String[] args) {
		CategoryC [] arBC1 = {
				new CategoryC("하와이안",5000),
				new CategoryC("무지",5000),
				new CategoryC("패턴",5000)
		};
		CategoryC [] arBC2 = {
				new CategoryC("7부",5000),
				new CategoryC("8부",5000),
				new CategoryC("9부",5000)
		};
		CategoryB [] arAB1 = {
				new CategoryB(arBC1, "셔츠"),
				new CategoryB(arBC2, "바지")
		};
		
		CategoryA [] arA = {new CategoryA(arAB1, "여름"),
				new CategoryA(arAB1, "겨울")};
		
	
//		AdCompany[] adList = new AdCompany {"여름", "셔츠", "하와이안"};
		
//		sell("여름","셔츠","하와이안",100000);
	}
	
}
