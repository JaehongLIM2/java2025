package leetCode.LT0118;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1); // 0번째 행

            if (i > 0) {
                List<Integer> prevRow = result.get(i - 1);
                for (int j = 1; j < i; j++) {
                    int v = prevRow.get(j - 1) + prevRow.get(j);
                    row.add(v);
                }
                row.add(1);
            }
            result.add(row);
        }
        return result;
    }
}