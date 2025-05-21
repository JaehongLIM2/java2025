package ch15.sec05.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);
        for (Integer s : scores) {
            System.out.println(s + " ");
        }
        System.out.println("\n");

        System.out.println("scores.first() = " + scores.first());
        System.out.println("scores.last() = " + scores.last());
        System.out.println("scores.lower() = " + scores.lower(95));
        System.out.println("scores.higher() = " + scores.higher(95));
        System.out.println("scores.floor() = " + scores.floor(95));
        System.out.println("scores.ceiling() = " + scores.ceiling(85) + "\n");

        NavigableSet<Integer> decendingScores = scores.descendingSet();
        for (Integer s : decendingScores) {
            System.out.println(s + " ");
        }
        System.out.println("\n");

        NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
        for (Integer s : rangeSet) {
            System.out.println(s + " ");
        }
        System.out.println("\n");

        rangeSet = scores.subSet(80, true, 90, false);
        for (Integer s : rangeSet) {
            System.out.println(s + " ");
        }
    }
}
