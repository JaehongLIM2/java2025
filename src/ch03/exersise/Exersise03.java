package ch03.exersise;

public class Exersise03 {
    public static void main(String[] args) {
        // shift + f6 : 변수명 일괄 변경

        int pencils = 534;
        int students = 30;

        int pencilsPerStudents = (pencils / students);
        System.out.println("pencilsPerStudents = " + pencilsPerStudents);

        int pencilsLeft = (pencils % students);
        System.out.println("pencilsLeft = " + pencilsLeft);


    }
}
