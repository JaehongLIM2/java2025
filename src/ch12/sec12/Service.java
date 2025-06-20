package ch12.sec12;

public class Service {

    @PrintAnnotation()
    public void method1() {
        System.out.println("Service.method1");
    }

    @PrintAnnotation("*")
    public void method2() {
        System.out.println("Service.method2");
    }

    @PrintAnnotation(value = "#", number = 20)
    public void method3() {
        System.out.println("Service.method3");
    }

}