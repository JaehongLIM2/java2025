package ch05.sec07;

public class MultidimensionalArrayByValueListExample {
    public static void main(String[] args) {
        int[][] score = {
                {80, 90, 96},
                {76, 88}
        };

        System.out.println("1차원 배열 길이(반의 수) = " + score.length);
        System.out.println("2차원 배열 길이(첫 번째 반의 학생 수) = " + score[0].length);
        System.out.println("2차원 배열 길이(두 번째 반의 학생 수) = " + score[1].length);

        System.out.println("score[0][2] = " + score[0][2]);
        System.out.println("score[0][2] = " + score[1][1]);

        int class1Sum = 0;
        for (int i = 0; i < score[0].length; i++) {
            class1Sum += score[0][i];
        }
        double class1Avg = class1Sum / score[0].length;
        System.out.println("첫 번째 반의 평균 점수 = " + class1Avg);

        int class2Sum = 0;
        for (int i = 0; i < score[1].length; i++) {
            class2Sum += score[1][i];
        }
        double class2Avg = class2Sum / score[1].length;
        System.out.println("두 번째 반의 평균 점수 = " + class2Avg);

        int totalStudent = 0;
        int totalSum = 0;
        for (int i = 0; i < score.length; i++) {
            totalStudent += score[i].length;
            for (int j = 0; j < score[i].length; j++) {
                totalSum += score[i][j];
            }
        }
        double totalAvg = (double) totalSum / totalStudent;
        System.out.println("전체 학생의 합계 점수 = " + totalSum);
        System.out.println("전체 학생의 평균 점수 = " + totalAvg);

    }
}
