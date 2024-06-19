package JavaHTPE11.ClassLesson11_test_questions.testQuestion_generics.b;

public class Student implements Comparable<Student> {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student s) {
        if (grade == s.grade) return 0;
        else if (grade > s.grade) return 1;
        return -1;
    }

    public String toString() {
        return "name: " + name + " grade: " + grade;
    }
}
