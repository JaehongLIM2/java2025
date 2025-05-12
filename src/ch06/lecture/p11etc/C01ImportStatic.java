package ch06.lecture.p11etc;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


//static import : static member 를 클래스 명시 없이 사용 가능
import static java.lang.Math.random;
import static java.lang.Math.PI;
import static java.lang.Math.*; // * 로 모든 멤버 import 가능

public class C01ImportStatic {
    public static void main(String[] args) {
        // 다른 패키지에 있는 클래스 사용할때 import
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        random();
        double v = PI * 10;

    }
}
