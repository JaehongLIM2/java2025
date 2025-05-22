package ch17.exercise.p07;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = List.of(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        List<Member> newList = new ArrayList<>();
        for (Member m : list) {
            if (m.getJob().equals("개발자")) {
                newList.add(m);
            }
        }
        for (Member m : newList) {
            System.out.println(m.getName());
        }

        List<Member> newList2 = list.stream()
                .filter(s -> s.getJob().equals("개발자"))
                .toList();

        newList2.stream()
                .forEach(x -> System.out.println(x.getName()));

    }
}
