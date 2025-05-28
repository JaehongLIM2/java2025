package ch12.sec12;

public @interface PrintAnnotation {
    String value() default "-";

    int number() default 15;
}
