package leetCode.LT2206;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean divideArray(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            // n 이 map 에 있으면
            if (map.containsKey(n)) {
                Integer v = map.get(n);
                map.put(n, v + 1);
            } else {
                // n 이 map 에 없으면
                map.put(n, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer count = entry.getValue();
            if (count % 2 != 0) {
                return false;  // 홀수 개 존재 → 짝을 이룰 수 없음
            }
        }

        return true;
    }
}