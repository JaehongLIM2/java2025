package ch17.exercise.p08;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = List.of(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        Map<String, List<Member>> collect = list.stream()
                .collect(
                        Collectors.groupingBy(
                                s -> s.getJob()
                        )
                );
        
        collect.entrySet()
                .stream()
                .filter(s -> s.getKey().equals("개발자"))
                .forEach(System.out::println);

        collect.entrySet()
                .stream()
                .filter(s -> s.getKey().equals("디자이너"))
                .forEach(System.out::println);
    }
}
