package ch17.sec11;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ReductionExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 92),
                new Student("신용권", 95),
                new Student("감자바", 88)
        );

        int sum1 = list.stream()
                .mapToInt(Student::getScore)
                .sum();
        System.out.println("---");

        Integer sum2 = list.stream()
                .map(student -> student.getScore())
                .reduce(0, (x, y) -> x + y);
        System.out.println("---");

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);


    }
}
