package ch08.lecture.p06etc;

public class App02 {
}

interface Myinterface02 {
    void action();

    // default method : 인터페이스에 있는 body 가 있는 인스턴스 메소드(추상메소드가 아님)
    default void method1() {
        System.out.println("Myinterface02.method1");
    }

    ;

    // default 메소드도 항상 public
    public default void hello() {
        System.out.println("Myinterface02.hello");
    }

}

class MyClass021 implements Myinterface02 {
    @Override
    public void action() {
        System.out.println("MyClass021.action");
    }
    // 필요하면 default 메소드도 재정의 가능

    @Override
    public void method1() {
        System.out.println("MyClass021.method1");
    }
}

class MyClass022 implements Myinterface02 {
    @Override
    public void action() {
        System.out.println("MyClass022.action");
    }
}
