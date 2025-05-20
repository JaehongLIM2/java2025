package ch15.exercise.p09;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;
        double avgScore = 0;

        for (String key : map.keySet()) {
            int value = map.get(key);
            if (maxScore < value) {
                maxScore = value;
                name = key;
            }
            totalScore += value;

            avgScore = ((double) totalScore / map.size());

        }
        System.out.println("평균 점수 : " + avgScore);
        System.out.println("최고 점수 : " + maxScore);
        System.out.println("합계 점수 : " + totalScore);
        System.out.println("최고 점수를 받은 아이디 : " + name);
        System.out.println();


    }
}
