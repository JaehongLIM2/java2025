package ch05.lecture;

public class C01Array {
    public static void main(String[] args) {
        // 배열 (array) : 여러 값을 담을 수 있는 자료형 (data type)

        // 기본 타입
        int a;
        a = 3; // 하나의 값만 담을 수 있음


        // 배열
        int[] b;
        b = new int[5]; // 여러개의 값을 담을 수 있음

        // b는 5개의 int 값을 담을 수 있음
        b[0] = 9; // b 의 0 번 index 에 9 라는 값 대입
        b[1] = 8; // b 의 1 번 index 에 8 라는 값 대입
        b[2] = 7;
        b[3] = 55;
        b[4] = 1312;
//        b[5] = 928; // 존재하지 않는 index 사용시 오류(Exception)

        System.out.println("b[0] = " + b[0]);
        System.out.println("b[1] = " + b[1]);
        System.out.println("b[2] = " + b[2]);
        System.out.println("b[3] = " + b[3]);
        System.out.println("b[4] = " + b[4]);

        // 연습
        // 3개의 int 값을 담을 수 있는 배열 c 를 만들어보세요.

        int[] c;
        c = new int[3];

        // c 의 각 index 에 값을 담아 보세요.

        c[0] = 1;
        c[1] = 2;
        c[2] = 3;

        // c 의 각 index 의 값을 출력해보세요.

        System.out.println("c[0] = " + c[0]);
        System.out.println("c[1] = " + c[1]);
        System.out.println("c[2] = " + c[2]);

        //
        double[] d;
        d = new double[3];

        d[0] = 3.14;
        d[1] = 2.31;
        d[2] = 5.2331;

        System.out.println("d[0] = " + d[0]);
        System.out.println("d[1] = " + d[1]);
        System.out.println("d[2] = " + d[2]);

        //
        String[] e;
        e = new String[3];
        e[0] = "hi";
        e[1] = "안녕";
        e[2] = "집가고싶다";

        System.out.println("e[0] = " + e[0]);
        System.out.println("e[1] = " + e[1]);
        System.out.println("e[2] = " + e[2]);

    }

}
