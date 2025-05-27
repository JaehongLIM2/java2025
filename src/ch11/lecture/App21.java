package ch11.lecture;

public class App21 {
    public static void main(String[] args) {
        method2();
    }

    public static void method2(){
        // checked Exception 을 unchecked Exception 으로 감싸서 던지기
        try {
            method1();
        } catch (Exception e) {
            new RuntimeException(e);
        }

    }

    public static void method1() throws Exception {

    }
}
