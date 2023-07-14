package abc;

        /* 다음 Thread 클래스는 내부에 Thread.sleep()메서드를 호출하고있다.
           이때 다음과 같이 외부에서 interup()메서드를 호출할때 실행 결과를 쓰시오  */

class MyThread3 extends Thread {
    public void run() {
        try {
            System.out.println("첫번째 출력");
            Thread.sleep(1000);
            System.out.println("두번째 출력");
            Thread.sleep(1000);
            System.out.println("세번째 출력");
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println("쓰레드 종료");
        }
    }
}
public class Ex07 {
    public static void main(String[] args) {
        MyThread3 mt = new MyThread3();
        mt.start();
        try {Thread.sleep(1500);} catch (InterruptedException e) {}
        mt.interrupt();
    }
}
