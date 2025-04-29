package ch03.lecture;

public class C06Overflow {
    public static void main(String[] args) {
        int a = 2147483645;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a); // int가 담을 수 있는 최댓값
        a++;
        System.out.println("a = " + a);

        int b = -2147483646;
        System.out.println("b = " + b);
        b--;
        System.out.println("b = " + b);
        b--;
        System.out.println("b = " + b); // int 가 담을 수 있는 최솟값
        b--;
        System.out.println("b = " + b);
    }
}
