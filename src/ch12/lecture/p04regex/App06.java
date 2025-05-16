package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App06 {
    public static void main(String[] args) {
        // {n,m} : n ~ m 개
        // {n,}  : n 개 이상
        // {n} : n개

        // + : {1,} : 한 개 이상
        // * : {0,} : 0 개 이상
        // ? : {0,1} : 0 ~ 1 개

        System.out.println(Pattern.matches("[0-9]", "2")); // true
        System.out.println(Pattern.matches("[0-9]+", "223231")); // true
        System.out.println(Pattern.matches("[0-9]+", "")); // false
        System.out.println("----");
        System.out.println(Pattern.matches("[0-9]*", "2")); // true
        System.out.println(Pattern.matches("[0-9]*", "2231")); // true
        System.out.println(Pattern.matches("[0-9]*", "")); // true
        System.out.println("----");
        System.out.println(Pattern.matches("[0-9]?", "2")); // true
        System.out.println(Pattern.matches("[0-9]?", "2231")); // false
        System.out.println(Pattern.matches("[0-9]?", "")); // true
    }
}
