package ch16.lecture.p01.lambda;

public class App09 {
    public static void main(String[] args) {
        MyInterface09 o = (a, b, c) -> a.action(b, c);
        MyInterface09 p = MyClass09::action;

    }
}

class MyClass09 {
    void action(int a, int b) {
        System.out.println("MyClass09.action");
    }
}

@FunctionalInterface
interface MyInterface09 {
    void some(MyClass09 a, int b, int c);
}

