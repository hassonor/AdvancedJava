package JavaHTPE11.exam_practice.exams.b2022_89.Q3;

public class Student implements Comparable<Student> {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;

    }

    @Override
    public int compareTo(Student o) {
        if (grade == o.grade) return 0;
        else if (grade >= o.grade) return 1;
        else return -1;
    }

    public String toString() {
        return "Student Name: " + name + "\n" + "Student Grade: " + grade;
    }
}
