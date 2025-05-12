package ch07.lecture.p03polymorphism;

public class App01 {
    public static void main(String[] args) {
        // 자동형변환


        SuperClass01 a = new SuperClass01();
        SubClass011 b = new SubClass011();
        SuperClass01 c = a;
        SubClass011 d = b;

        SuperClass01 e = b; // ok

        System.out.println(a == c);
        System.out.println(b == d);
        System.out.println(e == b);
        System.out.println(d == b);

        SubClass012 f = new SubClass012();
        SuperClass01 g = f;
        System.out.println(g == f);

        SuperClass01 h = new SubClass012();

        // 아래 코드들은 안됨
        SuperClass01 i = new SuperClass01();
//        SubClass011 j = i;
//        SubClass012 k = i;

        SubClass011 l = new SubClass011();
//        SubClass012 m = l;
        SubClass012 n = new SubClass012();
//        SubClass011 o = n;


    }

}


// @formatter:off
class SuperClass01 { }

class SubClass011 extends SuperClass01{ }

class SubClass012 extends SuperClass01{ }
// @formatter:on