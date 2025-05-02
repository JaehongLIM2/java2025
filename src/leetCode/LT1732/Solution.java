package leetCode.LT1732;

public class Solution {
    public int largestAltitude(int[] gain) {
        int r = 0;
        int max = 0;


        for (int i = 0; i < gain.length; i++) {
            r += gain[i];
            if (r > max) {
                max = r;
            }
        }
        return max;
    }
}