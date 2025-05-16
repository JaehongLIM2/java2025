package ch12.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App03 {
    public static void main(String[] args) {
        // 사용자 입력 받아서
        Scanner scanner = new Scanner(System.in);
        String phoneNumber = "010(-?|\\s?)\\d{4}(-?|\\s?)\\d{4}";

        // 유효한 전화번호 인지 확인\

        while (true) {
            System.out.print("전화번호 입력 : ");
            String userInput = scanner.nextLine();
            boolean matches = Pattern.matches(phoneNumber, userInput);


            if (matches) {
                System.out.println("패턴에 일치하는 전화번호입니다.");
            } else {
                System.out.println("패턴에 일치하지 않는 전화번호입니다.");
            }
            System.out.println();
        }

        // 아래 전화번호들은 패턴에 일치하는 것들
        // 010-99998888
        // 010-9999-8888
        // 010 9999 8888
        // 010-99998888
        // 010 99998888

    }
}
