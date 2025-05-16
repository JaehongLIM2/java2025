package ch13.lecture;

public class App06 {

}

// bounded type parameter 
// 타입을 제한함
class Box062<T extends String> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void action() {
        // Object 의 메소드 사용 가능
//        String o = (String) item;
//        o.toUpperCase();

        // bounded type parameter 로 특정 타입의 메소드를 사용 가능

        String upperCase = item.toUpperCase();
        System.out.println(upperCase);

    }
}


class Box061<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void some() {
        // item 의 메소드는 Object 의 것만 사용 가능
        System.out.println(item.hashCode());
        System.out.println(item.toString());
        System.out.println(item.equals(null));

    }
}
