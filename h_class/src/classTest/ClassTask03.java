package classTest;

//	화면
//	마트를 오픈해서 상품을 판매하고자 함.
//	손님이 상품을 구매하면, 할인율에 맞게 가격이 조정됨.
//	손님들이 이름, 할인율의 정보를 가지고 있다.

//	쉬움
//	마트는 1개의 상품만 판매
//	상품명, 가격, 재고
//	판매하기

	
	
public class ClassTask03 {
		public static void main(String[] args) {
			
			Customer han = new Customer("한동석", 30, 100000);
			Product[] arProduct = {
				new Product("컴퓨터", 10000, 10),
				new Product("마우스", 5000, 10),
				new Product("키보드", 8000, 10)
			};
			Market korea = new Market(arProduct);
			korea.sell(han,2);
			System.out.println(han.account);
			System.out.println(arProduct[2].inventory);
			
//				
		}
}
