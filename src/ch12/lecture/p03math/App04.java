package ch12.lecture.p03math;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**1 ~ 10 사이의 숫자 3개 맞추기 게임**");
        // 1 ~ 10숫자 3개 맞추는 게임
        // 1. 사용자에게 3개 숫자 입력받고
        System.out.println("3개의 숫자를 ,로 구분해서 입력해주세요.");
        System.out.print("입력 : ");
        String line = scanner.nextLine();
        String[] numbers = line.split(",");
        int[] num = {
                Integer.parseInt(numbers[0]),
                Integer.parseInt(numbers[1]),
                Integer.parseInt(numbers[2]),
        };
        // 2. 컴퓨터가 3개 숫자 임의 뽑아서
        int count = 0;
        int[] coms = new int[3];
        Random random = new Random();
        while (count < 3) {
            int r = random.nextInt(10) + 1;
            boolean already = false;
            for (int i = 0; i < coms.length; i++) {
                if (r == coms[i]) {
                    already = true;
                }
            }
            if (!already) {
                coms[count] = r;
                count++;
            }
        }
        // 중간출력
        System.out.println("사용자 : " + Arrays.toString(num));
        System.out.println("컴퓨터 : " + Arrays.toString(coms));

        // 3. 몇 개 일치하는 지 확인
        int right = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < coms.length; j++) {
                if (num[i] == coms[j]) {
                    right++;
                }
            }
        }
        switch (right) {
        //      3개 맞으면 1등
            case 3 -> {
                System.out.println("다 맞췄습니다");
            }
        //      2개 맞으면 2등
            case 2 -> {
                System.out.println("2개 맞췄습니다.");
            }
        //      1개 맞으면 3등
            case 1 -> {
                System.out.println("1개 맞췄습니다.");
            }
        //      0개 맞으면 꽝
            default -> {
                System.out.println("꽝 ;");
            }
        }




        System.out.println("**게임 종료**");
    }
}
