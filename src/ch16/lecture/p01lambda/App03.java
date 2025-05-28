package ch16.lecture.p01lambda;

public class App03 {
    public static void main(String[] args) {
        MyInterface03 a = () -> {
            System.out.println("1");
            System.out.println("2");
        };
        a.method();


        // method body 여러 줄이면 {} 꼭 써야함
        MyInterface03 b = () -> {
            System.out.println("11");
            System.out.println("22");
        };
        b.method();

        // method body 한 줄이면 {} 생략가능
        MyInterface03 c = () -> System.out.println("33");
        c.method();

    }
}

@FunctionalInterface
interface MyInterface03 {
    // 파라미터 없는 메소드
    void method();
}