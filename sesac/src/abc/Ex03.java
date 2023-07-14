package abc;

/* 현재 쓰레드의 객체 참조 방법과 실행 쓰레드의 갯수 그리고 쓰레드의 이름을 지정하거나 가져오는 기능을 포함한 코드다.
   실행 결과를 쓰시오    */
public class Ex03 {
    public static void main(String[] args) {

        // 현재 쓰레드 객체 가져오기 + 쓰레드 이름 가져오기 + 쓰레드의 갯수
        Thread curThread = Thread.currentThread();
        System.out.println(curThread.getName());
        System.out.println(curThread.activeCount());

        // 새로운 쓰레드 생성 + 쓰레기 이름 가져오기
        Thread t1 = new Thread();
        System.out.println(t1.getName());

        // 두번째 쓰레드 생성 + 쓰레드 이름 설정 + 쓰레드 이름 가져오기
        Thread t2 = new Thread();
        t2.setName("두 번째 쓰레드");
        System.out.println(t2.getName());
    }
}
