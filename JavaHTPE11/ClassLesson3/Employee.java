package JavaHTPE11.ClassLesson3;

public abstract class Employee {
    public Employee(String name) {
        setName(name);
    }

    public String getName() {
        //  return new String(name);
        return name;
    }

    private void setName(String name) {
        this.name = new String(name);
    }

    //private double minSal()
    protected double minSal() {
        return 10;
    }

    public abstract double pay();

    public String toString() {
        return "name is " + name;
    }

    private void stamPrivate() {
        System.out.println("Employee.stamPrivate");
    }


    private String name;
} 
  