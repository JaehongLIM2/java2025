package leetCode.LT1748;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int sumOfUnique(int[] nums) {

        // nums 를 전체 탐색해서 각 아이템이 몇 번 나오는지 세기

        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            // n 이 map 에 있으면
            if (map.containsKey(n)) {
                Integer v = map.get(n);
                map.put(n, v + 1);
            } else {
                // n 이 mpa 에 없으면
                map.put(n, 1);
            }
        }
        int sum = 0;
        // map 을 전체 탐색해서 value 가 1 인 key 들을 더하기
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                sum = entry.getKey();
            }
        }


        return sum;
    }
}