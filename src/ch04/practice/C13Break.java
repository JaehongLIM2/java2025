package ch04.practice;

public class C13Break {
    public static void main(String[] args) {


        boolean goal = false;


        for (int x = 1; x < 11; x++) {
            for (int y = 1; y < 11; y++) {
                if ((4 * x) + (5 * y) == 60) {
                    System.out.println(x + ", " + y);
                    goal = true;
                }
            }
            if (goal) {
                break;
            }
        }
    }
}
