package ch17.lecture.p01stream;

import java.util.List;
import java.util.stream.Stream;

public class App03 {
    public static void main(String[] args) {
        // Stream : 데이터의 흐름

        List<Integer> list1 = List.of(8, 5, 7, 1, 2, 3, 4);
        Stream<Integer> stream1 = list1.stream();
        Stream<Integer> stream2 = stream1.filter(i -> i % 2 == 0);

        long stream2Count = stream2.count();
        System.out.println("stream2Count = " + stream2Count);

        // stream 을 재사용 할 수 없음
//        Stream<Integer> stream3 = stream1.filter(i -> i % 2 == 1);
//        System.out.println("stream3 = " + stream3);

        // 다른 연산을 할 시 stream을 처음부터 다시 생성해야함
        Stream<Integer> stream3 = list1.stream();
        Stream<Integer> stream4 = stream3.filter(i -> i % 2 == 1);
        long stream4Count = stream4.count();
        System.out.println("stream4Count = " + stream4Count);

        
    }
}
