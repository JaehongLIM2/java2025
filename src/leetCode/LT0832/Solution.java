package leetCode.LT0832;

public class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int m = image[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m / 2; j++) {
                int t = image[i][j];
                image[i][j] = image[i][m - 1 - j];
                image[i][m - 1 - j] = t;
            }
        }

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 1) {
                    image[i][j] = 0;
                } else {
                    image[i][j] = 1;
                }
            }
        }
        return image;
    }
}