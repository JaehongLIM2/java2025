package ch06.lecture.p03method;

public class App05 {
    public static void main(String[] args) {
        MyClass05 a = new MyClass05();
        a.method();
        a.method(1);
        a.method(10, 20);
        a.method(4, 123, 541, 12);

        a.greeting("hello");
        a.greeting("hola", 213);
        a.greeting("hi", 123, 123, 41);
    }
}


class MyClass05 {
    void action(int a) {

    }

    void action(int a, int b) {

    }

    void action(int a, int b, int c) {

    }

    // varargs
    void method(int... a) {
        // varargs 는 메소드 내에서 배열로 사용
        System.out.println(a.length + " 개의 파라미터 넘어옴");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[i] = " + a[i]);
        }
    }


    // varargs 는 꼭 파라미터 목록 마지막에 작성해야함
    void greeting(String a, int... b) {

    }
}