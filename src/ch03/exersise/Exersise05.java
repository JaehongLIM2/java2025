package ch03.exersise;

public class Exersise05 {
    public static void main(String[] args) {
        // (윗 변 + 아랫 변) * 높이 / 2 : 사다리꼴의 넓이

        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area1 = ((double) (lengthTop + lengthBottom) * height / 2);
        System.out.println("area = " + area1);
        double area2 = (double) ((lengthTop + lengthBottom) * height / 2);
        System.out.println("area2 = " + area2);
        double area3 = (lengthBottom + lengthTop) * height / 2.0;
        System.out.println("area3 = " + area3);
        double area4 = (lengthTop + lengthBottom) * height * 1.0 / 2;
        System.out.println("area4 = " + area4);


    }
}
