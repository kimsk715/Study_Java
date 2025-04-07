package list.task.product;

import java.util.Objects;

public class Customer {
	private static Long seq;
	private Long id;
	private String name;
	private int money;

	static {
		seq = 0L;
	}
	
	{
		id = ++seq;
	}

	public Customer() {;}
	public Customer(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", money=" + money + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(money, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return money == other.money && Objects.equals(name, other.name);
	}
	
	
}


	