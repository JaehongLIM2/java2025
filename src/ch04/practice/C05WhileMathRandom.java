package ch04.practice;

public class C05WhileMathRandom {
    public static void main(String[] args) {


        while (true) {
            int i = ((int) (Math.random() * 6) + 1);
            int j = ((int) (Math.random() * 6) + 1);
            System.out.println("(" + i + "," + j + ")");
            if (i + j == 5) {
                System.out.println("종료");
                break;

            }
        }
    }
}
