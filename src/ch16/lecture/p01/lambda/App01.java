package ch16.lecture.p01.lambda;

public class App01 {
    MyInterface01 a = new MyInterface01() {
        @Override
        public void method1() {
            System.out.println("App01.method1");
        }

        @Override
        public void method2() {
            System.out.println("App01.method2");
        }
    };
}

interface MyInterface01 {
    void method1();

    void method2();
}
