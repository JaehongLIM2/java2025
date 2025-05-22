package ch11.lecture;

public class App06 {
    public static void main(String[] args) {

        try {
            int[] arr = {5, 0};
            int c = arr[0] / arr[1];
            System.out.println("프로그램 진행됨");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("예외코드");
        } catch (ArithmeticException e) {
            System.out.println("예외 처리 코드");
        }
        System.out.println("나머지 코드들 . . .");


        System.out.println("--------");

        try {
            int[] arr2 = {5, 0};
            int c = arr2[0] / arr2[1];
            System.out.println("프로그램 진행됨");
        } catch (IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("예외코드");
        }
        System.out.println("나머지 코드들 . . .");
    }
}
