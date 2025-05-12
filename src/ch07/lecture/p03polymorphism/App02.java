package ch07.lecture.p03polymorphism;

public class App02 {
    public static void main(String[] args) {

        SuperClass02 a = new SuperClass02();
        SubClass021 b = new SubClass021();
        SubClass022 c = new SubClass022();
        Subclass023 d = new Subclass023();
        Subclass024 e = new Subclass024();


        // 자동형변환
        
        // b
        SubClass021 f = b;
        SuperClass02 g = f;

        // c
        SubClass022 h = c;
        SuperClass02 i = h;

        // d
        Subclass023 j = d;
        SubClass021 k = d;
        SuperClass02 l = d;

        // 3
        Subclass024 m = e;
        SubClass022 n = e;
        SuperClass02 o = e;


    }
}


// @formatter:off
class SuperClass02 {}
class SubClass021 extends SuperClass02 {}
class SubClass022 extends SuperClass02 {}

class Subclass023 extends SubClass021 {}
class Subclass024 extends SubClass022 {}
// @formatter:on