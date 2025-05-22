package leetCode.LT2206.S02;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public boolean divideArray(int[] nums) {
        // Stream 을 이용한 해결방법
        Map<Integer, Long> collect = Arrays.stream(nums)
                .boxed()
                .collect(
                        Collectors.groupingBy(e -> e, Collectors.counting())
                );

        return collect.values()
                .stream()
                .allMatch(e -> e % 2 == 0);


    }
}