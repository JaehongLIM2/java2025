package ch03.sec01;

public class SignOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        x = -x;
        System.out.println("x = " + x); // 100

        byte b = 100;
        int y = -b; // (-)연산이 일어난 것이라서 int에 할당
        System.out.println("y = " + y); // -100
    }
}
