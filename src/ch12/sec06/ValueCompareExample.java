package ch12.sec06;

public class ValueCompareExample {
    public static void main(String[] args) {
        Integer a = 300;
        Integer b = 300;

        System.out.println("(a == b) = " + (a == b));
        System.out.println("a.equals(b) = " + a.equals(b));
        System.out.println();

        Integer c = 10;
        Integer d = 10;
        System.out.println("(c == d) = " + (c == d));
        System.out.println("c.equals(d) = " + c.equals(d));
    }
}
