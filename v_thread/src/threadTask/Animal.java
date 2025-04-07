package threadTask;
//[실습]
//		   동석이네 동물원에는 3마리의 동물이 있다.
//		   각 동물은 울음 소리가 다르고 2마리의 동물은 동시에 운다.
//		   나머지 1마리 동물은 2마리 동물이 모두 울고 나면 마지막에 운다.
//
//		   패키지명: threadTask
//
//		   ※ 클래스는 2개만 선언한다.
//		   ※ 반드시 join()을 사용한다.
//		   ※ 각 동물은 10번씩만 운다.
//		   ※ 람다식을 사용한다.
public class Animal/* implements Runnable */{
//  @Override
//  public void run() {
//     for (int i = 0; i < 10; i++) {
//        System.out.println(Thread.currentThread().getName());
//        try {Thread.sleep(500);} catch (InterruptedException e) {;}
//     }
//  }
  public void makeSound(Runnable runnable) {
     String[] arSound = {"어흥", "음메", "야옹"};
     Thread[] arThread = new Thread[arSound.length];
     
     for (int i = 0; i < arThread.length; i++) {
        arThread[i] = new Thread(runnable, arSound[i]);
     }
     
     for (int i = 0; i < arThread.length; i++) {
        arThread[i].start();
        if(i != 0) {
           try {arThread[i].join();} catch (InterruptedException e) {;}
//         1번째 반복에는 start, 2번째 반복에서는 start 후 join 하므로,
//         1~2번째는 진행하고, 다 끝난 뒤에 3번째 반복이 실행. 
//         멈추는 행동(sleep) 에는 interrupt 로 중지할 수 있으므로,
//         InterruptedException를 통해 try/catch 로 묶어줌.
        }
     }
  }
}
















