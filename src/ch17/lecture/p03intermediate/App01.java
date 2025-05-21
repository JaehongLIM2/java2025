package ch17.lecture.p03intermediate;

import java.util.List;

public class App01 {
    public static void main(String[] args) {
        // 중간 연산 (intermediate)
        // * Stream 리턴

        List<Integer> list = List.of(9, 1, 3, 5, 10, 11, 15, 16, 200, 30, 12, 11, 1, 9, 5, 3, 9, 9, 9, 9);


        // filter : 조건에 맞는 요소만 남김
        long count = list.stream()
                .filter(a -> a < 10)
                .count();
        System.out.println("count = " + count);

        long count1 = list.stream()
                .filter(a -> a > 10)
                .count();
        System.out.println("count1 = " + count1);

        list.stream()
                .filter(a -> a % 2 == 1)
                .forEach(System.out::println);

        System.out.println("-------");
        // distinct : 중복 제거
        long count2 = list.stream()
                .distinct()
                .count();
        System.out.println("count2 = " + count2);

        System.out.println("-------");
        // sorted : 정렬
        list.stream()
                .sorted()
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        list.stream()
                .distinct()
                .sorted()
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        list.stream()
                .distinct()
                .sorted((a, b) -> b - a)
                .forEach(x -> System.out.print(x + " "));

        System.out.println("-------");
        // limit : 앞의 n 개만
        list.stream()
                .limit(5)
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .limit(3)
                .forEach(System.out::println);
        System.out.println();

        list.stream()
                .sorted()
                .distinct()
                .limit(3)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        list.stream()
                .sorted((a, b) -> b - a)
                .distinct()
                .limit(3)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        // skip : 앞의 n 개 건너뛰고
        list.stream()
                .sorted()
                .distinct()
                .skip(1)
                .limit(1)
                .forEach(System.out::println);
        System.out.println();

        // map : 요소 변환(mapping)
        list.stream()
                .distinct()
                .map(a -> a * 100)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        list.stream()
                .distinct()
                .map(a -> a + "달러")
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        list.stream()
                .sorted((a, b) -> b - a)
                .limit(3)
                .map(a -> a + "원")
                .forEach(x -> System.out.print(x + " "));
    }
}
