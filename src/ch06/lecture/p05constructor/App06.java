package ch06.lecture.p05constructor;

public class App06 {
    public static void main(String[] args) {
        MyClass61 a = new MyClass61();
        MyClass61 b = new MyClass61("a");
        MyClass61 c = new MyClass61(2);

        MyClass62 d = new MyClass62();

//        MyClass63 e = new MyClass63();
        MyClass63 f = new MyClass63(3);

    }
}

class MyClass61 {
    MyClass61() {

    }

    MyClass61(String a) {

    }

    MyClass61(int a) {

    }
}

class MyClass62 {
    // 생성자를 작성하지 않으면 파라미터 없는 생성자가 자동으로 추가됨
}

class MyClass63 {
    // 파라미터 있는 생성자를 만들면
    // 파라미터 없는 생성자는 자동으로 추가되지 않음
    MyClass63(int a) {

    }
}

class MyClass64 {
    // 파라미터 있는 생성자와
    // 파라미터 없는 생성자가 모두 필요하면
    // 다 작성해야 함
    MyClass64() {

    }

    MyClass64(int a) {

    }

}