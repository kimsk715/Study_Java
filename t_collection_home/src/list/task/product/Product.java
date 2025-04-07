package list.task.product;

import java.util.Objects;

//[ArrayList 숙제]
//		상품 클래스
//		- 상품명
//		- 가격
//		- 재고
//

public class Product {
	private String name;
	private int price;
	private int stack;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStack() {
		return stack;
	}
	public void setStack(int stack) {
		this.stack = stack;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", stack=" + stack + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && price == other.price && stack == other.stack;
	}
	
	
	
}
