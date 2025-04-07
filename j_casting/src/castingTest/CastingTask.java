package castingTest;
//	넷플릭스
//	애니, 영화, 드라마 클래스 모두 영상

//	자막 지원 기능
class Animation extends Video{
//	public Animation(){;}
	void getCaption() {
		System.out.println("자막 지원");
	}
}
//	4D 기능.
class Film extends Video{
//	public Film(){;}
	void get4D() {
		System.out.println("4D 지원");
	}
}
//	굿즈 기능
class Drama extends Video{
//	public Drama(){;}
	void getGoods() {
		System.out.println("굿즈 지원");
	}
}
public class CastingTask {
	Video video;
	Video animation = new Animation(); // upcasting.
	Video film = new Film();
	Video drama = new Drama();
	Animation ani  = (Animation) animation;
	Film fi = (Film) film;
	Drama dr = (Drama) drama;
//	Animation ani = (Animation)video;
//	Film fi = (Film)video;
//	Drama dr = (Drama)video;
	void getService(String choice) {
	     if(choice == "Animation"){
	    	 ani.getCaption();
//	    	 System.out.println("1");
//	    	 애니 실행
	     }
	     else if(choice == "Film"){
	    	 fi.get4D();
//	    	 System.out.println("2");
//	    	 영화 실행
	     }
	     else if(choice == "Drama"){
	    	 dr.getGoods();
//	    	 System.out.println("3");
//	    	 드라마 실행
	     }
	     else {
	    	 System.out.println("다시 입력해주세요!");
	    	 return;
	     }
//	     사용자의 선택
//	     각각 실행해주기
	   }
	
	public static void main(String[] args) {
		CastingTask casting = new CastingTask();
		casting.getService("Animation");
	}
}

//void getService(Video video) {
//    if(video instanceof Animation) {
//       Animation animation = (Animation)video;
//       animation.getCaption();
//    }else if(video instanceof Film) {
//       Film film = (Film)video;
//       film.get4D();
//    }else if(video instanceof Drama) {
//       Drama drama = (Drama)video;
//       drama.getGoods();
//    }
// }
//
// public static void main(String[] args) {
//    new CastingTask().getService(new Animation());
// }
//}








