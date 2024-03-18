package JavaHTPE11.ch_8;

public class EmployeeTest {
    public static void main(String[] args) {
        Date birth = new Date(7, 24, 1949);
        Date hire = new Date(3, 12, 1988);

        Employee employee1 = new Employee("Or", "Hasson", birth, hire);
        Employee employee2 = new Employee("Hadar", "Cohen;", birth, hire);

        System.out.printf("%nEmployees after instantiation:%n");
        System.out.printf("via employee1.getCount(): %d%n", employee1.getCount());
        System.out.printf("via employee2.getCount(): %d%n", employee2.getCount());
        System.out.printf("via Employee.getCount(): %d%n", Employee.getCount());

        System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n", employee1.getFirstName(), employee1.getLastName(),
                employee2.getFirstName(), employee2.getLastName());
    }
}
