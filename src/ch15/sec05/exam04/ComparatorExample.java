package ch15.sec05.exam04;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        Set<Fruit> set = new TreeSet<>((a, b) -> a.price - b.price);

        set.add(new Fruit("포도", 3000));
        set.add(new Fruit("수박", 10000));
        set.add(new Fruit("딸기", 6000));

        for (Fruit fruit : set) {
            System.out.println(fruit.name + " : " + fruit.price);
        }
    }
}
