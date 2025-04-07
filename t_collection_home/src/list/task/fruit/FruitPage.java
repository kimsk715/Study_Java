package list.task.fruit;

import list.task.DBConnecter;

public class FruitPage {
	public static void main(String[] args) {
		Market market = new Market();
		Fruit fruit = new Fruit();
		double averagePrice = 0;
//		임의로 과일 3종류 등록.
		fruit.setName("딸기");
		if(market.checkName(fruit.getName()) == null) {
			fruit.setPrice(1000);
			market.addFruit(fruit);
		}
		
		fruit = new Fruit();
		fruit.setName("바나나");
		if(market.checkName(fruit.getName()) == null) {
			fruit.setPrice(2000);
			market.addFruit(fruit);
		}
		
		fruit = new Fruit();
		fruit.setName("사과");
		if(market.checkName(fruit.getName()) == null) {
			fruit.setPrice(1200);
			market.addFruit(fruit);
		}
		
		averagePrice = market.fruitAveragePrice();
		System.out.println(averagePrice);
		
		boolean check = false;
		
		for(Fruit checkfruit : DBConnecter.fruits) {
			check = market.checkFruitPrice(checkfruit.getName());
			System.out.println(check);
			if(check) {
				System.out.println(checkfruit);
			}
		}
		System.out.println(market.findAll());
	}
		
	
}
