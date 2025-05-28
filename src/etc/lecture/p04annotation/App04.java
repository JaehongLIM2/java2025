package etc.lecture.p04annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@MyAnnotation04
public class App04 {

    @MyAnnotation04(name = "홍길동", age = 32)
    public void method() {

    }

    @MyAnnotation05(address = "서울", age = 23)
    public void method2() {

    }

    @MyAnnotation05(age = 13)
    public void method3() {

    }

    @MyAnnotation06(name = {"김창범", "김희철", "김두환"})
    public void method4() {

    }


    @MyAnnotation06(name = "김희철") // 값이 하나일때는 {} 생략 가능
    public void method5() {

    }


    @MyAnnotation07 // defalut 값이 있으면 값을 안써도 됨
    public void method6() {

    }

    @MyAnnotation07("hello") // value 속성은 이름 생략 가능 (value 만 존재할때)
    public void method7() {

    }


}

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation07 {
    String[] name() default "임";

    String address() default "신촌";

    int age() default 0;

    String value() default "";


}


@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation06 {
    String[] name();

}


@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation05 {
    String address() default "seoul";

    int age();
}


@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation04 {

    // element, attribute, 속성
    String name();

    int age();

}
