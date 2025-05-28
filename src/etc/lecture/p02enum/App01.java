package etc.lecture.p02enum;

public class App01 {
    public static void main(String[] args) {
        var val1 = Value.TIGER;
        var val2 = Value.EAGLE;

        Animals v3 = Animals.LION;
        Animals v4 = Animals.EAGLE;
        var v5 = Animals.BULL;

        System.out.println(v3.name());
        System.out.println(v5.name());

        System.out.println(v3.ordinal());
        System.out.println(v5.ordinal());

        String s1 = "TIGER";
        Animals v6 = Animals.valueOf(s1);
        System.out.println("v6 = " + v6);
        System.out.println(v6 == Animals.TIGER);
    }
}

class Value {
    public static final int TIGER = 1;
    public static final int LION = 1;
    public static final int EAGLE = 1;
    public static final int BULL = 1;

}

// enum : 값들을 나열한 타입
enum Animals {
    TIGER, LION, EAGLE, BULL
}
