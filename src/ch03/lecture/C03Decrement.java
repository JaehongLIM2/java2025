package ch03.lecture;

public class C03Decrement {
    public static void main(String[] args) {
        // -- : 감소 연산자
        // 변수의 값에 1 빼서, 변수에 대입
        int a = 10;
        a--;
        System.out.println("a = " + a); // 9
        --a;
        System.out.println("a = " + a); // 8

        // 후위 연산자 : -- 가 뒤에 붙어있음, 나중에 연산
        System.out.println("a-- = " + a--); // 8
        System.out.println("a = " + a); // 7

        // 전위 연산자 : -- 가 앞에 붙어있음, 먼저 연산
        System.out.println("--a = " + --a); // 6
        System.out.println("a = " + a); // 6
    }
}
