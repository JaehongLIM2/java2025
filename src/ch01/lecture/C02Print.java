package ch01.lecture;

public class C02Print  {
    public static void main(String[] args) {
        // 출력
        System.out.println("출력 메세지");
        // 단축키 sout : System.out.println

        // shift + enter : 다음 줄에 작성
        System.out.println("또 다른 출력");

        // print : 끝에 다음줄 없음
        System.out.print("또또 다른 출력");

        System.out.print("22 출력");

        System.out.println("이번엔 줄바꿈이 생김");
        System.out.println("줄바꿈이 생겼지");

        // printf : 특정 위치에 값 포함 출력
        System.out.printf("hello");
        System.out.printf("hello2");
        System.out.printf("\nhello3");
        System.out.printf("\nhello4");
        System.out.printf("값%s값%s\n","a","b");
        System.out.printf("12345678901234567890\n");
        // %숫자s : 숫자만큼 자리 차지
        System.out.printf("%5s%3s\n","12","34");
        // %-숫자s : 숫자만큼 자리 차지(왼쪽 정렬)
        System.out.printf("%-5s%-3s\n","12","34");
        // %d : 정수형 출력
        System.out.printf("%s%d\n", "hi", 987);
        // %f : 실수형 출력
        System.out.printf("%s%d%f\n", "hello", 934, 3.14);
        // %10.3 : 총 10자리, 소수점 이하 3자리
        System.out.printf("%10.3f\n",3.14);


        // \n : 다음 줄(enter)
        System.out.print("\n"); // 새로운 줄
        System.out.println("Java\n안녕");


    }
}
