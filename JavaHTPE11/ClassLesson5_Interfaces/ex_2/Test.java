package JavaHTPE11.ClassLesson5_Interfaces.ex_2;// Fig. 9.31: Test.java
// Test Point, Circle, Cylinder hierarchy with interface Shape.

// Java core packages

import javax.swing.*;
import java.text.DecimalFormat;

public class Test {

    // test Shape hierarchy
    public static void main(String args[]) {
        // create shapes
        Point point = new Point(7, 11);
        Circle circle = new Circle(3.5, 22, 8);
        Cylinder cylinder = new Cylinder(10, 3.3, 10, 10);

        // create Shape array
        Shape arrayOfShapes[] = new Shape[3];

        // aim arrayOfShapes[ 0 ] at subclass Point object
        arrayOfShapes[0] = point;

        // aim arrayOfShapes[ 1 ] at subclass Circle object
        arrayOfShapes[1] = circle;

        // aim arrayOfShapes[ 2 ] at subclass Cylinder object
        arrayOfShapes[2] = cylinder;

        // get name and String representation of each shape
        String output =
                point.getName() + ": " + point.toString() + "\n" +
                        circle.getName() + ": " + circle.toString() + "\n" +
                        cylinder.getName() + ": " + cylinder.toString();

        DecimalFormat precision2 = new DecimalFormat("0.00");

        // loop through arrayOfShapes and get name,
        // area and volume of each shape in arrayOfShapes
        for (int i = 0; i < arrayOfShapes.length; i++) {
            output += "\n\n" + arrayOfShapes[i].getName() +
                    ": " + arrayOfShapes[i].toString() +
                    "\nArea = " +
                    precision2.format(arrayOfShapes[i].area()) +
                    "\nVolume = " +
                    precision2.format(arrayOfShapes[i].volume());
        }

        JOptionPane.showMessageDialog(null, output,
                "Demonstrating Polymorphism",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

}  // end class Test


/**************************************************************************
 * (C) Copyright 2002 by Deitel & Associates, Inc. and Prentice Hall.     *
 * All Rights Reserved.                                                   *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
