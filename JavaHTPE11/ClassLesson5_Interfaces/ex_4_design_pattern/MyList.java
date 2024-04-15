package JavaHTPE11.ClassLesson5_Interfaces.ex_4_design_pattern;

import java.util.*;

class MyList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();    // Create a collection
        list.add(new Book("JAVA 2"));   // Add a new element
        list.add(new Book("Java Design Patterns"));
        list.add(new Book("EJB"));
        //list.add(new Emp(38,"38"));

        System.out.println("Second book on the list: " +
                ((Book) list.get(1)).getTitle());

        System.out.println("All books: ");
        // Go over the collection and print:
        Iterator it = list.iterator();
        while (it.hasNext()) {///!!!!!!! O (n)
            System.out.println(((Book) it.next()).getTitle());
        }
        System.out.println("====================================");
        for (int i = 0; i < list.size(); i++) {///!!!!!!! O (n^2)

            System.out.println(((Book) list.get(i)).getTitle());
        }

    }
}

