package ch04.practice;

public class C08For {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("----------");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("----------");

        for (int i = 0; i < 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------");

        for (int i = 4; i >= 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("----------");

        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------");

        for (int i = 0; i < 5; i++) {
            System.out.print("* ");
        }
        System.out.println();
        System.out.println("----------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println();
        System.out.println("----------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println();
        System.out.println("----------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println();
        System.out.println("----------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println();
        System.out.println("----------");

        for (int i = 1; i <= 5; i++) {
            for (int k = 0; k < 5 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 11 - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
