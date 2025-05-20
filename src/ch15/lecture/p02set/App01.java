package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class App01 {
    public static void main(String[] args) {
        // Set : 같은 객체를 여러번 저장할 수 없음
        //       탐색 순서가 보장되지 않음


        Set<String> set = new HashSet<>();

        // 요소(element) 추가
        set.add("java");
        boolean r1 = set.add("spring");
        System.out.println("r1 = " + r1); // true 면 정상적으로 들어감

        set.add("html");
        System.out.println(set);
        set.add("css");
        System.out.println(set);
        boolean r2 = set.add("spring");// 중복된 요소는 들어가지 않음
        System.out.println("r2 = " + r2); // false 면 중복됨 || 정상적으로 들어가지않음

        System.out.println(set);
        set.add(null); // null 도 넣을 수 있다
        System.out.println(set);
        set.add(null); // 마찬가지로 중복되면 들어가지않음
        System.out.println(set);

        System.out.println("--------");
        // 요소 삭제 : set 은 index가 없기때문에 위치번호로 삭제 불가능
        boolean r3 = set.remove("spring");
        System.out.println("r3 = " + r3); // 지워졌으면 true return
        System.out.println(set);
        set.remove(null);
        System.out.println(set);
        boolean r4 = set.remove("react");// 없는 것을 지워도 아무 일 일어나지 않음
        // 지워지지 않았으면 false return
        System.out.println("r4 = " + r4);
        System.out.println(set);


        System.out.println("--------");
        // 요소의 갯수 확인
        int size = set.size();
        System.out.println("size = " + size);

        boolean r5 = set.isEmpty();
        System.out.println("r5 = " + r5);

        boolean r6 = !set.isEmpty();
        System.out.println("r6 = " + r6);

        // 전체 탐색하기

    }
}
