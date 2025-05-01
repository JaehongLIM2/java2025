package ch05.lecture;

public class C06Length {
    public static void main(String[] args) {
        int[] a = {98, 12, 31, 54};


        for (int i = 0; i < 4; i++) {
            System.out.println(a[i]);
        }
        // length 속성 : 배열의 길이

        System.out.println("a.length = " + a.length);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        // 첫 번째 index : 0
        //  마지막 index : length - 1

        System.out.println("마지막값 = " + a[a.length - 1]);

    }
}
