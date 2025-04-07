package classTest;

public class SellAd {
	AdCompany[] adcompany;
	int jesusAccount = 100000;
	String jesusName = "한동석";
	public SellAd(AdCompany[] adcompany, int jesusAccount) {
		this.adcompany = adcompany;
		this.jesusAccount = jesusAccount;
	}

	void sell(CategoryA[] categoryA, CategoryB[] categoryB, CategoryC[] categoryC, AdCompany[] adcompany, int jesusAccount) {
		for(int a=0; a<adcompany.length; a++) {
			for(int i=0; i<categoryA.length; i++) {
				if(categoryA[i].categoryAname == adcompany[a].adCategoryName[0]) {
					for(int j=0; j<categoryB.length; j++) {
						if(categoryA[i].categoryB[j].categoryBname == adcompany[a].adCategoryName[1]) {
							for(int k=0; k<categoryB.length; k++) {
								if(categoryA[i].categoryB[j].categoryC[k].categoryCname == adcompany[a].adCategoryName[2]){
									jesusAccount -= categoryA[i].categoryB[j].categoryC[k].adprice;
								}
							}
						}
					}
				}	
			}
		}
	}
}
