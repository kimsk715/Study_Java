package wrapperTest;

public class WrapperTask {
	public static void main(String[] args) {
//	1, 3.56, 'A', false, "ABC"
		Object[] arData = {1, 3.56, 'A', false, "ABC"};
		
//		for(int i=0; i<arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		for(Object data: arData) {
			System.out.println(data);
		}
	}
}
