package JavaHTPE11.ClassLesson7_concurrency.V2.ex11_synchronized._3;

public class ThreadsManager {

    public static void main(String[] args) {
        MessageBox aBox = new MessageBox();
        MessageBox bBox = new MessageBox();

        // Print "Jerry":
        Printer jerry = new Printer(aBox, true);

        // Print "George":
        Printer george = new Printer(bBox, false);

        jerry.start();
        george.start();
    }
}  
