package abc;

/* 다음은 main 쓰레드내에서 익명 이너클래스 방법으로 쓰레드 객체를 생성해 쓰레드를 실행하는 코드다.
   쓰레드는 데몬 쓰레드로 설정했다. 실행결과를 작성하시오 */

public class Ex04 {
    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run() {
                for (int i=1; i<=5; i++) {
                    try {Thread.sleep(1000);} catch (InterruptedException e) {}
                    System.out.println(i);
                }
            }
        };
        t.setDaemon(true);
        t.start();

        try {Thread.sleep(3500);} catch (InterruptedException e) {}
    }
}
