package ch11.lecture;

public class App11 {
    public static void main(String[] args) {

        try {
            Class.forName("java.lang.String");
            System.out.println("코드");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
