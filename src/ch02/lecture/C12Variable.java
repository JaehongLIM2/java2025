package ch02.lecture;

public class C12Variable {
    public static void main(String[] args) {
        // 영문 대소문자 , $, _, 숫자
        // 숫자로 시작할 수 없음
        // 의미 있는 이름으로
        // lowerCamelCase 사용
        // 예약어(키워드) 사용 불가 : class, int . . .

        int modelName; // ok
//        int class; // class가 예약어임
//        int 6hour; // 숫자로 시작할 수 없음
        int $value; // ok 이지만 관습에 적합하지 않음
        int _age; // ok 이지만 관습에 적합하지 않음
//        int #name; // #은 사용 불가
//        int int; // int 가 예약어임

    }
}
