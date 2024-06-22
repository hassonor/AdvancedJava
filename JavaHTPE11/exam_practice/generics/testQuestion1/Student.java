package JavaHTPE11.exam_practice.generics.testQuestion1;

public class Student implements Comparable<Student> {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {
        return grade - o.grade;
    }
}
