package ch16.lecture.p01lambda;

public class App05 {
    public static void main(String[] args) {
        MyInterface05 o = (a) -> {
            System.out.println(a + "이다");
            System.out.println(a + "입니다.");
        };

        MyInterface05 z = a -> {
            System.out.println(a + "이다");
            System.out.println(a + "입니다.");
        };

        MyInterface05 w = a -> System.out.println(a + "이다");

    }
}

@FunctionalInterface
interface MyInterface05 {
    void method(int a);
}