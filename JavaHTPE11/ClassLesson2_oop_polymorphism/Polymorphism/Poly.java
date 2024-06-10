package JavaHTPE11.ClassLesson2_oop_polymorphism.Polymorphism;

public class Poly {
    public static final int MAX_EMPLOYEES = 10;

    public static void nicePrint(Employee e) {
        System.out.println("employee:  " + e);
        System.out.println("pay:  " + e.pay());
        System.out.println();
    }

    public static void main(String[] args) {

        Employee e = new Hourly("Roy", 10000, 22);
//      System.out.println(((Object)e).toString());
//      System.out.println(((Object)e).toString());


        Employee[] employees = new Employee[MAX_EMPLOYEES];

        int emp = 0;
        employees[emp++] = new Hourly("George Jones", 75.00, 2.5);
        employees[emp++] = new Salaried("Dolly Parton", 125.00);
        employees[emp++] = new Hourly("Willie Nelson", 85.00, 3.0);
        employees[emp++] = new Salaried("Jim Reeves", 150.00);
        employees[emp++] = new Hourly("Tammy Wynette", 65.00, 2.0);
        employees[emp++] = new Manager("ssss");
        //1
        for (int i = 0; i < emp; ++i) {
            System.out.println("employee:  " + employees[i]);
            System.out.println("pay:  " + employees[i].pay());
            System.out.println("-----------------------");
        }

        System.out.println("-----------------------");
        System.out.println("-----------------------");
        System.out.println("-----------------------");
        //2
        for (int i = 0; i < emp; ++i) {
            nicePrint(employees[i]);
        }
    }
}