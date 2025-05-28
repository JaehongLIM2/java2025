package etc.sec01;

public class VarExample1 {
    public static void main(String[] args) {
        String name = getData();
        var userName = getData();
    }

    private static String getData() {
        return "홍길동";
    }
}
