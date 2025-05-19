package leetCode.LT0119;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // 0번째 행

        for (int i = 1; i <= rowIndex; i++) {
            row.add(0);

            for (int j = row.size() - 1; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }

//            row.add(1); // 맨 뒤
        }
        return row;


    }
}
