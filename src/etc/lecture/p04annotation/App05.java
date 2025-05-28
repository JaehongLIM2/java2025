package etc.lecture.p04annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class App05 {
    public static void main(String[] args) {

    }
}


@Target({ElementType.FIELD})
@interface MyAnnotation5 {

}
