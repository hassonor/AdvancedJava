package JavaHTPE11.ClassLesson2.Polymorphism;

public class Employee {
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

    public double minSal()
    //protected double minSal()
    {
        return 5000;
    }

    public double pay() {
        return minSal();
    }

    public String toString() {
        return "name is " + name;
    }

    private String name;
} 
  