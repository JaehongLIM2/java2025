package ch05.lecture;

public class C26StringMethod {
    public static void main(String[] args) {
        // indexOf : 특정 문자열이 처음 발견된 위치를 리턴

        String a = "hello java hello spring heelo react";
        int b = a.indexOf("java");
        System.out.println("b = " + b);
        int c = a.indexOf("hello");
        System.out.println("c = " + c);
        int d = a.indexOf("jsp");
        System.out.println("d = " + d); // -1

        // contains : 특정 문자열이 있는 지 확인
        boolean e = a.contains("java");
        System.out.println("e = " + e);
        boolean f = a.contains("ring");
        System.out.println("f = " + f);
        boolean g = a.contains("jsp");
        System.out.println("g = " + g);

        // startsWith : 특정 문자열로 시작하는 지
        boolean h = a.startsWith("hello");
        System.out.println("h = " + h);
        boolean i = a.startsWith("hell");
        System.out.println("i = " + i);
        boolean j = a.startsWith("heaven");
        System.out.println("j = " + j);

        // endsWith : 특정 문자열로 끝나는 지
        boolean k = a.endsWith("react");
        System.out.println("k = " + k);
        boolean l = a.endsWith("act");
        System.out.println("l = " + l);
        boolean m = a.endsWith("stop");
        System.out.println("m = " + m);

        // lastIndexOf : 특정 문자열이 마지막에 나타나는 위치 리턴
        int n = a.lastIndexOf("hello");
        System.out.println("n = " + n);
        int o = a.lastIndexOf("jsp");
        System.out.println("o = " + o);


    }
}
