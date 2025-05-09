package ch06.exercise.p13;

public class App01 {
    public static void main(String[] args) {
        Member m1 = new Member();
        m1.setName("임재홍");
        m1.setId("nu0044");
        m1.setPassword("cho1123");
        m1.setAge(29);

        System.out.println("m1.getName() = " + m1.getName());
        System.out.println("m1.getId() = " + m1.getId());
        System.out.println("m1.getPassword() = " + m1.getPassword());
        System.out.println("m1.getAge() = " + m1.getAge());

        Member m2 = new Member();
        m2.setName("김기량");
        m2.setId("koclw1");
        m2.setPassword("123gw1234");
        m2.setAge(30);

        System.out.println("m2.getName() = " + m2.getName());
        System.out.println("m2.getId() = " + m2.getId());
        System.out.println("m2.getPassword() = " + m2.getPassword());
        System.out.println("m2.getAge() = " + m2.getAge());
        
    }
}
