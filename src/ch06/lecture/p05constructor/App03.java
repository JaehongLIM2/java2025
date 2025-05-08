package ch06.lecture.p05constructor;

public class App03 {
    public static void main(String[] args) {
        MyClass03 a = new MyClass03("김기량", 23, "제주");
//        a.name = "김두환";
//        a.age = 28;
//        a.address = "seoul";

        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(a.address);

        MyClass03 b = new MyClass03("최지원", 29, "신림");
        System.out.println(b.name);
        System.out.println(b.age);
        System.out.println(b.address);

    }
}

class MyClass03 {
    // 필드
    String name;
    int age;
    String address;

    // 생성자
    MyClass03(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    // 메소드


}
