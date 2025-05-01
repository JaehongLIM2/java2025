package ch04.lecture;

public class C15For {
    public static void main(String[] args) {
        // while
        int j = 0; // 카운트 변수 초기화

        System.out.println(1);
        while (j <= 5) { // 조건 확인
            System.out.println(2);
            System.out.println(3);

            j++; // 카운트 변수 증가
        }
        System.out.println(4);
        System.out.println(5);

        System.out.println("-------------------");

        // for

        for (int i = 0; i < 5; i++) {
            System.out.println("반복할 코드");
        }

        System.out.println("프로그램 종료");


    }
}
