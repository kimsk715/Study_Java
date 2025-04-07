package apiTest;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class MessageTest {
	public static void main(String[] args) {
		   String api_key = "NCSDSI8AS6LCTQKH";
	       String api_secret = "OJRTBIHZRDTZ9MN0ZJLVAT1MPFAO32JI";
	       Message coolsms = new Message(api_key, api_secret);

	       // 4 params(to, from, type, text) are mandatory. must be filled
	       HashMap<String, String> params = new HashMap<String, String>();
	       params.put("to", "01000000000");
	       params.put("from", "010000000000");
	       params.put("type", "SMS");
	       params.put("text", "택배 문 앞에 놓고 갑니다.");
	       params.put("app_version", "test app 1.2"); // application name and version

	       try {
	         JSONObject obj = (JSONObject) coolsms.send(params);
	         System.out.println(obj.toString());
	       } catch (CoolsmsException e) {
	         System.out.println(e.getMessage());
	         System.out.println(e.getCode());
	       }
	}
}
