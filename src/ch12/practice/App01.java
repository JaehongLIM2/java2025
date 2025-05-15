package ch12.practice;

import java.util.Random;
import java.util.Scanner;

public class App01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] hands = {"가위", "바위", "보"};

        while (true) {
            System.out.println("---------------------");
            System.out.println("가위~ 바위~ 보!");
            System.out.println("1. 가위 | 2. 바위 | 3. 보");
            System.out.print("입력 : ");

            String input = scanner.nextLine();

            // 숫자인지 확인 (정규표현식 사용)
            if (!input.matches("[1-3]")) {
                System.out.println("1~3 사이의 숫자를 입력하세요.");
                continue;
            }

            int userChoice = Integer.parseInt(input);
            int computerChoice = random.nextInt(3) + 1;

            System.out.println("내가 낸 것 : " + hands[userChoice - 1] +
                    " | 컴퓨터가 낸 것 : " + hands[computerChoice - 1]);

            int result = (3 + userChoice - computerChoice) % 3;
            if (result == 0) {
                System.out.println("비겼습니다.");
            } else if (result == 1) {
                System.out.println("이겼습니다!");
            } else {
                System.out.println("졌습니다.");
            }
        }
    }
}