package ch17.sec12.exam01;

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
        List<Student> maleList = list.stream()
                .filter(s -> s.getSex().equals("남"))
                .toList();

        maleList.stream()
                .forEach(x -> System.out.println(x.getName()));

        System.out.println();

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
