package ch06.lecture.p07final;

public class App01 {

}


class MyClass01 {

    final int weight = 2;
    final int height;
    int age;

    MyClass01() {
        age = 3;
        age = 5; // ok
        height = 9;
    }

    MyClass01(int a) {
        height = 22;
    }


    void method1() {
        int a;
        a = 3;
        int b = 5;

        // 값을 바꿔 넣을 수 있음
        a = 2;
        b = 12;

        // final : 변수의 값을 한 번만 넣을 수 있음
        final int c;
        c = 9;

//        c = 11; // 두 번은 안됨
    }

    void method2(int a) {
        System.out.println(a);
        a = 9; // 가능
    }

    void method3(final int a) {
        System.out.println(a);
//        a = 9; // 메소드를 호출할 때 값이 이미 들어가기 때문에 안됨.
    }
}
