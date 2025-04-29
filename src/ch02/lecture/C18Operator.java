package ch02.lecture;

public class C18Operator {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        int c = a + b; // int
        System.out.println("c = " + c);

        // 다른 타입끼리 산술 연산(+, -, *, /)
        // 큰 타입이 연산 결과로 나옴
        int d = 10;
        long e = 20;
//        int f = d + e; // int x
        long g = d + e; // long

        int h = 3;
        double i = 3.14;
        double j = h + i; // 정수와 실수 : 산술 연산 결과는 실수(큰타입)
        System.out.println("j = " + j);


        // byte, short, int 끼리의 산술 연산 결과는 int
        byte k = 5;
        int l = 7;
        int m = k + l; // int

        byte n = 8;
        byte o = 9;
//        byte q = n + o; // byte 아님
        int p = n + o; // int 임

        int r = 5;
        int s = 3;
        int t = r / s; // 1 , 뒤의 소숫점은 생략
        System.out.println("t = " + t);

        double u = r / s; // r + s 는 이미 연산결과가 1이기때문에 변하지않음
        System.out.println("u = " + u);

        double v = r / (double) s;
        double w = (double) r / s;
        System.out.println("v = " + v);
        System.out.println("w = " + w);


    }
}
