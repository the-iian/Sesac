package abc;

        /* Thread 클래스를 상속한 클래스 MyThread가 있다.
           이때 새로운 쓰레드 객체를 생성한 후 쓰레드를 실행하는 코드를 작성하라
           (참조 변수명은 자유롭게 작성 가능)         */

        class MyThread extends Thread {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    System.out.println(i + "초");
                }
            }
        }
            public class Ex01 {
                public static void main(String[] args) {
                    // MyThread 객체를 이용한 쓰레드의 실행

                    MyThread mythread = new MyThread();
                    mythread.start();
                }
            }


