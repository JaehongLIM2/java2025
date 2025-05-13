package ch07.lecture.p06super;

public class App02 {
    public static void main(String[] args) {
        Child021 a = new Child021();

    }
}

class Parent02 {
    // 필드 (private)


    public Parent02() {
        // 부모 클래스 생성자가 하는 일
        // 필드 초기화
        System.out.println("부모 클래스 필드 초기화");
    }
}

class Child021 extends Parent02 {
    public Child021() {
        // 부모 클래스의 생성자 호출 코드 꼭 있어야함.
        // (부모 클래스의 필드 초기화를 자식 클래스 생성자가 직접 하지 못하기때문에)
        super();
        // 작성하지 않으면 부모의 no-args 생성자 호출 코드 자동으로 삽입됨

        // 자식 클래스 생성자가 하는 일
        System.out.println("자식 클래스 필드 초기화");
    }
}
