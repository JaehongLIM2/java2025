package ch13.exercise.p02;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String, String> container1 = new Container<String, String>();
        container1.set("홍길동", "도적");
        String name1 = container1.getKey();
        String job = container1.getValue();
        System.out.println("container1.getKey() = " + container1.getKey());
        System.out.println("container1.getValue() = " + container1.getValue());

        Container<String, Integer> container2 = new Container<String, Integer>();
        container2.set("홍길동", 35);
        String name = container2.getKey();
        int age = container2.getValue();
        System.out.println("container2.getKey() = " + container2.getKey());
        System.out.println("container2.getValue() = " + container2.getValue());


    }
}
