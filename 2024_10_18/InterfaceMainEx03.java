interface InterA {
    String STR1 = "박문수";

    void methodA();
}

interface InterB extends InterA {
    String STR1 = "홍길동";

    void methodB();
}

class ClassA implements InterB {
    public void methodA() {
        System.out.println("메소드A 호출");
    }

    public void methodB() {
        System.out.println("메소드B 호출");
    }
}

public class InterfaceMainEx03 {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.methodA();
        a.methodB();
    }
}