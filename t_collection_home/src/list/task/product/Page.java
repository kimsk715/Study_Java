package list.task.product;
import list.task.DBConnecter;
//[ArrayList 숙제]
//상품 클래스
//- 상품명
//- 가격
//- 재고
//
//상품 서비스
//- 상품 추가
//- 상품 조회
//- 상품 목록
//- 상품 수정
//- 상품 삭제


public class Page {
	public static void main(String[] args) {
		Market coupang = new Market();
		Product product = new Product();
		Customer customer = new Customer();
		
		product.setName("마우스");
		if(coupang.find(product.getName()) == null) {
//			System.out.println(product.getName());
			product.setPrice(100000);
			product.setStack(10);
			coupang.add(product);
		}
	
		
		product = new Product();
		product.setName("키보드");
		if(coupang.find(product.getName()) == null) {
//			System.out.println(product.getName());
			product.setPrice(200000);
			product.setStack(7);
			coupang.add(product);
		}
		
		product = new Product();
		product.setName("모니터");
		if(coupang.find(product.getName()) == null) {
//			System.out.println(product.getName());
			product.setPrice(500000);
			product.setStack(12);
			coupang.add(product);
		}
								
		System.out.println(coupang.allProduct());
		
		Product newProduct = coupang.find("마우스");
		newProduct.setPrice(130000);
		newProduct.setStack(17);
		coupang.update(coupang.find("마우스"));
		 
		System.out.println(coupang.allProduct());
		
		Product newProduct2 = coupang.find("키보드");
		coupang.delete(newProduct2);
		System.out.println(coupang.allProduct());
		
		customer.setName("Kim");
		if(coupang.findCustomer(customer.getName()) == null) {
			customer.setMoney(500000);
			coupang.join(customer);
		}
		
		
		coupang.sell("마우스", "Kim");
		System.out.println(coupang.allProduct());
		System.out.println(coupang.allCustomer());
		
	}
}