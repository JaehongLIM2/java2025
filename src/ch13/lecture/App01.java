package ch13.lecture;

public class App01 {
    public static void main(String[] args) {
        Box01 box = new Box01();
        box.setItem(99);
        Integer v = box.getItem();
        System.out.println("v = " + v);

//        box.setItem(3.14);


    }

}

class Box01 {
    private Integer item;

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }
}
