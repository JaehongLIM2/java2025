package ch06.exercise.p14;

public class App01 {
    public static void main(String[] args) {
        Member user1 = new Member("홍길동", "hong");
        System.out.println("user1.name = " + user1.name);
        System.out.println("user1.id = " + user1.id);
        System.out.println("user1.age = " + user1.age); // 0
        System.out.println("user1.password = " + user1.password); // null
    }
}
