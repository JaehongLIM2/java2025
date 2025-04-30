package ch04.lecture;

public class C05Random {
    public static void main(String[] args) {
        // 0.0 <= Math.random() < 1.0
        // double 값 리턴

        double a = Math.random();

        System.out.println("a = " + a);
        // 0.0 <= a < 1.0

        // 예제) 주사위 1, 2, 3, 4, 5, 6 중 임의의 한 개의 값

//        0.0 <= a * 6 < 6.0
        a *= 6;
        System.out.println("a = " + a);

        int b = (int) a;
        System.out.println("b = " + b);

        b += 1;
        System.out.println("b = " + b);

        // 한 줄에 작성
        int c = ((int) (Math.random() * 6)) + 1;
        System.out.println("c = " + c);

        // 책 119 페이지
        int score = (int) (Math.random() * 20) + 81;
        //          (         0 ~ 19         ) + 81 = ( 81 ~ 100 )
    }
}
