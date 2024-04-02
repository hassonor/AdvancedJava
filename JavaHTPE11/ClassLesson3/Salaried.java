package JavaHTPE11.ClassLesson3;

public class Salaried extends Employee {
    public Salaried(String name, double salary) {
        super(name);  //!!!!!
        setSalary(salary);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override // why?
    public double pay() {
        if (salary < minSal())
            return minSal();
        else
            return salary;
    }

    public String toString() {
        return super.toString() + " (salary is " + salary + ")";
    }

    double salary;
} 