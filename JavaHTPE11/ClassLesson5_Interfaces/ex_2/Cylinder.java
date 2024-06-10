package JavaHTPE11.ClassLesson5_Interfaces.ex_2;// Fig. 9.30: Cylinder.java
// Definition of class Cylinder.

public class Cylinder extends Circle {
    protected double height;  // height of Cylinder


    // no-argument constructor
    public Cylinder() {
        // implicit call to superclass constructor here
        setHeight(0);
    }

    // constructor
    public Cylinder(double cylinderHeight,
                    double cylinderRadius, int xCoordinate,
                    int yCoordinate) {
        // call superclass constructor
        super(cylinderRadius, xCoordinate, yCoordinate);

        setHeight(cylinderHeight);
    }

    // set height of Cylinder
    public void setHeight(double cylinderHeight) {
        height = (cylinderHeight >= 0 ? cylinderHeight : 0);
    }

    // get height of Cylinder
    public double getHeight() {
        return height;
    }

    // calculate area of Cylinder (i.e., surface area)
    public double area() {
        return 2 * super.area() + 2 * Math.PI * radius * height;
    }

    // calculate volume of Cylinder
    public double volume() {
        return super.area() * height;
    }

    // convert Cylinder to a String representation
    public String toString() {
        return super.toString() + "; Height = " + height;
    }

    // return shape name
    public String getName() {
        return "Cylinder";
    }

}  // end class Cylinder

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
