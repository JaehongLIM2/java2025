package ch14.lecture;

public class App03 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(1);

        Thread.sleep(500); // ms 단위 / 0.5 초

        System.out.println(2);

        Thread.sleep(1000); // ms 단위 / 1 초

        System.out.println(3);

        Thread.sleep(2000); // ms 단위 / 2 초

        System.out.println(4);
    }
}
