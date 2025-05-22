package ch17.lecture.p02terminal;

import java.util.List;

public class App04 {
    public static void main(String[] args) {
        // reduce : 집계 연산

        List<String> list = List.of("java", "spring", "css", "html", "sql");

        // 모든 요소 연결
        String r1 = list.stream()
                .reduce("", (a, b) -> a + b); // 초기값이 있기때문에 optional 안나옴
        System.out.println("r1 = " + r1);
        System.out.println("----");


        Integer r2 = list.stream()
                .map(s -> s.length())
                .reduce(0, (x, y) -> x + y); // 초기값이 있기때문에 optional 안나옴
        System.out.println("r2 = " + r2);
        System.out.println("----");


    }
}
