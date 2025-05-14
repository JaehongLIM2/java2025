package ch08.lecture.p06etc;

public class App05 {

}

interface MyInterfacer05 {
    static void action1() {
        System.out.println("MyInterfacer05.action1");
        common();
    }

    static void action2() {
        System.out.println("MyInterfacer05.action2");
        common();
    }

    // private static method
    private static void common() {
        System.out.println("매우 긴 코드");
    }

}
