package ch11.lecture;

public class App07 {
    public static void main(String[] args) {

        try {
            int[] arr = {5, 0};
            int c = arr[0] / arr[2];
            System.out.println("c = " + c);
            // ArithmeticException | IndexOutOfBoundsException 의 상위는 RuntimeException 이기때문에
            // 다형성으로 가능
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println("예외 처리 코드");
        }
    }
}
