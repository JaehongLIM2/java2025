package ch17.sec07.exam01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("홍길동", 30));
        list.add(new Student("신용권", 10));
        list.add(new Student("유미선", 20));

        list.stream()
                .sorted()
                .forEach(x -> System.out.println(x.getName() + " : " + x.getScore()));


        // 명령형
        Collections.sort(list);
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
