package JavaHTPE11.ClassLesson2_oop_polymorphism.polymorphism.example2;

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
        return 5000;
    }

    public abstract double pay();

    @Override
    public String toString() {
        return "name is " + name;
    }

    private String name;
} 
  