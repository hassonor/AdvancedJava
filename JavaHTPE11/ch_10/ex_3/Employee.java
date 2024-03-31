package JavaHTPE11.ch_10.ex_3;

public abstract class Employee implements Payable {
    private final String firstName;
    private final String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    public abstract double earnings();

    // Implementing getPayAmount here enables the entire Employee
    // class hierarchy to be used in an app that processes Payable
    public double getPaymentAmount() {
        return earnings();
    }
}
