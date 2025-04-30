package ch04.practice;

import java.util.Scanner;

public class C07While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean run = true;
        int balance = 0;

        while (run) {
            System.out.println("----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("----------------------------------");
            System.out.print("선택 : ");

            String strNum = scanner.nextLine();


            switch (strNum) {
                case "1":
                    System.out.print("예금액 : ");
                    int deposits = Integer.parseInt(scanner.nextLine());
                    balance += deposits;
                    break;

                case "2":
                    System.out.print("출금액 : ");
                    int withdrawal = Integer.parseInt(scanner.nextLine());
                    if (withdrawal > balance) {
                        System.out.println("잔고 부족");
                    } else {
                        balance -= withdrawal;
                    }
                    break;

                case "3":
                    System.out.println("잔고 : " + balance);
                    break;

                case "4":
                    run = false;

                default:
                    System.out.println();
                    System.out.println("잘못 입력하였습니다.");
                    System.out.println("다시 입력해주세요.");
            }


        }
        System.out.println();

        System.out.println("프로그램 종료");

    }
}
