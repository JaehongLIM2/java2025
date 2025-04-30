package ch04.practice;

public class C06DoWhile {
    public static void main(String[] args) {

        int i, j;

        do {
            i = ((int) (Math.random() * 6) + 1);
            j = ((int) (Math.random() * 6) + 1);
            System.out.println("(" + i + ", " + j + ")");

        } while (i + j != 5);
    }
}

