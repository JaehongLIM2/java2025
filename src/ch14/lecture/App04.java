package ch14.lecture;

public class App04 {
    public static void main(String[] args) throws InterruptedException {
        // join() : 특정 Thread 가 끝나길 기다림
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println("스레드 내의 코드");
            }
        });
        thread.start();

        thread.join(); // thread 가 끝나길 기다림
        for (int i = 0; i < 10000; i++) {
            System.out.println("[[메인 스레드 내의 코드]]");
        }
    }
}
