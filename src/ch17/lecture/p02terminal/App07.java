package ch17.lecture.p02terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App07 {
    public static void main(String[] args) {
        // groupinBy, reduce 동시에

        List<String> list = List.of("java", "spring", "css", "vue", "react", "javascript", "sql");

        Map<String, List<String>> r1 = list.stream()
                .collect(Collectors.groupingBy(s -> s.length() % 2 == 0 ? "짝" : "홀"));

        r1.forEach((k, v) -> System.out.println(k + " : " + v));


        Map<String, Long> r2 = list.stream()
                .collect(Collectors
                        .groupingBy(s -> s.length() % 2 == 0 ? "짝" : "홀",
                                Collectors.counting()));

        r2.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
