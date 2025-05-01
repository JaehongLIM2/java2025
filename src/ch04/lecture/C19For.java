package ch04.lecture;

public class C19For {
    public static void main(String[] args) {
        // 구구단
//        2 X 1
//        2 X 2
//        2 X 3
//        ...
//        9 X 9

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
            System.out.println("");
        }
    }
}
