package ch15.exercise.p08;

public class Student {
    public int sudentNum;
    public String name;

    public Student(int sudentNum, String name) {
        this.sudentNum = sudentNum;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return sudentNum == student.sudentNum;
    }

    @Override
    public int hashCode() {
        return sudentNum;
    }
}
