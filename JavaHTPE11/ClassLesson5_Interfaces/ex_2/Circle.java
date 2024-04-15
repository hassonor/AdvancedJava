package JavaHTPE11.ClassLesson5_Interfaces.ex_2;// Fig. 9.29: Circle.java
// Definition of class Circle

public class Circle extends Point {  // inherits from Point
    protected double radius;

    // no-argument constructor
    public Circle() {
        // implicit call to superclass constructor here
        setRadius(0);
    }

    // constructor
    public Circle(double circleRadius, int xCoordinate,
                  int yCoordinate) {
        // call superclass constructor
        super(xCoordinate, yCoordinate);

        setRadius(circleRadius);
    }

    // set radius of Circle
    public void setRadius(double circleRadius) {
        radius = (circleRadius >= 0 ? circleRadius : 0);
    }

    // get radius of Circle
    public double getRadius() {
        return radius;
    }

    // calculate area of Circle
    public double area() {
        return Math.PI * radius * radius;
    }

    // convert Circle to a String represention
    public String toString() {
        return "Center = " + super.toString() +
                "; Radius = " + radius;
    }

    // return shape name
    public String getName() {
        return "Circle";
    }

}  // end class Circle


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
