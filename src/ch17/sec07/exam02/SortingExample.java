package ch17.sec07.exam02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("홍길동", 30));
        list.add(new Student("신용권", 10));
        list.add(new Student("유미선", 20));

        list.stream()
                .sorted((a, b) -> a.getScore() - b.getScore())
                .forEach(x -> System.out.println(x.getName() + " : " + x.getScore()));
        System.out.println();

        list.stream()
                .sorted((a, b) -> b.getScore() - a.getScore())
                .forEach(x -> System.out.println(x.getName() + " : " + x.getScore()));
        System.out.println();

        // 명령형

        list.sort(Comparator.comparing(Student::getScore));
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
