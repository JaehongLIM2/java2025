package ch16.lecture.p01lambda;

public class App08 {
    public static void main(String[] args) {
        MyInterface08 a = () -> System.out.println();
        MyInterface08 b = () -> new MyInterface08() {
            public void some() {
                System.out.println();
            }
        };
        // 람다가 특정 인스턴스 메소드 호출 코드만 있다면
        // 그리고 파라미터 목록이 같으면
        // 메소드 참조 :: 로 코드를 줄일 수 있음

        MyClass08 o = new MyClass08();
        MyInterface08 c = () -> o.action(); // 형광펜에서 alt + enter 눌러보기
        MyInterface08 d = o::action;


    }
}

class MyClass08 {
    void action() {
        System.out.println("MyClass08.some");
    }
}


@FunctionalInterface
interface MyInterface08 {
    void some();
}
