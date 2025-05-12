package ch07.lecture.p03polymorphism;

public class App03 {
    public static void main(String[] args) {
        Dog1 a = new Dog1();
        BullDog01 b = new BullDog01();
        Chihuahua c = new Chihuahua();

        a.bark();
        b.bark();
        c.bark();

        Dog1 d = b;
        d.bark(); // 으르렁(실제 인스턴스의 메소드가 실행) *중요*
        Dog1 e = c;
        e.bark(); // 깨갱


    }
}

class Dog1 {
    public void bark() {
        System.out.println("멍멍");
    }
}

class BullDog01 extends Dog1 {
    @Override
    public void bark() {
        System.out.println("으르롱");
    }
}

class Chihuahua extends Dog1 {
    @Override
    public void bark() {
        System.out.println("깨갱");
    }
}
