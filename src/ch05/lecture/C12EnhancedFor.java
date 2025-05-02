package ch05.lecture;

public class C12EnhancedFor {
    public static void main(String[] args) {
        System.out.println("---- 그냥 for 문 ----");
        int[] a = {88, 78, 46, 33, 4, 6, 1, 3};
        // for
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        // enhanced for
        System.out.println("---- 향상된 for 문 ----");
        for (int item : a) {
            System.out.println(item);
        }

        String[] b = {"java", "react", "spring", "html", "css"};
        for (String s : b) {
            System.out.println(s);
        }

        double[] c = {3.14, 2.24, 1.51};
        for (double d : c) {
            System.out.println(d);
        }


    }
}
