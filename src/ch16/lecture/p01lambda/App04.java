package ch16.lecture.p01lambda;

public class App04 {
    public static void main(String[] args) {
        MyInterface04 a1 = (int a, String b) -> {
            System.out.println(b + ", " + a);
        };


        MyInterface04 a2 = (a, b) -> {
            System.out.println(b + ", " + a);
        };

        MyInterface04 c = (x, y) -> System.out.println(y + ", " + x);

    }
}

@FunctionalInterface
interface MyInterface04 {
    void action(int a, String b);
}
