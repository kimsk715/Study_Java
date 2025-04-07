package list.task.food;
import list.task.DBConnecter;
public class FoodPage {
	public static void main(String[] args) {
		Food food = new Food();
		Restaurant restaurant = new Restaurant();
		
		food.setName("스테이크");
		if(restaurant.findByName(food.getName()) == null) {
			food.setPrice(40000);
			food.setCategory("양식");
			restaurant.add(food);
		}	
		
		food = new Food();
		food.setName("불고기");
		if(restaurant.findByName(food.getName()) == null) {
			food.setPrice(10000);
			food.setCategory("한식");
			restaurant.add(food);
		}
		
		food = new Food();
		food.setName("탕수육");
		if(restaurant.findByName(food.getName()) == null) {
			food.setPrice(15000);
			food.setCategory("중식");
			restaurant.add(food);
		}
		
		System.out.println(restaurant.findByCategory("한식").size()); 
		Food newFood = restaurant.findByName("탕수육");
		newFood.setCategory("한식");
		newFood.setPrice(15000);
		restaurant.update(newFood);
		
		
		
		System.out.println(restaurant.findByCategory("한식"));
	}
	
	
	
}
