class AA{
    void print1(){
        System.out.println("A클래스 print1");
    }
    void print2(){
        System.out.println("A클래스 print2");
    }
}

class BB extends AA {
    void print1(){
        System.out.println("B클래스 print1");
    }
    void print2(int a){
        System.out.println("B클래스 print2");
    }
}
public class overloading {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.print1(); // A클래스 print2
        aa.print2(); // A클래스 print2


        BB bb = new BB();
        bb.print1();
        bb.print2();
        bb.print2(3);

        AA ab = new BB();
        ab.print1();     // B클래스 print1
        ab.print2();     // A클래스 print2
        //ab.print2(3);  // 오류

    }
}
