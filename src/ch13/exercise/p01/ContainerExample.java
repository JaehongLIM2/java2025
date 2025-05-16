package ch13.exercise.p01;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<String>();

        container1.set("홍길동");
        String str = container1.get();
        System.out.println("str = " + str);

        Container<Integer> container2 = new Container<Integer>();
        container2.set(6);
        Integer value = container2.get();
        System.out.println("value = " + value);
    }
}
