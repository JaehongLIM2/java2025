package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;

        System.out.println("x : " + x + ", y : " + y);

        int t = x;
        x = y;
        y = t;
        System.out.println("x : " + x + ", y : " + y);
    }
}
