package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App03 {
    public static void main(String[] args) {
        System.out.println("[a-zA-Z0-9_]"); // 영문 대소문자, 숫자, 언더바(_)
        System.out.println(Pattern.matches("[a-zA-Z0-9_]", "q")); // 영문 대소문자, 숫자, 언더바(_)
        // \w : [a-zA-Z0-9_]
        // 자바에서 "" 안에 \ 는 \\ 으로 사용해야함
        System.out.println(Pattern.matches("\\w", "q")); // 영문 대소문자, 숫자, 언더바(_)
        System.out.println(Pattern.matches("\\w\\w", "qq")); //true
        System.out.println(Pattern.matches("\\w\\w\\w", "qqq")); // true
        System.out.println(Pattern.matches("\\w\\w\\w", "qq")); // false


    }
}
