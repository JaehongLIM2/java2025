package ch04.sec05;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        // 1 ~ 100 사이의 자연수의 합 구하기

        int sum = 0;

        int i = 1;

        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("1 ~" + (i - 1) + " 합 : " + sum);
        System.out.println(sum);

        int sum2 = 0;
        for (int j = 1; j <= 100; j++) {
            sum2 += j;
        }
        System.out.println(sum2);

    }
}
