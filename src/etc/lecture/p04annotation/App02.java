package etc.lecture.p04annotation;

@MyAnnotation02
public class App02 {

    @MyAnnotation02
    private String name;

    @MyAnnotation02
    public App02() {
    }

    @MyAnnotation02
    public String getName() {
        @MyAnnotation02
        int v1 = 3;

        return name;
    }

    @MyAnnotation02
    public void setName(String name) {
        this.name = name;
    }

}

@interface MyAnnotation02 {

}