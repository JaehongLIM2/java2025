package ch12.sec12;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
    public static void main(String[] args) {

        Method[] methods = Service.class.getDeclaredMethods();

        for (var method : methods) {
            System.out.println(method.getName());
            var printAnnotation = method.getAnnotation(PrintAnnotation.class);
            printLine(printAnnotation);

        }
    }

    public static void printLine(PrintAnnotation printAnnotation) {
        int number = printAnnotation.number();

        for (int i = 0; i < number; i++) {
            System.out.print(printAnnotation.value());
        }
        System.out.println();

    }
}

