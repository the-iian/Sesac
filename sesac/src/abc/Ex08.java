package abc;

        /* 클래스 MyData 내부에 "A"와 "B"를 출력하는 메서드를 1개씩 포함하고있다.
           ThreadA와 ThreadB는 각각 MyData 내의 메서드를 0.5초 간격으로 5번 호출하는 클래스다.
           이때 다음 코드의 실행결과가 A → B → A → B 와 같이 순서대로 나오도록 코드를 완성하라 */

class MyData3 {
    boolean flag = false;
    synchronized void printA() {

         if(flag)
             try { wait(); } catch (InterruptedException e) {}
        System.out.println("A");
         flag=true;
         notify();
    }
    synchronized void printB() {

        if(!flag)
            try{wait();} catch (InterruptedException e) {}
        System.out.println("B");

        flag = false;
        notify();
    }
}

class ThreadA extends Thread {
    MyData3 myData3;

    public ThreadA(MyData3 myData3) {
        this.myData3 = myData3;

    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            myData3.printA();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }

    static class ThreadB extends Thread {
        MyData3 myData3;

        public ThreadB(MyData3 myData3) {
            this.myData3 = myData3;
        }

        public void run() {
            for (int i = 0; i < 5; i++) {
                myData3.printB();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }

        public static void main(String[] args) {
            MyData3 myData3 = new MyData3();
            Thread t1 = new ThreadA(myData3);
            Thread t2 = new ThreadB(myData3);

            t1.start();
            t2.start();
        }
    }
