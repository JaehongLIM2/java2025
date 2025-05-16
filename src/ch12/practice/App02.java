package ch12.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App02 {
    public static void main(String[] args) {
        // 사용자로부터 입력받아서
        Scanner scanner = new Scanner(System.in);


        // 한글 3글자 이상인지 확인하는 코드 작성

        while (true) {
            System.out.print("입력 : ");
            String userInput = scanner.nextLine();
            boolean run = Pattern.matches("[가-힣]{3,}", userInput);


            if (run) {
                System.out.println("한글 3글자 이상 입력하셨습니다.");
            } else {
                System.out.println("한글 3글자 이상 입력하지않으셨습니다.");
            }
        }


    }
}
