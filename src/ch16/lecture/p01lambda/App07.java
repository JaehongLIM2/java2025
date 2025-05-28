package ch16.lecture.p01lambda;

public class App07 {
    public static void main(String[] args) {
        MyInterface07 a = new MyInterface07() {
            @Override
            public int method() {
                // 코드에 꼭! return 타입에 맞는 return 문을 만나도록 코드 작성
                if (true) {
                    return 3;
                }
                return 5;
            }
        };


        MyInterface07 b = () -> {
            // method 의 body 에 리턴문 하나만 있을 때
            // {} 생략가능, but, 생략시에는 return 생략해야함
            return 5;
        };

        MyInterface07 c = () -> 5;
    }
}

@FunctionalInterface
interface MyInterface07 {
    int method();

}
