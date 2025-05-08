package ch06.lecture.p03method;

public class App03 {
    public static void main(String[] args) {
        MyClass03 a = new MyClass03();
        a.action2();
        System.out.println("다음 코드들. . .");
        a.action3();
        System.out.println("a.action3() = " + a.action3());
        System.out.println("a.action4() = " + a.action4());
        System.out.println("a.action5() = " + a.action5());
    }
}


class MyClass03 {
    void action1() {
        // 코드 . . .

        // return :
        // 1. 메소드 종료
        // 2. 오른쪽 값을 호출한 곳으로 반환

    }

    void action2() {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        if (true) {
            return;
        }
        System.out.println(4);
    }

    // 리턴 타입과 return 문의 오른쪽 값이 일치해야 함
    int action3() {
        System.out.println(99);
        System.out.println(88);
        System.out.println(77);
        return 312;
    }

    String action4() {
        return "하이";
    }

    double action5() {
        return 3.14;
    }

    int action6() {
        // 리턴타입을 명시하면 꼭 타입에 맞는 값을 리턴해야함
        return 7;
    }

    void action7() {
        // 리턴할 값이 없다면 void 리턴타입 사용
    }

    int action8() {
        // 리턴문을 만나도록 코드 작성해야함
        if (true) {
            return 9;
        }
        return 11;
    }


}
