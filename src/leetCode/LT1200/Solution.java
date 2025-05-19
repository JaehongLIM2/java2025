package leetCode.LT1200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<Integer> input = new ArrayList<>();
        for (int n : arr) {
            input.add(n);
        }

        // 1. input을 정렬
        // 2. 인접한 두 값의 차가 가장 적은 차이를 구해서 저장
        // 3. 인접한 두 값의 차가 (2)에서 구한 값과 같으면
        //    두 값을 원소로 같는 List를 만들어서
        //    결과 list 에 추가하기
        Collections.sort(input);

        int min = Integer.MAX_VALUE;

        for (int i = 1; i < input.size(); i++) {
            int diff = input.get(i) - input.get(i - 1);
            if (diff < min) {
                min = diff;
            }
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i < input.size(); i++) {
            int diff = input.get(i) - input.get(i - 1);
            if (min == diff) {
                List<Integer> l1 = new ArrayList<>();
                l1.add(input.get(i - 1));
                l1.add(input.get(i));
                result.add(l1);

            }
        }


        return result;

    }
}
