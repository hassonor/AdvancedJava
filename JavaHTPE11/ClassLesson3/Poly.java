package JavaHTPE11.ClassLesson3;

import java.util.ArrayList;

public class Poly {
    public static final int MAX_EMPLOYEES = 10;

    public static void nicePrint(Employee e) {
        System.out.println("employee:  " + e);
        System.out.println("pay:  " + e.pay());
        System.out.println();
    }

    public static void main(String[] args) {


        ArrayList<Employee> list = new ArrayList<Employee>();


        list.add(new Hourly("George Jones", 75.00, 2.5));
        list.add(new Salaried("Dolly Parton", 125.00));
        list.add(new Hourly("Willie Nelson", 85.00, 3.0));
        list.add(new Salaried("Jim Reeves", 150.00));
        list.add(new Hourly("Tammy Wynette", 65.00, 2.0));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).pay());


        }
    }
}