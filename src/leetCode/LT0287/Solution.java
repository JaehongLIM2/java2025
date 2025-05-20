package leetCode.LT0287;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int findDuplicate(int[] nums) {
        // nums의 모든 요소를 탐색해서 set 에 넣고
        // 넣을 때 결과가 false 면 이미 있던 값이니까 return

        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (!set.add(n)) {
                return n;
            }
        }
        return 0;
    }
}