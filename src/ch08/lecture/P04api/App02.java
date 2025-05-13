package ch08.lecture.P04api;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Scanner;

public class App02 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        Object a = s;
        Closeable b = s;
        AutoCloseable c = s;
        Iterator d = s;

        System.out.println(a instanceof Scanner);
        System.out.println(a instanceof Object);
        System.out.println(a instanceof Closeable);
        System.out.println(a instanceof AutoCloseable);
        System.out.println(a instanceof Iterator);

        c.close();
//        c.nextline();

    }
}
