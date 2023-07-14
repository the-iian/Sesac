package abc;

    /* 6. 쓰레드에서 공유 객체로 사용할 MyData 클래스의 내부에는 메서드 동기화와 블록 동기화가 섞여있다.
       이때 2개의 쓰레드가 공유 객체를 사용할 때 동시 사용 가능 여부를 표기하라 */

    class MyData2 {
        String name = "홍길동";
        synchronized void abc() {
        }
        void bcd() {
            synchronized (this) {
            }
        }
        void cde() {
            synchronized (name) {
            }
        }
    }

    /* Thread1 ㅣ Thread2 ㅣ 동시사용 (가능/불가능)
        abc()  ㅣ  bcd()  ㅣ    불가능
        bcd()  ㅣ  cde()  ㅣ     가능
        cde()  ㅣ  abc()  ㅣ     가능     */

public class Ex06 {

}
