package ch05.lecture;

public class C22String {
    public static void main(String[] args) {
        // 9 번째 기본 타입

        String a = "java"; // new 생략 가능
        String f = "java"; // new 생략 가능
        System.out.println(a == f); // true

        String g = "ja";
        String h = "va";
        String i = g + h;


        String b = new String("java");
        String c = new String("react");

        System.out.println(b == c);

        String d = new String("java");
        String e = new String("java");

        System.out.println(d == e); // false

        // 결론 : 문자열의 내용이 같은 지 확인 할 때
        // == 쓰지 말 것!! -> equals() 메소드를 사용하자.

        System.out.println(d.equals(e));
    }
}
