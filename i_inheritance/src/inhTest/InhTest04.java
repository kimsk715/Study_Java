package inhTest;

import java.util.Random;

class Job{
	int money;
	public Job() {
	}

	public Job(int money) {
		super();
		this.money = money;

	}

}
// 트페
// 미니언 처치 시 +1~6 골드 추가 획득
// 미니언 처치는 기본 +10골드로 가정.
// 획득한 골드를 money(보유금액)에 추가.
// 

class TF extends Job{
	int gold;
	int[] arData; // 랜덤을 구현하기 위한 배열.
	Random random = new Random(); 
	public TF() {;}
	public TF(int money, int gold, int[] arData) {  // money는 
		super(money);
		this.gold = gold;
		this.arData = arData;
	}
	int Passive() { // 정해진 비율로 총 6가지 결과물을 int 형태로 return
		gold = 10; //한 번 실행하고 나면 추가 획득량이 반영된 결과이므로, 초기값(10)으로 초기화
//		임의로 정한 확률
		int rating1 = 3; 
		int rating2 = 3;
		int rating3 = 3;
		int rating4 = 3;
		int rating5 = 3;
		int rating6 = 3;
	    int[] arData = new int[18]; // 총 18개
	    int temp = 0;  // for문 범위를 위한 변수. 없어도 되지만, 맨 뒤에 가면 rating1~6를 모두 더한 값이 되므로, 코드 길이를 위해 temp로 지정해줌.
	      for(int i = 0; i < rating1; i++) {
	         arData[i] = 1;  
	      }
	      temp += rating1; // for문 범위를 rating1 만큼 뒤로 밀어줌.
	      for(int i = temp; i < temp+rating2; i++) {
		         arData[i] = 2;
		      }
	      temp += rating2;
	      for (int i = temp; i < temp+rating3; i++) {
		         arData[i] = 3;
		      }
	      temp += rating3;
	      for (int i = temp; i < temp+rating4; i++) {
		         arData[i] = 4;
		      }
	      temp += rating4;
	      for (int i = temp; i < temp+rating5; i++) {
		         arData[i] = 5;
		      }
	      temp += rating5;
	      for (int i = temp; i < temp+rating6; i++) {
		         arData[i] = 6;
		      }
//	      이렇게 하면 1 .... 2 .... 3 .... 4 .... 5 .... 6 .... 의 형식으로 채워짐.
//	      for (int i = 0; i < arData.length; i++) {
//		         System.out.println(arData[i]);
//		      }
//	      랜덤 배열 확인용
	  		switch(arData[random.nextInt(arData.length)]) { // 각 숫자만큼 지급금액(gold) 값에 추가)
	  	      case 1:
	  	    	  gold +=1;
	  	    	  break;
	  	      case 2:
	  	    	  gold +=2;
	  	    	break;
	  	      case 3:
	  	    	  gold +=3;
	  	    	break;
	  	      case 4:
	  	    	  gold +=4;
	  	    	break;
	  	      case 5:
	  	    	  gold +=5;
	  	    	break;
	  	      default:
	  	    	  gold +=6;
	  	    	break;
	  	      }
	  		money += gold; // 현재 보유 금액에 기본 지급액 + 추가 지급액 만큼을 추가.
//	  		System.out.println(arData[random.nextInt(arData.length)]); // 제대로 랜덤값이 돌아가는지 체크
	  		return money; // 현재 보유 금액을 return
	  	}	
	}
//	카지노의 사기 딜러가 있다.
//	만약 승률이 50%이하로 떨어지면 50% 위로 올라가도록 확률 알고리즘을 짜고,
//	반복 시행을 통해 이득을 보자!

class Dealer extends Job{
	
	int[] arRandom;
	int winrate;
	public Dealer() {;}
	public Dealer(int money, int[] arRandom, int winrate) {
		super(money);
		this.arRandom = arRandom;
		this.winrate = winrate;
	}
	

}
public class InhTest04 {
	public static void main(String[] args) {
//		Random random = news Random();
	      
	      
	      TF tf = new TF();
	      for(int i=0; i<50; i++) {
	    	  tf.Passive();
		      System.out.println(tf.money+" Gold " + tf.gold + " Gold 획득!");
	      }
	  
	      
	      
	}
}
