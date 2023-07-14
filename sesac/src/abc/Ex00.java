package abc;

public class Ex00 {
    public static void main(String[] args) {
        // 47p
        // #.쓰레드 상태
        Thread.State state;

        // #1. 객체생성 (NEW))
        Thread thread = new Thread(){

            public void run() {
                for (long i=0; i<100000000L; i++){}

            }
        };

        state = thread.getState();
        System.out.println("thread State : " + state); // NEW

        // #2. Thread 시작 (RUNNABLE)
        thread.start();
        state = thread.getState();
        System.out.println("thread State : " + state); // RUNNABLE

        // #3. Thread 종료 (TERMINATED)
        try {thread.join();} catch (InterruptedException e){}
        state = thread.getState();
        System.out.println("thread State : " + state); // TERMINATED
    }
}
