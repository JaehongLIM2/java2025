package ch03.lecture;

public class C02Increment {
    public static void main(String[] args) {
        // ++ : 증가 연산자
        // 변수의 값에 1 더한 후, 변수에 다시 대입

        int a = 10;
        System.out.println("a = " + a); // 10
        a++;
        System.out.println("a = " + a); // 11

        // 후위 연산자 : ++ 가 뒤에 붙어있음, 나중에 연산
        System.out.println("a++ = " + a++); // 11
        System.out.println("a = " + a); // 12

        // 전위 연산자 : ++ 가 앞에 붙어있음, 먼저 연산
        System.out.println("++a = " + ++a); // 13
        System.out.println("a = " + a); // 13

        //
        a++;
        System.out.println("a = " + a); // 14
//        System.out.println("++a = " + ++a); // 14

    }

}
