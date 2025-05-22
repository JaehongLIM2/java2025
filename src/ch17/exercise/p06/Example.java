package ch17.exercise.p06;

import java.util.List;
import java.util.OptionalDouble;

public class Example {
    public static void main(String[] args) {
        List<Member> list = List.of(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 26)
        );

        double avg3 = list.stream()
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();
        System.out.println("기본타입 = " + avg3);

        // for 문
        double sum = 0;
        for (Member member : list) {
            sum += member.getAge();
        }
        double avg1 = sum / list.size();
        System.out.println("for문 = " + avg1);


        // 참조타입 Stream
        Integer sum2 = list.stream()
                .map(Member::getAge)
                .reduce(0, Integer::sum);
        double avg2 = sum2.doubleValue() / list.size();
        System.out.println("참조타입 = " + avg2);


    }
}
