package leetCode.LT0485;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int f = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                f++;
                if (f > max) {
                    max = f;
                }
            } else {
                f = 0;
            }
        }
        return max;
    }
}