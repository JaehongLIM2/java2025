package ch08.lecture.p02method;

public class App01 {
    public static void main(String[] args) {
        // interface 로 인스턴스 만들 수 없음
//    Beast1 a = new Beast1();
        Tiger1 t = new Tiger1();
        Wolf1 w = new Wolf1();

        Beast1 b = t;
        Beast1 c = w;
        b.hunt(); // tiger.hunt  ();
        c.hunt(); // wolf.hunt();

    }
}

interface Beast1 {
    // abstract method : interface 의 메소드는 모두 추상메소드
    public abstract void hunt();
}

class Tiger1 implements Beast1 {
    @Override
    public void hunt() {
        System.out.println("초식 동물들을 사냥합니다.");
    }
}

class Wolf1 implements Beast1 {
    @Override
    public void hunt() {
        System.out.println("작은 동물들을 사냥합니다.");
    }
}