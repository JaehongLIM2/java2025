package ch17.sec07.exam01;

public class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(score, o.score);
    }

    @Override
    public String toString() {
        return name + " : " + score;
    }
}
