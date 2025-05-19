package leetCode.LT0119;

import java.util.ArrayList;
import java.util.List;

public class SolutionTeachers {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> prev;
        List<Integer> current = new ArrayList<>();
        current.add(1);

        for (int currentIndex = 0; currentIndex < rowIndex; currentIndex++) {
            prev = current;
            current = new ArrayList<>();
            current.add(1); // 처음

            // 이전 행의 각 값들을 더해서 넣고
            for (int i = 0; i <= prev.size() - 2; i++) {
                current.add(prev.get(i) + prev.get(i + 1));

            }

            current.add(1); // 마지막
        }
        return current;


    }
}
