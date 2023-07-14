package abc;

    /* Runnable 인터페이스를 구현한 클래스 MyRunnable이 있다.
       이때 새로운 쓰레드 객체를 생성하고 쓰레드를 실행하는 코드를 작성하라
       (참조 변수명은 자유 작성 가능)    */

class MyRunnable implements Runnable {
    public void run() {
        for (int i=1; i<=5; i++) {
            try {Thread.sleep(1000);} catch (InterruptedException e) {}
            System.out.println(i + "초");
        }
    }
}
public class Ex02 {
    public static void main(String[] args) {
        // MyRunnable 객체를 이용한 쓰레드의 실행
        MyRunnable myrunnable = new MyRunnable();
        Thread thread = new Thread(myrunnable);
        thread.start();
    }
}
