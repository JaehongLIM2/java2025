package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();

        parent.filed1 = "data1";
        parent.method1();
        parent.method2();

        // 강제형변환(type casting)(위험)
        Child child = (Child) parent;
        child.field2 = "data2";
        child.method3();
    }
}
