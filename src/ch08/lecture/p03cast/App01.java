package ch08.lecture.p03cast;

public class App01 {
    public static void main(String[] args) {
        MyInterface01 a = new MyClass01();
        a.action();
//        a.method();

        // casting : 강제형변환
        MyClass01 b = (MyClass01) a;

    }
}

interface MyInterface01 {
    void action();
}

class MyClass01 implements MyInterface01 {
    @Override
    public void action() {
        System.out.println("액션!");
    }

    public void method() {
        System.out.println("애애액션!");
    }
}
