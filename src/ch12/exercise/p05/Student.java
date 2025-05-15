package ch12.exercise.p05;

import java.util.Objects;

public class Student {
    private String StudentNum;

    public Student(String studentNum) {
        this.StudentNum = studentNum;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(StudentNum, student.StudentNum);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(StudentNum);
    }
}
