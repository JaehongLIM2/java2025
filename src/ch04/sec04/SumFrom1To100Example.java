package ch04.sec04;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;
        int i;

        for (i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
