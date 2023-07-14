package abc;
    /* 클래스 MyData내의 modifyData() 메서드는 동기화되있다.
       다음 코드의 실행 결과를 작성하시오 */

class MyData {
    int data;
    synchronized void modifyData() {
        data++;
    }
}
class MyThread2 extends Thread {
    MyData myData;
    public MyThread2(MyData myData) {
        this.myData = myData;
    }
    public void run() {
        for (int i=0; i<10000; i++) {
            myData.modifyData();
        }
        System.out.println(myData.data);
    }
}
public class Ex05 {
    public static void main(String[] args) {
        MyData md = new MyData();
        MyThread2 mt1 = new MyThread2(md);
        mt1.start();
        // 쓰레드 준비 과정 + 동기화 준비 과정을 위한 짧은 시간
        try {Thread.sleep(100);} catch (InterruptedException e) {}
        MyThread2 mt2 = new MyThread2(md);
        mt2.start();
    }
}
