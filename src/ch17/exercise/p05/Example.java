package ch17.exercise.p05;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
        );

        list.stream()
                .filter(a -> a.toLowerCase().contains("java"))
                .forEach(System.out::println);


        // 명령형
        for (String item : list) {
            String lowerCase = item.toLowerCase();
            if (lowerCase.contains("java")) {
                System.out.println(item);
            }
        }
    }
}
