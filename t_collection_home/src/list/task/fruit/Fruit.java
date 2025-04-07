package list.task.fruit;

import java.util.Objects;

public class Fruit {
	private static Long seq;
	private Long id;
	private String name;
	private int price;
	
	static {
		seq = 0L;
	}
	
	{
		id = ++seq;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "Fruit [id=" + id + ", name=" + name + ", price=" + price + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && price == other.price;
	}
}
