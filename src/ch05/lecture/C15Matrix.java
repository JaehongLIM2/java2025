package ch05.lecture;

public class C15Matrix {
    public static void main(String[] args) {
        int[] a;
        a = new int[]{3, 4, 5};

        int[][] b;
        b = new int[][]{{99, 88, 77}, {4, 5}, {101, 202, 303, 404, 505}};

        int[] c = {3, 4, 5};
        // 1차원 배열의 선언할당과 같이 앞 new int[][] 생략가능
        int[][] d = {
                {1, 2, 3},
                {2, 41, 421},
                {123, 515, 456, 32, 123}
        };

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.println("d[i],[j] = " + d[i][j]);

            }

        }

    }
}
