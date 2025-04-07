package list.task.product;
import java.util.List;
import list.task.DBConnecter;
//상품 서비스
//- 상품 추가
//- 상품 조회
//- 상품 목록
//- 상품 수정
//- 상품 삭제
public class Market {
	
	public void add(Product product) {
		DBConnecter.products.add(product);
	}
	
	public Product find(String name) {
		for(Product product : DBConnecter.products) {
			if(product.getName().equals(name)) {
				return product;
			}
		}
	return null;
	}
	
	public List<Product> allProduct(){
		return DBConnecter.products;
	}
	
	public void update(Product newProduct) {
		Product product = find(newProduct.getName());
				
		if(product != null) {
			
			product.setPrice(newProduct.getPrice());
			product.setStack(newProduct.getStack());
		}
	}
	
	public void delete(Product newProduct) {
//		이름으로 상품을 찾는다
		Product product = find(newProduct.getName());
//		만약 상품을 찾았다면
//		ArrayList에서 그 상품 remove
		if(product !=null) {
			DBConnecter.products.remove(product);
		}
	}
	
	public void join(Customer customer) {
		DBConnecter.customers.add(customer);
	}
	
	public Customer findCustomer(String name) {
		for(Customer customer : DBConnecter.customers) {
			if(customer.getName().equals(name)) {
				return customer;
			}
		}
	return null;
	}
	
	public List<Customer> allCustomer(){
		return DBConnecter.customers;
	}
	
	
	public void sell(String productname, String customername) {
		Product product = find(productname);
		Customer customer = findCustomer(customername);
		int tempMoney = customer.getMoney(); 
		tempMoney -= product.getPrice();
		int count = product.getStack();
		count--;
		customer.setMoney(tempMoney);
		product.setStack(count);
	}
}
