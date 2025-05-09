package ch06.sec06.exam01;

public class KoreanExample {
    public static void main(String[] args) {

        Korean k1 = new Korean("950817-1231342", "임재홍");

        System.out.println(k1.nation);
        System.out.println(k1.name);
        System.out.println(k1.ssn);

        k1.name = "감자바";
        System.out.println(k1.name);

        Korean k2 = new Korean("102394-1923921", "공공공");
        System.out.println(k2.ssn);
        System.out.println(k2.nation);
        System.out.println(k2.name);

    }
}
