package ch13.lecture;

public class App03 {
    public static void main(String[] args) {
        Box03 b = new Box03();
        b.setItem(3.14);
        Object item = b.getItem();
        System.out.println("item = " + item);

        b.setItem(99);
        Object item1 = b.getItem();
        System.out.println("item1 = " + item1);
        if (item1 instanceof String) {
            String x = (String) item1; // ClassCastException
            x.toUpperCase();
        }
        b.setItem("java");
        Object item2 = b.getItem();
        System.out.println("item2 = " + item2);
        if (item2 instanceof String) {
            String item4 = (String) item2;
            String u = item4.toUpperCase();
            System.out.println("u = " + u);
        }
    }
}

class Box03 {
    private Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}
