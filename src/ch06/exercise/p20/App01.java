package ch06.exercise.p20;

import java.util.Scanner;

public class App01 {
    public static void main(String[] args) {

        Account[] accounts = new Account[100];
        Account account = new Account();
        AccountNumber accountNumber = new AccountNumber();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("------------------------------------------");
            System.out.println("1.계좌생성 |2.계좌목록 |3.예금 |4.출금 |5. 종료");
            System.out.println("------------------------------------------");
            System.out.print("선택>");
            int input1 = Integer.parseInt(scanner.nextLine());

            switch (input1) {
                case 1: {
                    System.out.println("----------");
                    System.out.println("계좌생성");
                    System.out.println("----------");
                    System.out.print("계좌번호 : ");
                    String inputAccount = scanner.nextLine();
                    accountNumber.setAccountNumber(inputAccount);
                    System.out.print("계좌주 : ");
                    String inputName = scanner.nextLine();
                    account.setName(inputName);
                    System.out.print("초기입금액 : ");
                    int inputMoney = Integer.parseInt(scanner.nextLine());
                    accountNumber.setMoney(inputMoney);
                    System.out.println("결과 : 계좌가 생성되었습니다.");
                    break;
                }

                case 2: {
                    System.out.println("----------");
                    System.out.println("계좌목록");
                    System.out.println("----------");
                    System.out.println(accountNumber.getAccountNumber() +
                            "    " +
                            account.getName() +
                            "    " +
                            accountNumber.getMoney());
                    break;

                }
                case 3: {
                    System.out.println("----------");
                    System.out.println("예금");
                    System.out.println("----------");
                    System.out.print("계좌번호 : ");
                    String inputAccount = scanner.nextLine();

                    if (account == null) {
                        System.out.println("해당 계좌가 없습니다.");
                        break;
                    }

                    System.out.print("예금액 : ");
                    int inputMoney = Integer.parseInt(scanner.nextLine());
                    accountNumber.setMoney(accountNumber.getMoney() + inputMoney);
                    System.out.println("예금이 완료되었습니다. 현재 잔액: " + accountNumber.getMoney());
                    break;
                }
                case 4: {
                    System.out.println("----------");
                    System.out.println("출금");
                    System.out.println("----------");
                    System.out.print("계좌번호 : ");
                    String inputAccount = scanner.nextLine();

                    if (account == null) {
                        System.out.println("해당 계좌가 없습니다.");
                        break;
                    }

                    System.out.print("출금액 : ");
                    int inputMoney = Integer.parseInt(scanner.nextLine());
                    if (accountNumber.getMoney() < inputMoney) {
                        System.out.println("잔액이 부족합니다.");
                    } else {
                        accountNumber.setMoney(accountNumber.getMoney() - inputMoney);
                        System.out.println("출금이 완료되었습니다. 현재 잔액: " + accountNumber.getMoney());
                    }
                    break;

                }
                case 5: {
                    System.out.println("프로그램 종료");
                    running = false;
                    break;
                }
                default: {
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
                    break;
                }
            }

        }
    }
}
