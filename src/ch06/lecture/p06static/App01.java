package ch06.lecture.p06static;

public class App01 {
    public static void main(String[] args) {
        MyClass01 a = new MyClass01();
        a.name = "donald";
        a.age = 88;

        MyClass01 b = new MyClass01();
        b.name = "임재홍";
        b.age = 22;

        a.work();
        b.work();

        // 인스턴스 멤버는 크래스 이름으로 접근할 수 없음
//        MyClass01.name = "abc";
//        MyClass01.age = 22;

        //클래스 멤버(필드, 메소드)는 클래스 이름으로 접근할 수 있음
        MyClass01.address = "ny";


    }
}


class MyClass01 {
    // 멤버(필드, 메소드, (생성자))

    // 필드, 멤버 필드, 인스턴스 필드
    String name;
    int age;


    // 클래스 필드, static 필드(정적 필드)
    static String address;


    // 메소드, 멤버 메소드, 인스턴스 메소드
    void work() {
        System.out.println(this.age + " 세의 " + this.name + " 가 일한다.");
    }

    // 클래스 메소드, static 메소드(정적 메소드)
    static void print() {
        System.out.println(address + "에 삽니다.");
    }

}
