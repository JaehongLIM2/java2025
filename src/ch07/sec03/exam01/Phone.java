package ch07.sec03.exam01;

public class Phone {
    private String model;
    private String color;

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public Phone() {
        System.out.println("Phone() 생성자 실행");
    }
}
