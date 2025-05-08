package ch05.lecture;

public class C30StringMethod {
    public static void main(String[] args) {
        // trim, strip : 끝의 빈문자(white space) 삭제

        String a = "   hello world   ";
        System.out.println("a = " + a);
        String b = a.trim();
        System.out.println("b = " + b);

        String c = a.strip();
        System.out.println("c = " + c);

        String z = "\u2002Hello\u2002";
        String x = z.trim();
        String y = z.strip();
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
