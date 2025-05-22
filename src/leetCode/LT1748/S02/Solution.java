package leetCode.LT1748.S02;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Long> collect = Arrays.stream(nums)
                .boxed()
                .collect(
                        Collectors.groupingBy(e -> e, Collectors.counting())
                );


        List<Integer> list = collect.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();

        Integer reduce = list.stream()
                .reduce(0, Integer::sum);


        return reduce;
    }
}