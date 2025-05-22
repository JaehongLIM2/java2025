package leetCode.LT1431.S01;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        List<Integer> kids = Arrays.stream(candies).boxed().toList();

        // 1. kids List에서 가장 큰 값 구하기

        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        // 2. List<Boolean> 객체 만들기
        List<Boolean> list = new ArrayList<>();


        // 3. kids의 각 요소에 extraCandy 더해서 (1에서 구한 가장 큰값)보다 크거나 같으면
        // result 에 true 추가
        // 아니면 false 추가

        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies) > max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }


        // result 리턴


        return list;
    }
}
