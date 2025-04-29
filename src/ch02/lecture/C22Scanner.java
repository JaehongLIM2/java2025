package ch02.lecture;

import java.util.Scanner;

public class C22Scanner {
    public static void main(String[] args) {
        System.out.println("두 값을 더해서 출력");
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 값 : ");
        int s = scanner.nextInt();


        System.out.print("두 번째 값 : ");
        int t = scanner.nextInt();

        System.out.println("더한 값 = " + (s + t));


        System.out.println("프로그램 종료");
    }
}
