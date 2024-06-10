package JavaHTPE11.ClassLesson7_concurrency.V2.ex11_synchronized._2;

class MessageBox {
    String fName, lName;

    final String s = "locked";

    public void printGeorge() {

        synchronized (s) {
            fName = "George ";
            lName = "Costanza \n";

            System.out.print(fName);
            System.out.print(lName + "\n");
        }
    }

    public void printJerry() {
        synchronized (s) {
            fName = "Jerry ";
            lName = "Seinfeld \n";

            System.out.print(fName);
            System.out.print(lName + "\n");
        }
    }
} 
