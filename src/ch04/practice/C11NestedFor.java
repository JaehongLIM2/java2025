package ch04.practice;

public class C11NestedFor {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("#");
            }
            System.out.println("");
        }

        System.out.println("------");

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("------");

        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("------");

        for (int i = 1; i <= 5; i++) {
            int m = 1;
            for (int j = 0; j < i; j++) {
                System.out.print(m++);
            }
            m = 1;
            System.out.println("");
        }

        System.out.println("------");

        int num = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(num);
                num = (num + 1) % 10;
            }
            System.out.println();
        }

        System.out.println("------");

        int num1 = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(num1);
                num1 = (num1 + 1) % 10;
            }
            System.out.println();
        }

        System.out.println("------");


        int n = 9;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || j == n - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("------");


        for (int i = 0; i < n; i++) {
            int space = Math.abs(4 - i);
            int stars = 9 - 2 * space;

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                if (j == 0 || j == stars - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("------");


        for (int i = 0; i < n; i++) {
            int space = Math.abs(4 - i);
            int stars = 9 - 2 * space;

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                if (j == 0 || j == stars - 1 || i == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
