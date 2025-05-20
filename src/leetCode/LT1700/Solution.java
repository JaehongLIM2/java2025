package leetCode.LT1700;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> stu = new LinkedList<>();
        Queue<Integer> san = new LinkedList<>();

        // 학생 번호를 큐에 추가
        for (int stuNum : students) {
            stu.offer(stuNum);
        }
        // 샌드위치 번호를 큐에 추가
        for (int sanNum : sandwiches) {
            san.offer(sanNum);
        }
        for (int i = 0; i < sandwiches.length; i++) {
            for (int j = 0; j < students.length; j++) {
//             만약 학생과 샌드위치가 맞지않으면
                if (stu.peek() != san.peek()) {
                    Integer p1 = stu.poll();
                    stu.offer(p1);
//             만약 학생과 샌드위치가 맞으면
                } else {
                    stu.poll();
                    san.poll();
                }
            }
        }
        return stu.size();
    }
}
