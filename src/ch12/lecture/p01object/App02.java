package ch12.lecture.p01object;

import ch07.exercise.p12.B;

public class App02 {
    public static void main(String[] args) {
        Book02 b1 = new Book02();
        Book02 b2 = new Book02();
        Book02 b3 = new Book02();


        b1.setTitle("이것이 자바다");
        b2.setTitle("pro git");
        b3.setTitle("이것이 자바다");

        // 참조값 비교
        System.out.println(b1 == b2); // false

        // equals : 내용이 같은가
        System.out.println(b1.equals(b2)); // false
        System.out.println(b1.equals(b3)); // false
    }
}

class Book02 {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}