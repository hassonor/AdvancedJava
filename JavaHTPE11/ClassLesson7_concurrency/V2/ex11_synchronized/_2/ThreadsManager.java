package JavaHTPE11.ClassLesson7_concurrency.V2.ex11_synchronized._2;

public class ThreadsManager {

    public static void main(String[] args) {
        MessageBox aBox = new MessageBox();

        // Print "Jerry":
        Printer jerry = new Printer(aBox, true);

        // Print "George":
        Printer george = new Printer(aBox, false);

        jerry.start();
        george.start();
    }
}  
