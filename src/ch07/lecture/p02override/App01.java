package ch07.lecture.p02override;

public class App01 {
    public static void main(String[] args) {
        SubClass01 a = new SubClass01();
        a.action();
        a.hello();

        SubClass02 b = new SubClass02();
        b.action();
    }
}

class SuperClass01 {
    public void action() {
        System.out.println("SuperClass01.action");
    }
}

class SubClass02 extends SuperClass01 {
    // 추가 메소드

    // override

    @Override
    public void action() {
        System.out.println("SubClass02.action");
    }
}


class SubClass01 extends SuperClass01 {

    // 상속받은 메소드를 다시 정의(Override)할 수 있음
    // @Override 애노테이션 : override 메소드를 잘 작성했는지 검증
    @Override
    public void action() {
        System.out.println("SubClass01.action");
    }

    //    @Override
    public void hello() {
        System.out.println("SubClass01.hello");
    }
}
