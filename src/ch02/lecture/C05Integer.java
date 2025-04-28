package ch02.lecture;

public class C05Integer {
    public static void main(String[] args) {
        // 정수형
        // byte (1 byte, 8 bits)
        byte a; // a : byte 타입
        a = 127; // 최대값
        System.out.println("a = " + a);
        a = -128; // 최소값
        System.out.println("a = " + a);
//        a = 128; // x
//        a = -129; // x


        // short (2 byte, 16 bits)
        short b; // b : short 타입
        b = 32767; // 최대값
        System.out.println("b = " + b);
        b = -32768; // 최소값
        System.out.println("b = " + b);


        // int (4 byte, 32 bits)
        int c; // c : int 타입
        c = 2147483647;
        System.out.println("c = " + c);
        c = -2147483648;
        System.out.println("c = " + c);


        // long (8 byte, 64 bits)
        long d; // d : long 타입
        d = 9223372036854775807L;
        System.out.println("d = " + d);
        d = -9223372036854775808L;
        System.out.println("d = " + d);

        // java 코드에서 정수 leteral 는 int 로 해석
        // long type literal 은 끝에 L(l) 붙여야 함

    }
}
