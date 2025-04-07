package map.test;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
			HashMap<String, Object> userMap = new HashMap<String, Object>();
			
			userMap.put("id", 1);
			userMap.put("email", "test@gmail.com");
			userMap.put("password", "qwer1234");
			userMap.put("age", 20);
			System.out.println(userMap);
			
			userMap.put("age", 15);
			System.out.println(userMap);
			System.out.println(userMap.get("age"));
			
	}
}
