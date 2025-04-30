package ch04.practice;

public class C03SwitchExpression {
    public static void main(String[] args) {

        int i = 1;

        int sum = 0;

        while (i <= 100) {
            if (i % 3 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("While - If 문으로 구한 3의 배수의 총합 : " + sum);

        int j = 3;

        int sum1 = 0;
        while (j <= 100) {
            sum1 += j;
            j += 3;
        }
        System.out.println("While 문으로 구한 3의 배수의 총합 : " + sum1);

        int sum2 = 0;

        for (int k = 3; k <= 100; k += 3) {
            sum2 += k;
        }
        System.out.println("For 문으로 구한 3의 배수의 총합 : " + sum2);

    }
}

