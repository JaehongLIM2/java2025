package ch06.sec14;

public class CarExample {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.setSpeed(-50);
        System.out.println("c1.getSpeed() = " + c1.getSpeed());

        c1.setSpeed(60);
        System.out.println("c1.getSpeed() = " + c1.getSpeed());

        if (!c1.isStop()) {
            c1.setStop(true);
        }
        System.out.println("c1.getSpeed() = " + c1.getSpeed());
    }
}
