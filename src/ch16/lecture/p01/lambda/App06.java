package ch16.lecture.p01.lambda;

public class App06 {
    public static void main(String[] args) {
        MyInterface06 a = () -> {
            System.out.println("code1");
            System.out.println("code2");
        };

        // 코드가 한 줄이면 중괄호{} 생략 가능
        MyInterface06 b = () -> System.out.println("람다의 한줄코드");
    }
}

@FunctionalInterface
interface MyInterface06 {
    void action();

}
