package JavaHTPE11.exam_practice.review.generics.T4;

public class Student implements Comparable<Student> {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student s) {
        return grade - s.grade;
    }

}
