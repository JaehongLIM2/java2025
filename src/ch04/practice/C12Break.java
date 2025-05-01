package ch04.practice;

public class C12Break {
    public static void main(String[] args) {
        while (true) {
            int x = (int) (Math.random() * 10) + 1;
            int y = (int) (Math.random() * 10) + 1;
            System.out.println("(" + x + ", " + y + ")");
            if ((4 * x) + (5 * y) == 60) {
                System.out.println("해를 찾았습니다");

                break;
            }
            System.out.println("프로그램 종료");
        }

    }
}
