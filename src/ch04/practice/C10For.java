package ch04.practice;

public class C10For {
    public static void main(String[] args) {

        String s = "*";
        for (int i = 0; i < 5; i++, s += "*") {
            System.out.println(s);
        }
    }
}
