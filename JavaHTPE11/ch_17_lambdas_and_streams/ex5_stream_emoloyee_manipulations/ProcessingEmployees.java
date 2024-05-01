package JavaHTPE11.ch_17_lambdas_and_streams.ex5_stream_emoloyee_manipulations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProcessingEmployees {
    public static void main(String[] args) {
        // initialize array of Employees
        Employee[] employees = {
                new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee("James", "Indigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("Jason", "Blue", 3200, "Sales"),
                new Employee("Wendy", "Brown", 4236.4, "Marketing")};

        // get List view of the employees
        List<Employee> employeeList = Arrays.asList(employees);

        // display all Employees
        System.out.println("Complete Employee list:");
        employeeList.stream().forEach(System.out::println);
        System.out.println();

        // Predicate that returns true for salaries in the range $4000-$6000
        Predicate<Employee> fourToSixThousand = e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);

        // Display Employees with salaries in the range $4000-$6000
        // sorted into ascending order by salary
        System.out.println("Employees earning $4000-$6000 per month sorted by salary:");
        employeeList.stream()
                .filter(fourToSixThousand)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

        // Display first Employee with salary in the range $4000-$6000
        employeeList.stream()
                .filter(fourToSixThousand)
                .findFirst()
                .ifPresent(employee -> System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n", employee));

        // Functions for getting first and last names from an Employee
        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;

        // Comparator for comparing Employees by first name then last name
        Comparator<Employee> lastThenFirst = Comparator.comparing(byLastName).thenComparing(byFirstName);

        // sort employees by last name, then first name (ASC)
        System.out.printf(
                "%nEmployees in ascending order by last name then first:%n");
        employeeList.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);

        // sort employees by last name, then first name (DESC)
        System.out.printf(
                "%nEmployees in descending order by last name then first:%n");
        employeeList.stream()
                .sorted(lastThenFirst.reversed())
                .forEach(System.out::println);

        // display unique employee last names sorted
        System.out.printf("%nUnique employee last names:%n");
        employeeList.stream()
                .map(Employee::getLastName)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        // display only first and last names
        System.out.printf("%nEmployee names in order by last name then first name:%n");
        employeeList.stream()
                .sorted(lastThenFirst)
                .map(Employee::getName)
                .forEach(System.out::println);

        // group Employees by department
        System.out.printf("%nEmployees by department:%n");
        Map<String, List<Employee>> groupedByDepartment =
                employeeList.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));
        groupedByDepartment.forEach((department, employeesInDepartment) -> {
            System.out.printf("%n%s%n", department);
            employeesInDepartment.forEach(
                    employee -> System.out.printf("    %s%n", employee));
        });

        // count number of EEmployees in each department
        System.out.printf("%nEmployee by department:%n");
        Map<String, Long> employeeCountByDepartment =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        employeeCountByDepartment.forEach(
                (department, count) -> {
                    System.out.printf(
                            "%s has %d employee(s)%n", department, count);
                }
        );

        // sum of Employee salaries with DoubleStream sum method
        System.out.printf(
                "%nSum of Employees' salaries (via sum method): %.2f%n",
                employeeList.stream().mapToDouble(Employee::getSalary).sum());

        // calculate sum of Employee salaries with Stream reduce method
        System.out.printf(
                "Sum of Employees' salaries (via reduce method): %.2f%n",
                employeeList.stream().mapToDouble(Employee::getSalary)
                        .reduce(0, (val1, val2) -> val1 + val2));

        // average of Employee salaries with DoubleStream average method
        System.out.printf(
                "Average of Employees' salaries: %.2f%n",
                employeeList.stream().mapToDouble(Employee::getSalary)
                        .average().getAsDouble());


    }
}
