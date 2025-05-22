package leetCode.LT1431.S02;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Integer> list = new ArrayList<>();

        for (Integer i : candies) {
            list.add(i);
        }

        Integer max = list.stream()
                .max(Integer::compare)
                .orElse(0);


        List<Boolean> list1 = list.stream()
                .map(s -> (s + extraCandies) >= max)
                .toList();

        return list1;
    }
}