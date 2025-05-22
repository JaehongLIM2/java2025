package ch17.sec12.exam01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("홍길동", "남", 92),
                new Student("김수영", "여", 87),
                new Student("감자바", "남", 95),
                new Student("오해영", "여", 93)
        );

        // for 문
        List<Student> mList = new ArrayList<>();
        for (Student s : list) {
            if (s.getSex().equals("남")) {
                mList.add(s);
            }
        }
        for (Student s : mList) {
            System.out.println(s.getName());
        }

        // Stream 사용
        List<Student> maleList = list.stream()
                .filter(s -> s.getSex().equals("남"))
                .toList();

        maleList.stream()
                .forEach(x -> System.out.println(x.getName()));

        System.out.println();

        // (학생 이름, 학생 점수)를 갖는 Map
        // for 문
        Map<String, Integer> map1 = new HashMap<>();
        for (Student s : list) {
            map1.put(s.getName(), s.getScore());
        }
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Stream 사용
        Map<String, Integer> map = list.stream()
                .collect(
                        Collectors.toMap(
                                s -> s.getName(),
                                s -> s.getScore()
                        )
                );
        System.out.println(map);

    }
}
