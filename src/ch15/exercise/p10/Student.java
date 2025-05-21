package ch15.exercise.p10;

public class Student implements Comparable<Student> {
    public String id;
    public Integer score;

    public Student(String id, Integer score) {
        this.id = id;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        return score - o.score;
    }
}
