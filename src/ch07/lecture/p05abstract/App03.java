package ch07.lecture.p05abstract;

public class App03 {


}

abstract class Canids03 {
    public abstract void bark();
}

class Chihuahua extends Canids03 {
    // 만약 부모에게서 추상메소드를 받는다면
    // 추상 메소드는 꼭 재정의 해야함
    @Override
    public void bark() {
        System.out.println("깨갱ㅇ");
    }
}

abstract class Wolf03 extends Canids03 {
    // 추상 메소드 재정의 안하면 추상 클래스로 만들어야 함
}