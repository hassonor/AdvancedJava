package JavaHTPE11.ClassLesson7_concurrency.V2.ex11_synchronized._3;

class MessageBox {
    String fName, lName;


    public void printGeorge() {

        synchronized (Sem.stamString) {
            fName = "George ";
            lName = "Costanza \n";
            System.out.print(fName);
            System.out.print(lName + "\n");

        }

    }

    public void printJerry() {
        synchronized (Sem.stamString) {
            fName = "Jerry ";
            lName = "Seinfeld \n";
            System.out.print(fName);
            System.out.print(lName + "\n");
        }
    }
} 
