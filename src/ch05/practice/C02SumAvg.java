package ch05.practice;

public class C02SumAvg {
    public static void main(String[] args) {
        int[][] arr = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum1 = 0; // 1행의 합
        int sum2 = 0; // 2행의 합
        int sum3 = 0; // 3행의 합
        int sum = 0;
        double avg1 = 0; // 1행의 평균
        double avg2 = 0; // 2행의 평균
        double avg3 = 0; // 3행의 평균

        for (int i = 0; i < arr[0].length; i++) {
            sum1 += arr[0][i];
        }

        avg1 = (double) sum1 / arr[0].length;
        System.out.println("sum1 = " + sum1);
        System.out.println("avg1 = " + avg1);
        for (int i = 0; i < arr[1].length; i++) {
            sum2 += arr[1][i];
        }

        avg2 = (double) sum2 / arr[1].length;
        System.out.println("sum2 = " + sum2);
        System.out.println("avg2 = " + avg2);
        for (int i = 0; i < arr[2].length; i++) {
            sum3 += arr[2][i];
        }
        avg3 = (double) sum3 / arr[2].length;
        System.out.println("sum3 = " + sum3);
        System.out.println("avg3 = " + avg3);


        int totalNum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalNum += arr[i].length;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }

        double avg = (double) sum / totalNum;
        System.out.println("전체 합계 = " + sum);
        System.out.println("전체 평균 = " + avg);

    }
}
