package JavaHTPE11.ch_17_lambdas_and_streams.ex5_stream_emoloyee_manipulations;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private String department;

    // constructor
    public Employee(String firstName, String lastName,
                    double salary, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }

    // get firstName
    public String getFirstName() {
        return firstName;
    }

    // get lastName
    public String getLastName() {
        return lastName;
    }

    // get salary
    public double getSalary() {
        return salary;
    }

    // get department
    public String getDepartment() {
        return department;
    }

    // return Employee's first and last name combined
    public String getName() {
        return String.format("%s %s", getFirstName(), getLastName());
    }

    // return a String containing the Employee's information
    @Override
    public String toString() {
        return String.format("%-8s %-8s %8.2f   %s",
                getFirstName(), getLastName(), getSalary(), getDepartment());
    }
}
