package JavaHTPE11.ClassLesson7_concurrency.V2.ex11_synchronized._4;

class MessageBox {
    String fName, lName;


    public synchronized void printGeorge() {  // <==> synchronized(this)

        fName = "George ";
        lName = "Costanza \n";
        System.out.print(fName);
        System.out.print(lName + "\n");
    }

    public synchronized void printJerry() {// <==> synchronized(this)

        fName = "Jerry ";
        lName = "Seinfeld \n";
        System.out.print(fName);
        System.out.print(lName + "\n");

    }

    public void stamfunc() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
} 
