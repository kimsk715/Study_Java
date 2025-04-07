package inhTest;

class Hero {
	int hp;
	int dmg;
	
	public Hero() {;}
	public Hero(int hp, int dmg) {
		this.hp = hp;
		this.dmg = dmg;
	}

	void getDmg(int dmg) {
		this.hp -= dmg;
	}
	int attack(){
		return dmg;	
	}
}

class Thor extends Hero {
	int hammerCount;
	int shieldCount;
	  
	public Thor(int hp, int dmg, int hammerCount, int shildCount) {
	      super(hp, dmg);
	      this.hammerCount = hammerCount;
	      this.shieldCount = shildCount;
	   }

	@Override
	void getDmg(int dmg) {
		if(shieldCount<=0) {
		super.getDmg(dmg);
		return;
		}
		dmg -= shieldCount;
		super.getDmg(dmg);
		shieldCount--;
	}
	
	@Override
	int attack() {
		int dmg = super.attack();
		
		if(hammerCount>0) {
			dmg = hammerCount == 1 ? dmg + 1 : (dmg*hammerCount);
			hammerCount--;
			return dmg;
		}
		return dmg;
	}
}

class Azir extends Hero {
	int mana;
	int soldier;
	
	public Azir(int hp, int dmg, int mana, int soldier) {
		super(hp, dmg);
		this.mana = mana;
		this.soldier = soldier;
	}
	
	@Override
	void getDmg(int dmg) { // 데미지를 받을 때 병사 수에 따라 데미지를 감소시키고 병사를 하나 소모.
		System.out.print("피격 x_x ");
		if(soldier !=0) {
			dmg *= (double)(100-soldier*5)/100; 
			super.getDmg(dmg);
			soldier--;
		}
	}
	
	int summonSoldier() { // MP를 소모하여 병사 소환
		System.out.print("전사 소환! ");
		if(mana >= 100) {
			soldier++;
			mana -= 100;
		}
		else {
		System.out.println("마나가 부족합니다."); // 스킬 사용 시 마나 부족하면 경고 출력.
		}
		return soldier;
	}
	
	@Override
	int attack() {
		int dmg = super.attack();
		if(soldier >= 1 && mana >= 200) {
			dmg *= soldier+1;
			mana -= 200;
			return dmg;
		}
		return dmg;
	}
	
}

public class InhTest03 {
	public static void main(String[] args) {
		Thor thor = new Thor(10,5,2,2);
		thor.getDmg(10);
		
//		System.out.println(thor.hp);
//	      System.out.println(thor.shieldCount);
//	      
//	      System.out.println("입힌 데미지: " + thor.attack());
//	      System.out.println(thor.hammerCount);
//	      System.out.println("입힌 데미지: " + thor.attack());
//	      System.out.println(thor.hammerCount);
//	      System.out.println("입힌 데미지: " + thor.attack());
//	      System.out.println(thor.hammerCount);
//		
//		HP, 공격력, MP, 병사 수
//		병사 소환
//		병사 있을 때 MP 소모하고 데미지 증가(병사 수 비례)
//		병사 있을 때 병사 소모해서 데미지 감소
//		병사 소환 및 공격 스킬 사용 시에는 현재 마나 < 사용 마나 일 경우 사용 X 혹은 기본 공격
		
		Azir azir = new Azir(1000,50,800,4);
		azir.summonSoldier();
		System.out.println("남은 병사수 " + azir.soldier); // 병사 소환했으므로 4 --> 5
		azir.getDmg(50); // 한 대 맞음.
		System.out.println("HP : " + azir.hp); // 받는 데미지 감소하고 병사 하나 감소(5-->4)
		System.out.println("남은 병사수 " + azir.soldier); // 4
	    System.out.println("입힌 데미지: " + azir.attack());
	    System.out.println("MP : " + azir.mana);
	    azir.getDmg(50);
	    azir.getDmg(50);
	    azir.getDmg(50);// 피격 했으므로
	    System.out.println("남은 병사수 " + azir.soldier); // 병사 수 4 --> 3
	    System.out.println("입힌 데미지: " + azir.attack());
	    System.out.println("MP : " + azir.mana); // 계속된 스킬 사용으로 마나가 300까지 감소
	    System.out.println("입힌 데미지: " + azir.attack()); // 마지막으로 MP 소모하고
	    System.out.println("MP : " + azir.mana); // 스킬에 필요한 MP보다 적으므로
	    System.out.println("입힌 데미지: " + azir.attack()); // 기본 공격만큼의 데미지만 들어감.
	    System.out.println("MP : " + azir.mana);
	    System.out.println("입힌 데미지: " + azir.attack());
	    System.out.println("MP : " + azir.mana);
	    azir.summonSoldier();
	    System.out.println("남은 병사수 " + azir.soldier);
	    azir.summonSoldier();
		
	}
}
