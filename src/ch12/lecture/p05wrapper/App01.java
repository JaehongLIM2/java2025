package ch12.lecture.p05wrapper;

public class App01 {
    public static void main(String[] args) {
        // 기본타입 8개
        // byte, short, int, long
        // float, double
        // boolean
        // char

        // 참조타입 8개 (Wrapper Class), (13장, 15장에서 사용됨)
        // Byte, Short, Integer, Long
        // Float, Double
        // Boolean
        // Character

        int a = 3;

        // 참조타입 Integer 로 기본타입 int 를 감싼 객체
        Integer b = Integer.valueOf(a); // boxing
//        Integer c = new Integer(a); // 예전 버전
        System.out.println("a = " + a);

        Integer c = a; // auto boxing
        System.out.println("c = " + c);

        Integer d = 9090; // auto boxing
        System.out.println("d = " + d);

        // 참조타입 Integer 를 기본타입 int 로 전환
        int e = d.intValue();
        System.out.println("e = " + e);

        int f = d;
        System.out.println("f = " + f);

    }
}
