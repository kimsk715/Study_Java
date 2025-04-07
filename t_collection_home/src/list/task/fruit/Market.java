package list.task.fruit;
import java.util.List;

import list.task.DBConnecter;
public class Market {
	public static Long id;
//	과일 추가
	public void addFruit(Fruit fruit) {
		DBConnecter.fruits.add(fruit);
	}
//	과일 삭제(값 또는 인덱스)
	public void removeFruit(Fruit fruit) {
		DBConnecter.fruits.remove(fruit);
	}
//	과일이름  중복검사
	public Fruit checkName(String name) {
		for(Fruit fruit : DBConnecter.fruits) {
			if(fruit.getName().equals(name)) {
				return fruit;
			}
		}
		return null;
	}
	
//	과일 가격이 평균 가격보다 낮은 지 검사
//	과일 가격을 받아온다.
//	DB에 있는 과일 개수?
	public double fruitAveragePrice() {
		int temp = 0;
		
		for(Fruit fruit : DBConnecter.fruits) {
			temp += fruit.getPrice();
//			과일 가격들의 합.
		}
		double average = temp/DBConnecter.fruits.size();
		return average;
	}
	
//	평균 가격보다 낮으면 true, 높으면 false.
//	
	public boolean checkFruitPrice(String name) {
		int tempprice = findFruitPrice(name);
			if(tempprice < fruitAveragePrice()){
				return true;
			}
		return false;
	}
	
	
//	과일 전체 조회
	 public List<Fruit> findAll(){
	      return DBConnecter.fruits;
	   }

//	과일 이름으로 가격 조회
//	이름을 받는다.
//	리턴 값은 그 과일의 가격.
	
	public int findFruitPrice(String name) {
		for(Fruit fruit : DBConnecter.fruits) {
//			만약 입력한 이름과 같다면,
//			checkName 활용.
			if(fruit.getName().equals(name)) {
//				
				return fruit.getPrice();
			}
		}
		return -1;
	}
	
}
