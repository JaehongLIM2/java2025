package ch13.lecture;

public class App04 {
    public static void main(String[] args) {
        Box04<Integer> b1 = new Box04<Integer>();
        b1.setItem(99);
//        b1.setItem(3.14);
        Integer item = b1.getItem();
        System.out.println("item = " + item);

        System.out.println("---");

        Box04<Double> b2 = new Box04<Double>();
        b2.setItem(3.144);
        Double item1 = b2.getItem();
        System.out.println("item1 = " + item1);

        System.out.println("---");

        Box04<String> b3 = new Box04<String>();
        b3.setItem("java");
        String item2 = b3.getItem();
        System.out.println("item2 = " + item2);
        String upperCase = item2.toUpperCase();
        System.out.println("upperCase = " + upperCase);


    }
}


// generic type : 아직 결정되지 않은 타입
// <T> : 타입 파라미터
class Box04<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
