package ch15.sec08;

import java.util.*;

public class ImmutableExample {
    public static void main(String[] args) {
        List<String> list1 = List.of("A", "B", "C");
        Set<String> set1 = Set.of("A", "B", "C");
        Map<Integer, String> map1 = Map.of(
                1, "A",
                2, "B",
                3, "C"
        );

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        List<String> list2 = List.copyOf(list);

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        Set<String> set2 = Set.copyOf(set);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        Map<Integer, String> map2 = Map.copyOf(map);

        // Arrays.asList : 배열을 List 로 만드는 메소드
        String[] arr = {"A", "B", "C"};
        List<String> list3 = Arrays.asList(arr);
    }
}
