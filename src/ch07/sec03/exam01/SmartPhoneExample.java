package ch07.sec03.exam01;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone p = new SmartPhone("갤럭시", "은색");

        System.out.println("모델 = " + p.getModel());
        System.out.println("컬러 = " + p.getColor());

    }
}
