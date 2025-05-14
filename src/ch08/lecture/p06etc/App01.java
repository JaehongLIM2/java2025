package ch08.lecture.p06etc;

public class App01 {
    public static void main(String[] args) {
        System.out.println(MyInterface01.AGE);
        System.out.println(MyInterface01.HOME_ADDRESS);
    }

}

interface MyInterface01 {
    // public static final 필드
    int AGE = 1; // (public static final 생략 가능)
    String HOME_ADDRESS = "seoul";


    // 인터페이스로 작성한 메소드는 public 추상 메소드

}

