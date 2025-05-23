package ch08.sec07;

public interface Service {
    default void defaultMethod1() {
        System.out.println("Service.defaultMethod1");
        defaultCommon();
    }

    default void defaultMethod2() {
        System.out.println("Service.defaultMethod2");
        defaultCommon();
    }

    private void defaultCommon() {
        System.out.println("Service.defaultCommon 중복코드 1");
        System.out.println("Service.defaultCommon 중복코드 2");
    }

    static void staticMethod1() {
        System.out.println("Service.staticMethod1");
        staticCommon();
    }

    static void staticMethod2() {
        System.out.println("Service.staticMethod2");
        staticCommon();
    }

    private static void staticCommon() {
        System.out.println("Service.staticCommon 중복코드 3");
        System.out.println("Service.staticCommon 중복코드 4");

    }
}
