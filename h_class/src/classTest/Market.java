package classTest;

class Market{
	Product[] arProduct;
	public Market() {;}
	public Market(Product[] arProduct) {;}
	
	void sell(Customer customer, int choice) {
	customer.account -= arProduct[choice].price*(100-customer.discountrate)/100;
	arProduct[choice].inventory--;

	}
	}