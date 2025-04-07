package list.task.food;

import java.util.ArrayList;
import java.util.List;

import list.task.DBConnecter;
import list.task.food.Food;

public class Restaurant {
//	- 음식 추가
	public void add(Food food) {
		DBConnecter.foods.add(food);
	}
//	이름으로 음식 찾기.
	public Food findByName(String name) {
		for(Food food : DBConnecter.foods) {
			if(food.getName().equals(name)) {
				return food;
			}
		}
		return null;
	}
	
//	- 음식 이름으로 음식 종류 조회
//	이름을 받음.
	public String findCategoryByName(String name) {
//			이름 비교
			Food newFood = findByName(name);
			if(newFood !=null) {
				return newFood.getCategory();
//				음식 종류를 리턴.
			}
//		일치하는 이름이 없는 경우.
		return null;
	}
	
//	- 사용자가 원하는 종류의 음식 전체 조회
	public List<Food> findByCategory(String category){
		ArrayList<Food> result = new ArrayList<Food>();
		for(Food food : DBConnecter.foods) {
			if(food.getCategory().equals(category)) {
				result.add(food);
			}
		}
		return result;
	  }
	

//	- 음식 종류 수정 후 가격 10% 상승
//	이름을 입력받음.
//	해당 음식의 카테고리를 수정.(입력)
//	가격 상승.
//	리턴.

	public void update(Food newFood) {
//		이름으로 음식정보 불러옴.
		Food food = findByName(newFood.getName());
//		카테고리 새로 설정.
		food.setCategory(newFood.getCategory());
		food.setPrice((int)(newFood.getPrice()*1.1));
	}
	
//	- 사용자가 원하는 종류의 음식 개수 조회	
	public int foodCount(String category) {
		int count = 0;
		for(Food food : DBConnecter.foods) {
			if(food.getCategory().equals(category)) {
				count ++;
			}
		}
		return count;
	}

//---------------------------------------
}
