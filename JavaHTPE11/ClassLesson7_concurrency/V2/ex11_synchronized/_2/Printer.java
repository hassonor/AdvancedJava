package JavaHTPE11.ClassLesson7_concurrency.V2.ex11_synchronized._2;

class Printer extends Thread {
    int counter = 0;
    boolean isJerry = false;
    MessageBox myBox;

    public Printer(MessageBox _BoxRef, boolean _IsJerry) {
        isJerry = _IsJerry;
        myBox = _BoxRef;
    }

    // Print the character
    public void run() {
        while (counter++ < 100) {
            if (isJerry)
                myBox.printJerry();
            else
                myBox.printGeorge();
        }
    }
} 
