package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App04 {
    public static void main(String[] args) {
        // {n, m} : n개에서 m개 사이 수량(n < m)

        // * 영문대소문자, 숫자, 언더스코어 가 '2~4개
        System.out.println(Pattern.matches("\\w{2,4}", "qwd"));
        System.out.println(Pattern.matches("\\w{2,4}", "9fe"));
        System.out.println(Pattern.matches("\\w{2,4}", "12lf"));
        System.out.println(Pattern.matches("\\w{2,4}", "z")); // false
        System.out.println(Pattern.matches("\\w{2,4}", "2_"));
        System.out.println(Pattern.matches("\\w{2,4}", "1235mfe")); // false

        System.out.println("----------");
        // {n} : 정확히 n개
        // {n,} : n개 이상
        System.out.println(Pattern.matches("\\w{3}", "203")); // true
        System.out.println(Pattern.matches("[가-힣]{3}", "손흥민")); // true
        System.out.println(Pattern.matches("[가-힣]{3,}", "집에가고싶다")); // true
        System.out.println(Pattern.matches("[가-힣]{3,}", "아아")); // false
        System.out.println(Pattern.matches("[가-힣]{3,}", "203")); // false


    }
}
