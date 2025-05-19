package leetCode.LT1046;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int s : stones) {
            list.add(s);
        }
        while (list.size() > 1) {
            Collections.sort(list); // 오름차순 정렬
            int last = list.get(list.size() - 1);       // 가장 무거운
            int secondLast = list.get(list.size() - 2); // 두 번째로 무거운

            list.remove(list.size() - 1); // 가장 무거운 제거
            list.remove(list.size() - 1); // 두 번째로 무거운 제거

            // 두 돌이 다르면 차이를 다시 리스트에 넣음
            if (last != secondLast) {
                list.add(last - secondLast);
            }
        }

        // 1. 정렬

        // 2. 마지막과 마지막 직전의 것을 뺀값을 set (차이가 0이면 넣지 않음)

        // 3. 1번 부터 다시 시작

        // 4. 하나만 남을때 까지 반복해서 하나 남은 값을 리턴
        return list.get(0);
    }
}
