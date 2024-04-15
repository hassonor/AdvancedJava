package JavaHTPE11.ClassLesson5_Interfaces.ex_3;

public class Employee implements Comparable {
    public Employee(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setAge(int age2) {
        // TODO Auto-generated method stub

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

    public double pay() {
        return minSal();
    }

    public String toString() {
        return "name is " + name;
    }

    private String name;

    int age;
    Object o = new Object();

    @Override

    public int compareTo(Object arg0) {
        if (this.get_age() > ((Employee) arg0).get_age())
            return 1;
        else if (this.get_age() < ((Employee) arg0).get_age())
            return -1;
        else
            return 0;


    }

    private int get_age() {
        // TODO Auto-generated method stub
        return age;
    }
} 
