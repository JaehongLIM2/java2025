package ch08.exercise.p03;

import javax.swing.text.Segment;

public class App01 {
    public static void main(String[] args) {
        // 배열이 인터페이스 타입일 경우 다양한 구현 객체를 저장할 수 있다.
        CharSequence[] arr = new CharSequence[100];
        arr[0] = "java";
        arr[1] = new StringBuffer("");
        arr[2] = new StringBuilder("");
        arr[3] = new Segment();

        System.out.println("안전! 안전! 안전!");
    }
}
