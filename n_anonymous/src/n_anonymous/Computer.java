package n_anonymous;

public class Computer {
	public static void main(String[] args) {
//		up casting
		Game rpg = new Game()
//			여기부터 익명 클래스
			{
//			구현되지 않은 필드들
			@Override
				public void play() {
				// TODO Auto-generated method stub
				
				}

			@Override
				public void exit() {
				// TODO Auto-generated method stub
				}
			};
//			여기까지 익명 클래스
	}
}