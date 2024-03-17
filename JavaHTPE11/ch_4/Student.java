package JavaHTPE11.ch_4;

public class Student {
    private String name;
    private double average;

    public Student(String name, double average) {
        this.name = name;

        if (average > 0.0 && average <= 100) {
            this.average = average;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAverage(double studentAverage) {
        if (studentAverage > 0.0 && studentAverage <= 100) {
            this.average = studentAverage;
        }
    }

    public double getAverage() {
        return average;
    }

    public String getLetterGrade() {
        if (average >= 90.0) {
            return "A";
        } else if (average >= 80.0) {
            return "B";
        } else if (average >= 70.0) {
            return "C";
        } else if (average >= 60.0) {
            return "D";
        } else {
            return "F";
        }
    }
}
