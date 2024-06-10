package JavaHTPE11.ClassLesson2_oop_polymorphism.Polymorphism;

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
        return salary;
    }

    public String toString() {
        return super.toString() + " (salary is " + salary + ")";
    }

    double salary;
} 