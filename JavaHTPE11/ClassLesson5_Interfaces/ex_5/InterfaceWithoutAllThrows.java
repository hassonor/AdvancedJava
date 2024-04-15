package JavaHTPE11.ClassLesson5_Interfaces.ex_5;

import java.io.*;

/**
 * This shows that a class implementing an interface need not
 * declare all the Throws that are declared in the interface.
 */
interface bar {
    public void foo() throws IOException;
}

class baz implements bar {
    @Override
    public void foo() {//throws IOException {
        // TODO Auto-generated method stub

    }

}


public class InterfaceWithoutAllThrows {

    public static void main(String[] argv) {
        (new baz()).foo();
    }
}
